package com.nabobery.sdkgen.engine.declarations

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.nabobery.sdkgen.engine.config.RetryDefaults
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Path
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StripeFormProjectionInventoryTest {
    @Test
    fun `every pinned Stripe form operation is projected or source linked diagnosed`() {
        val stripeFile = Path.of(requireNotNull(System.getProperty("engine.stripeFile")))
        val rawRoot = ObjectMapper().readTree(stripeFile.toFile())
        val rawFormIdentities = rawFormOperations(rawRoot).associateBy(RawFormOperation::identity)
        val document = SemanticAdapter().adapt(stripeFile).document
        val adaptedFormIdentities =
            document.operations
                .filter { operation ->
                    operation.requestBody?.content.orEmpty().any { content ->
                        content.mediaType.equals(FORM_MEDIA_TYPE, ignoreCase = true)
                    }
                }.associateBy { operation ->
                    "${operation.method.lowercase()}|${operation.path}|${operation.operationId}"
                }
        assertEquals(rawFormIdentities.keys, adaptedFormIdentities.keys)
        val formOperationIds =
            document.operations
                .filter { operation ->
                    operation.requestBody?.content.orEmpty().any { content ->
                        content.mediaType.equals(FORM_MEDIA_TYPE, ignoreCase = true)
                    }
                }.map { operation -> "operation:${operation.operationId}" }
                .toSet()
        val mapping =
            StandardProjection().project(
                DeclarationProjectionRequest(
                    document = document,
                    packageName = "com.example.stripe",
                    canonicalDocumentUri = document.documentUri,
                    clientName = "StripeClient",
                    runtimeDefaults = RuntimeDefaults(retries = RetryDefaults(maxAttempts = 3)),
                ),
            )
        val projectedDeclarations =
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .filter { declaration -> declaration.symbolId in formOperationIds }
        val projected = projectedDeclarations.mapTo(mutableSetOf(), OperationDeclaration::symbolId)
        val diagnosed =
            mapping.diagnostics
                .filter { diagnostic ->
                    diagnostic.severity == DiagnosticSeverity.ERROR && diagnostic.symbolId in formOperationIds
                }.map(GenerationDiagnostic::symbolId)
                .toSet()

        assertEquals(586, formOperationIds.size)
        assertEquals(429, projected.size)
        assertEquals(157, diagnosed.size)
        assertTrue(projected.intersect(diagnosed).isEmpty())
        assertEquals(formOperationIds, projected + diagnosed)
        projectedDeclarations.forEach { declaration ->
            val identity = "${declaration.method.lowercase()}|${declaration.path}|${declaration.operationIdentity}"
            val rawPaths = rawFormIdentities.getValue(identity).propertyPaths
            val declaredPaths =
                declaration.requestBodyAlternatives
                    .single { alternative -> alternative.mediaType.equals(FORM_MEDIA_TYPE, ignoreCase = true) }
                    .formFields
                    .flatMap { field -> field.propertyPaths() }
                    .toSet()
            assertEquals(rawPaths, declaredPaths, identity)
        }
        mapping.diagnostics
            .filter { diagnostic -> diagnostic.symbolId in diagnosed }
            .forEach { diagnostic ->
                assertTrue(diagnostic.source.documentUri.isNotBlank())
                assertTrue(diagnostic.source.jsonPointer.isNotBlank())
            }
    }

    private fun rawFormOperations(root: JsonNode): List<RawFormOperation> =
        root.path("paths").properties().flatMap { (path, pathItem) ->
            HTTP_METHODS.mapNotNull { method ->
                val operation = pathItem.get(method) ?: return@mapNotNull null
                val form = operation.path("requestBody").path("content").get(FORM_MEDIA_TYPE) ?: return@mapNotNull null
                RawFormOperation(
                    identity = "$method|$path|${operation.path("operationId").textValue()}",
                    propertyPaths = form.path("schema").path("properties").propertyPaths(),
                )
            }
        }

    private fun JsonNode.propertyPaths(prefix: String = ""): Set<String> =
        properties().flatMapTo(mutableSetOf()) { (name, schema) ->
            val path = if (prefix.isEmpty()) name else "$prefix.$name"
            setOf(path) + schema.path("properties").propertyPaths(path)
        }

    private fun FormFieldDeclaration.propertyPaths(prefix: String = ""): Set<String> {
        val path = if (prefix.isEmpty()) wireName else "$prefix.$wireName"
        val nested = (value as? FormValueDeclaration.Object)?.fields.orEmpty()
        return setOf(path) + nested.flatMap { field -> field.propertyPaths(path) }
    }

    private data class RawFormOperation(
        val identity: String,
        val propertyPaths: Set<String>,
    )

    private companion object {
        const val FORM_MEDIA_TYPE = "application/x-www-form-urlencoded"
        val HTTP_METHODS = listOf("get", "put", "post", "delete", "options", "head", "patch", "trace")
    }
}
