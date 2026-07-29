@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.AcceptedWaiverConfig
import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.OverlayConfig
import com.nabobery.sdkgen.engine.config.OverlayConflictPolicy
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.ZeroMatchPolicy
import com.nabobery.sdkgen.engine.declarations.DeclarationProjection
import com.nabobery.sdkgen.engine.declarations.GenerationExclusion
import com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.model.PaginationModel
import com.nabobery.sdkgen.model.SecuritySchemeKind
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.openapi.SemanticAdapter
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue

class GitHubConformanceGenerationTest {
    @Test
    fun codeSearchOverlayAddsOnlyPinnedAuthenticationAndHeaderPaginationContract() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.githubFile")))
        val sourceBefore = sourcePath.readBytes()
        val overlayPath = sourcePath.parent.resolve("overlays/code-search-runtime-semantics.yaml")
        val overlayBytes = overlayPath.readBytes()
        val config = config()

        assertEquals(
            listOf(
                OverlayConfig(
                    id = "github-code-search-runtime-semantics",
                    uri = "overlays/code-search-runtime-semantics.yaml",
                    sha256 = CODE_SEARCH_OVERLAY_SHA256,
                    zeroMatchPolicy = ZeroMatchPolicy.FAIL,
                    conflictPolicy = OverlayConflictPolicy.FAIL,
                ),
            ),
            config.overlays,
        )
        assertEquals(CODE_SEARCH_OVERLAY_SHA256, overlayBytes.sha256())

        val effective =
            OverlayApplicator().apply(
                sourceBefore,
                listOf(OverlayInput("github-code-search-runtime-semantics", overlayBytes)),
            )

        assertEquals(2, effective.actions.size)
        assertEquals("update", effective.actions[0].kind)
        assertEquals("$['components']", effective.actions[0].target)
        assertEquals(listOf("/components"), effective.actions[0].matchedPointers)
        assertEquals("update", effective.actions[1].kind)
        assertEquals("$['paths']['/search/code']['get']", effective.actions[1].target)
        assertEquals(listOf("/paths/~1search~1code/get"), effective.actions[1].matchedPointers)

        assertEquals("http", effective.document.at("/components/securitySchemes/githubBearer/type").asText())
        assertEquals("bearer", effective.document.at("/components/securitySchemes/githubBearer/scheme").asText())
        assertEquals(1, effective.document.at("/paths/~1search~1code/get/security").size())
        assertTrue(effective.document.at("/paths/~1search~1code/get/security/0/githubBearer").isArray)
        assertEquals(
            "headerNextUrl",
            effective.document.at("/paths/~1search~1code/get/x-sdkgen-pagination/style").asText(),
        )
        assertEquals(
            "/items",
            effective.document.at("/paths/~1search~1code/get/x-sdkgen-pagination/responseItems").asText(),
        )
        assertTrue(
            effective.changes
                .filter { change -> change.pointer.startsWith("/paths/") }
                .all { change ->
                    change.pointer.startsWith("/paths/~1search~1code/get/security") ||
                        change.pointer.startsWith("/paths/~1search~1code/get/x-sdkgen-pagination")
                },
        )
        assertEquals(sourceBefore.toList(), sourcePath.readBytes().toList())
        assertEquals(SOURCE_SHA256, sourceBefore.sha256())

        val effectivePath = Files.createTempFile("github-code-search-effective", ".json")
        try {
            Files.writeString(effectivePath, effective.document.toString())
            val semantic = SemanticAdapter().adapt(effectivePath, CANONICAL_URI).document
            val codeSearch = semantic.operations.single { operation -> operation.operationId == "search/code" }
            val pagination = assertIs<PaginationModel.HeaderNextUrl>(codeSearch.pagination)

            assertEquals(listOf("items"), pagination.responseItems.segments)
            assertEquals(mapOf("githubBearer" to emptyList()), codeSearch.securityAlternatives.single().schemes)
            assertFalse(codeSearch.securityAlternatives.single().anonymous)
            assertEquals(SecuritySchemeKind.HTTP, semantic.securitySchemes.getValue("githubBearer").kind)
            assertEquals("bearer", semantic.securitySchemes.getValue("githubBearer").scheme)
            val successResponse = codeSearch.responses.single { response -> response.selector == "200" }
            val successContent = successResponse.content.single()
            val responseSchemaId = successContent.schema!!.schemaId
            val responseSchema = semantic.schemas.getValue(responseSchemaId)
            val itemsProperty = responseSchema.properties.single { property -> property.name == "items" }
            val itemsSchema = semantic.schemas.getValue(itemsProperty.schema.schemaId)
            assertEquals(
                "$CANONICAL_URI#/components/schemas/code-search-result-item",
                itemsSchema.items!!.schemaId.value,
            )
            val releases = semantic.operations.single { operation -> operation.operationId == "repos/list-releases" }
            assertEquals(null, releases.pagination)
        } finally {
            Files.deleteIfExists(effectivePath)
        }
    }

    @Test
    fun corpusWaiversExactlyCoverCurrentGitHubExclusionsAndGenerationSucceeds() {
        val source = source()
        val config = config()
        val frozen = frozenInventory()
        val delta = readConformanceExclusionDelta("engine.githubExclusionDelta")
        val pipeline = GenerationPipeline("sdkgen-maintainers")

        val baseline = pipeline.validate(config.copy(acceptedWaivers = emptyList()), source, overlays())
        // 139 after ADR-0016 reclaimed the 18 primitive-union parameter operations, down from 157. Those 18
        // were the only exclusions the corpus ledger did not cover, so the exclusion set and the ledger's 139
        // accepted waivers now coincide exactly — which is what made the corpus regenerable.
        assertEquals(139, baseline.exclusions.size)
        assertEquals(mapOf("schema" to 99, "operation" to 40), baseline.exclusions.countByKind())
        assertEquals(
            frozen.map(FrozenExclusion::identity).toSet(),
            baseline.exclusions
                .filterNot { exclusion -> exclusion.conformanceIdentity() in delta.map { it.identity() }.toSet() }
                .map(::identity)
                .toSet(),
        )
        // The parity delta — the exclusions beyond the frozen inventory — was exactly the 18 primitive-union
        // parameter operations, and ADR-0016 reclaimed every one. The delta TSV is a dated record and is
        // deliberately not regenerated, so it is asserted against its own content plus the fact that nothing
        // it lists is excluded any more.
        assertEquals(
            mapOf("parameter-form-nonprimitive" to 10, "parameter-path-nonscalar" to 8),
            delta.groupingBy(ConformanceExclusionDeltaRow::category).eachCount(),
        )
        assertEquals(18, delta.size)
        assertEquals(
            emptySet(),
            baseline.exclusions.map(GenerationExclusionView::conformanceIdentity).toSet() -
                frozen
                    .map(FrozenExclusion::identity)
                    .map {
                        ConformanceExclusionIdentity(it.symbolId, it.jsonPointer, it.reason)
                    }.toSet(),
            "no exclusion may exist beyond the frozen inventory: the corpus ledger must cover the set exactly",
        )
        assertEquals(frozen.map { row -> row.configEntry() }.toSet(), config.acceptedWaivers.map(::configEntry).toSet())

        val validation = pipeline.validate(config, source, overlays())
        assertEquals(
            emptySet(),
            validation.exclusions.map(GenerationExclusionView::conformanceIdentity).toSet(),
            "with the corpus waivers applied no exclusion may survive, which is what makes it regenerable",
        )
        assertEquals(
            frozen.associateBy(FrozenExclusion::waiverId),
            validation.acceptedWaivers.map(::frozen).associateBy(FrozenExclusion::waiverId),
        )

        // Before ADR-0016 this asserted that generation stayed BLOCKED even with the corpus's own waivers
        // applied, because the 18 primitive-union parameter operations had no waiver and none was written for
        // them. That is exactly the condition that made the committed snapshot unreproducible (L13/L10), so
        // the assertion is now inverted: the corpus generates.
        val outputRoot = Files.createTempDirectory("github-conformance-waived")
        try {
            val output = outputRoot.resolve("current")
            pipeline.generate(config, source, overlays(), output)
        } finally {
            outputRoot.toFile().deleteRecursively()
        }
    }

    private fun assertMissingWaiverBlocks(
        pipeline: GenerationPipeline,
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
    ) {
        val missing = config.copy(acceptedWaivers = config.acceptedWaivers.drop(1))
        val validation = pipeline.validate(missing, source, overlays())
        assertEquals(1, validation.exclusions.size)

        val output = Files.createTempDirectory("github-conformance-missing").resolve("current")
        try {
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(missing, source, overlays(), output)
            }
        } finally {
            output.parent.toFile().deleteRecursively()
        }
    }

    private fun assertSelectorDriftIsStale(
        pipeline: GenerationPipeline,
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
    ) {
        val first = config.acceptedWaivers.first()
        listOf(
            first.copy(match = first.match.copy(jsonPointer = "${first.match.jsonPointer}/stale")),
            first.copy(match = first.match.copy(reasonSha256 = "0".repeat(64))),
        ).forEach { staleWaiver ->
            val validation =
                pipeline.validate(
                    config.copy(acceptedWaivers = config.acceptedWaivers.drop(1) + staleWaiver),
                    source,
                    overlays(),
                )
            assertEquals(1, validation.exclusions.size)
            assertTrue(validation.diagnostics.any { diagnostic -> diagnostic.code == "SDKGEN-WAIVER-STALE" })
        }
    }

    private fun assertReasonDriftIsStale(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
    ) {
        val target = config.acceptedWaivers.first { waiver -> waiver.match.kind.name == "SCHEMA" }
        val pipeline =
            GenerationPipeline(
                "sdkgen-maintainers",
                projection =
                    DeclarationProjection { request ->
                        StandardProjection().project(request).let { mapping ->
                            mapping.copy(
                                exclusions =
                                    mapping.exclusions.map { exclusion ->
                                        if (exclusion.symbolId == target.match.symbolId) {
                                            exclusion.copy(reason = "${exclusion.reason} [changed]")
                                        } else {
                                            exclusion
                                        }
                                    },
                            )
                        }
                    },
            )

        val validation = pipeline.validate(config, source, overlays())
        assertTrue(validation.diagnostics.any { diagnostic -> diagnostic.code == "SDKGEN-WAIVER-STALE" })
        assertTrue(validation.exclusions.any { exclusion -> exclusion.symbolId == target.match.symbolId })
    }

    private fun assertNewExclusionBlocks(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
    ) {
        val pipeline =
            GenerationPipeline(
                "sdkgen-maintainers",
                projection =
                    DeclarationProjection { request ->
                        StandardProjection().project(request).let { mapping ->
                            mapping.copy(
                                exclusions =
                                    mapping.exclusions +
                                        GenerationExclusion(
                                            kind = GenerationExclusionKind.SCHEMA,
                                            symbolId = "schema:GitHubInjectedNewExclusion",
                                            diagnosticCode = "SDKGEN-TEST-INJECTED",
                                            reason = "Injected exclusion must require a reviewed waiver.",
                                            source = request.document.source,
                                        ),
                            )
                        }
                    },
            )
        val validation = pipeline.validate(config, source, overlays())
        assertEquals(listOf("schema:GitHubInjectedNewExclusion"), validation.exclusions.map { it.symbolId })

        val output = Files.createTempDirectory("github-conformance-new").resolve("current")
        try {
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(config, source, overlays(), output)
            }
        } finally {
            output.parent.toFile().deleteRecursively()
        }
    }

    private fun assertManifestWaivers(
        manifest: Path,
        accepted: List<AcceptedWaiverView>,
    ) {
        val actual =
            Json
                .parseToJsonElement(manifest.readText())
                .jsonObject
                .getValue("acceptedWaivers")
                .jsonArray
                .associate { entry ->
                    val value = entry.jsonObject
                    value.getValue("id").jsonPrimitive.content to
                        FrozenExclusion(
                            kind = value.getValue("kind").jsonPrimitive.content,
                            symbolId = value.getValue("symbolId").jsonPrimitive.content,
                            diagnosticCode = value.getValue("diagnosticCode").jsonPrimitive.content,
                            documentUri =
                                value
                                    .getValue(
                                        "source",
                                    ).jsonObject
                                    .getValue("documentUri")
                                    .jsonPrimitive.content,
                            jsonPointer =
                                value
                                    .getValue(
                                        "source",
                                    ).jsonObject
                                    .getValue("jsonPointer")
                                    .jsonPrimitive.content,
                            reason = value.getValue("reason").jsonPrimitive.content,
                            reasonSha256 = value.getValue("reasonSha256").jsonPrimitive.content,
                            category = value.getValue("category").jsonPrimitive.content,
                            waiverId = value.getValue("id").jsonPrimitive.content,
                            rationale = value.getValue("rationale").jsonPrimitive.content,
                            owner = value.getValue("owner").jsonPrimitive.content,
                            disposition = value.getValue("disposition").jsonPrimitive.content,
                        )
                }
        assertEquals(accepted.map(::frozen).associateBy(FrozenExclusion::waiverId), actual)
    }

    private fun assertGeneratedSearchCodeContract(output: Path) {
        val source = output.resolve("com/nabobery/sdkgen/github/generated/search/SearchClient.kt").readText()

        assertTrue(source.contains("public suspend fun searchCode("))
        assertTrue(
            source.contains(
                "): Page<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem> {",
            ),
        )
        assertTrue(source.contains("public fun searchCodePages("))
        assertTrue(
            source.contains(
                "): Flow<Page<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem>> =",
            ),
        )
        assertTrue(source.contains("public fun searchCodeItems("))
        assertTrue(source.contains("): Flow<CodeSearchResultItem> ="))
        assertTrue(source.contains("\"githubBearer\" to SecurityScheme.HttpBearer()"))
        assertTrue(source.contains("SecuritySchemeRef(schemeId = \"githubBearer\", scopes = emptyList())"))
        assertTrue(source.contains("PaginationDescriptor.HeaderNextUrl(responseItemsPath = PropertyPath(\"items\"))"))
    }

    private fun assertGeneratedSourcesAreClosed(
        output: Path,
        result: GenerationResult,
        retainedOperations: Int,
    ) {
        val outputRoot = output.toRealPath()
        var sourceCount = 0
        var containsAny = false
        var containsUncheckedCastSuppression = false
        var containsEmptyFacade = false
        Files.walk(outputRoot).use { paths ->
            paths.filter { path -> path.toString().endsWith(".kt") }.forEach { path ->
                sourceCount += 1
                val source = path.readText()
                containsAny = containsAny || Regex("<Any\\b|, Any\\b|Any\\?\\b").containsMatchIn(source)
                containsUncheckedCastSuppression =
                    containsUncheckedCastSuppression || "@Suppress(\"UNCHECKED_CAST\")" in source
                containsEmptyFacade =
                    containsEmptyFacade ||
                    (
                        outputRoot.relativize(path).toString().endsWith("Client.kt") &&
                            !source.contains("OperationMetadata") &&
                            !source.contains("public val")
                    )
            }
        }
        assertEquals(result.generatedFiles, sourceCount)
        assertTrue(retainedOperations > 0)
        assertFalse(containsAny)
        assertFalse(containsUncheckedCastSuppression)
        assertFalse(containsEmptyFacade)
    }

    private fun source(): ResolvedSource {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.githubFile")))
        val bytes = sourcePath.readBytes()
        return ResolvedSource(sourcePath, CANONICAL_URI, bytes.sha256(), bytes.size.toLong())
    }

    private fun config(): SdkgenConfigV1Alpha1 {
        val file = Path.of(requireNotNull(System.getProperty("engine.t10GitHubConfig")))
        return ConfigLoader.decodeYaml(file.readText(), file.toString())
    }

    private fun overlays(): List<ResolvedGenerationOverlay> {
        val path = source().path.parent.resolve("overlays/code-search-runtime-semantics.yaml")
        val bytes = path.readBytes()
        return listOf(
            ResolvedGenerationOverlay(
                id = "github-code-search-runtime-semantics",
                path = path,
                canonicalUri = "sdkgen://overlay/github-code-search-runtime-semantics",
                sha256 = bytes.sha256(),
            ),
        )
    }

    private fun frozenInventory(): List<FrozenExclusion> {
        val inventory = Path.of(requireNotNull(System.getProperty("engine.t10GitHubBlockerInventory")))
        val lines =
            inventory
                .readText()
                .lineSequence()
                .filter(String::isNotBlank)
                .toList()
        val header = lines.first().split('\t')
        assertEquals(FROZEN_HEADER, header)
        return lines
            .drop(1)
            .map { line ->
                val values = line.split('\t')
                assertEquals(FROZEN_HEADER.size, values.size)
                FrozenExclusion(
                    kind = values[0],
                    symbolId = values[1],
                    diagnosticCode = values[2],
                    documentUri = values[3],
                    jsonPointer = values[4],
                    reason = values[5],
                    reasonSha256 = values[6],
                    category = values[7],
                    waiverId = values[8],
                    rationale = values[9],
                    owner = values[10],
                    disposition = values[11],
                )
            }.also { rows ->
                assertEquals(139, rows.size)
                assertEquals(139, rows.map(FrozenExclusion::waiverId).toSet().size)
            }
    }

    private fun identity(exclusion: GenerationExclusionView): ExclusionIdentity =
        ExclusionIdentity(
            kind = exclusion.kind.name.lowercase(),
            symbolId = exclusion.symbolId,
            diagnosticCode = exclusion.diagnosticCode,
            documentUri = exclusion.documentUri,
            jsonPointer = exclusion.jsonPointer,
            reason = exclusion.reason,
            reasonSha256 = exclusion.reasonSha256,
        )

    private fun frozen(waiver: AcceptedWaiverView): FrozenExclusion =
        FrozenExclusion(
            kind = waiver.kind.name.lowercase(),
            symbolId = waiver.symbolId,
            diagnosticCode = waiver.diagnosticCode,
            documentUri = waiver.documentUri,
            jsonPointer = waiver.jsonPointer,
            reason = waiver.reason,
            reasonSha256 = waiver.reasonSha256,
            category = waiver.category,
            waiverId = waiver.id,
            rationale = waiver.rationale,
            owner = waiver.owner,
            disposition = waiver.disposition,
        )

    private fun configEntry(waiver: AcceptedWaiverConfig): ConfigEntry =
        ConfigEntry(
            kind =
                waiver.match.kind.name
                    .lowercase(),
            symbolId = waiver.match.symbolId,
            diagnosticCode = waiver.match.diagnosticCode,
            documentUri = waiver.match.documentUri,
            jsonPointer = waiver.match.jsonPointer,
            reasonSha256 = waiver.match.reasonSha256,
            category = waiver.category,
            waiverId = waiver.id,
            rationale = waiver.rationale,
            owner = waiver.owner,
            disposition = waiver.disposition.name.lowercase(),
        )

    private fun FrozenExclusion.configEntry(): ConfigEntry =
        ConfigEntry(
            kind = kind,
            symbolId = symbolId,
            diagnosticCode = diagnosticCode,
            documentUri = documentUri,
            jsonPointer = jsonPointer,
            reasonSha256 = reasonSha256,
            category = category,
            waiverId = waiverId,
            rationale = rationale,
            owner = owner,
            disposition = disposition,
        )

    private fun List<GenerationExclusionView>.countByKind(): Map<String, Int> =
        groupingBy { exclusion -> exclusion.kind.name.lowercase() }.eachCount()

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }

    private data class ExclusionIdentity(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reason: String,
        val reasonSha256: String,
    )

    private data class ConfigEntry(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reasonSha256: String,
        val category: String,
        val waiverId: String,
        val rationale: String,
        val owner: String,
        val disposition: String,
    )

    private data class FrozenExclusion(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reason: String,
        val reasonSha256: String,
        val category: String,
        val waiverId: String,
        val rationale: String,
        val owner: String,
        val disposition: String,
    ) {
        fun identity(): ExclusionIdentity =
            ExclusionIdentity(kind, symbolId, diagnosticCode, documentUri, jsonPointer, reason, reasonSha256)
    }

    private companion object {
        const val CANONICAL_URI = "sdkgen://source/openapi.yaml"
        const val SOURCE_SHA256 = "350102b39f8575f9ef0eb7db96fc2f80f5cbfefbfbaf64d243bc696348d00b63"
        const val CODE_SEARCH_OVERLAY_SHA256 = "4bb4eb28ee5b424cea50c9ea92047ed35e49282273800ab7e1ab4cd83b083288"
        val FROZEN_HEADER =
            listOf(
                "kind",
                "symbolId",
                "diagnosticCode",
                "documentUri",
                "jsonPointer",
                "reason",
                "reasonSha256",
                "category",
                "waiverId",
                "rationale",
                "owner",
                "disposition",
            )
    }
}
