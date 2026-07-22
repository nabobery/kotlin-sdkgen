@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.model

/**
 * Renders a [SemanticDocument] to a deterministic, human-diffable text form used as the golden
 * snapshot format for adaptation tests.
 *
 * Determinism contract: [render] is a pure function of its argument's *value* — two
 * [SemanticDocument] instances that are `equal` always render to byte-identical output,
 * regardless of map/collection iteration order in the input, and the output never has a trailing
 * whitespace fragment (every appended line ends with `\n` via [StringBuilder.appendLine], and
 * there is no final unterminated line). Callers relying on the output for snapshot comparison can
 * therefore compare rendered text directly rather than parsing it back into a document.
 */
public object SnapshotRenderer {
    public fun render(document: SemanticDocument): String =
        buildString {
            appendLine("document ${document.documentUri}")
            appendLine("title ${quoted(document.title)}")
            appendLine("version ${quoted(document.version)}")
            document.sourceDocuments.forEach { sourceDocument ->
                appendLine(
                    "sourceDocument ${sourceDocument.canonicalUri} sha256=${sourceDocument.sha256} " +
                        "bytes=${sourceDocument.contentLength} policy=${sourceDocument.acquisitionPolicy} " +
                        "@${sourceDocument.source.render()}",
                )
            }
            appendLine("source ${document.source.render()}")
            appendLine("extensions ${document.extensions.renderMap()}")
            appendLine(
                document.securityAlternatives.joinToString(
                    separator = " |",
                    prefix = "security",
                ) { " " + it.schemes.renderScopes() + if (it.anonymous) " anonymous" else "" },
            )
            appendLine("schemas ${document.schemas.size}")
            document.schemas.values.sortedBy { it.id.value }.forEach { schema ->
                renderSchema(schema)
            }
            appendLine("operations ${document.operations.size}")
            document.operations.forEach { operation ->
                appendLine(
                    "operation ${operation.method} ${operation.path} id=${operation.operationId} deprecated=${operation.deprecated} @${operation.source.render()}",
                )
                appendLine("  description ${quoted(operation.description)}")
                operation.parameters.forEach { parameter ->
                    appendLine(
                        "  parameter ${parameter.location}:${parameter.name} ${parameter.requiredness}/${parameter.schema?.schemaId} style=${parameter.style} explode=${parameter.explode} @${parameter.source.render()}",
                    )
                }
                operation.requestBody?.let { body ->
                    appendLine("  request ${body.requiredness} @${body.source.render()}")
                    body.content.forEach { media -> appendLine("    ${media.render()}") }
                }
                operation.responses.forEach { response ->
                    appendLine("  response ${response.selectorKind}:${response.selector} @${response.source.render()}")
                    response.headers.forEach { header ->
                        appendLine(
                            "    header ${header.name} ${header.requiredness} schema=${header.schema?.schemaId} @${header.source.render()}",
                        )
                    }
                    response.content.forEach { media -> appendLine("    ${media.render()}") }
                }
                operation.securityAlternatives.forEach { security ->
                    appendLine(
                        "  security ${security.schemes.renderScopes()} anonymous=${security.anonymous} @${security.source.render()}",
                    )
                }
                operation.pagination?.let { appendLine("  pagination $it") }
                operation.streaming?.let { appendLine("  streaming $it") }
                operation.idempotency?.let { appendLine("  idempotency $it") }
                appendLine("  extensions ${operation.extensions.renderMap()}")
            }
            appendLine("diagnostics ${document.diagnostics.size}")
            document.diagnostics.forEach { diagnostic ->
                appendLine(
                    "diagnostic ${diagnostic.severity}:${diagnostic.code} phase=${diagnostic.phase} " +
                        "message=${quoted(
                            diagnostic.message,
                        )} remediation=${quoted(diagnostic.remediation)} @${diagnostic.source.render()}",
                )
            }
        }

    private fun StringBuilder.renderSchema(schema: SchemaModel) {
        appendLine("schema ${schema.id} ${schema.identityKind} @${schema.source.render()}")
        appendLine("  reference ${schema.referenceTarget ?: "-"}")
        appendLine(
            "  types ${schema.types.joinToString(
                ",",
            )} nullability=${schema.nullability} format=${schema.format ?: "-"}",
        )
        val syntheticNullBranch = schema.acceptsOnlyNull && "x-sdkgen-normalized-null-branch" in schema.id.value
        if (syntheticNullBranch || schema.contentEncoding != null || schema.contentMediaType != null) {
            appendLine(
                "  normalized nullOnly=${schema.acceptsOnlyNull} contentEncoding=${schema.contentEncoding ?: "-"} " +
                    "contentMediaType=${schema.contentMediaType ?: "-"}",
            )
        }
        appendLine(
            "  nullabilityOrigins " +
                schema.nullabilityOrigins.joinToString(prefix = "[", postfix = "]") {
                    "${it.surface}@${it.source.render()}"
                },
        )
        appendLine("  flags deprecated=${schema.deprecated} readOnly=${schema.readOnly} writeOnly=${schema.writeOnly}")
        appendLine("  description ${quoted(schema.description)}")
        appendLine("  constraints ${schema.constraints.renderMap()}")
        appendLine("  default ${schema.defaultValue?.render() ?: "-"}")
        appendLine("  examples ${schema.examples.joinToString(prefix = "[", postfix = "]") { it.render() }}")
        schema.enum?.let { enum ->
            appendLine(
                "  enum ${enum.openness} ${enum.values.joinToString(
                    prefix = "[",
                    postfix = "]",
                ) { it.render() }} @${enum.source.render()}",
            )
        }
        schema.properties.forEach { property ->
            appendLine(
                "  property ${property.name} ${property.requiredness}/${property.nullability} " +
                    "presence=${property.presenceStates.joinToString(",")} -> ${property.schema.schemaId} " +
                    "readOnly=${property.readOnly} writeOnly=${property.writeOnly} deprecated=${property.deprecated} @${property.source.render()}",
            )
        }
        schema.items?.let { appendLine("  items -> ${it.schemaId} @${it.source.render()}") }
        schema.additionalProperties?.let { additional ->
            val detail =
                when (additional) {
                    is AdditionalPropertiesModel.Closed -> "closed"
                    is AdditionalPropertiesModel.FreeForm -> "free-form-json"
                    is AdditionalPropertiesModel.Typed -> "typed:${additional.valueSchema.schemaId}"
                }
            appendLine("  additionalProperties $detail @${additional.source.render()}")
        }
        schema.compositions.forEach { composition ->
            appendLine(
                "  ${composition.kind} ${composition.branches.joinToString {
                    it.schemaId.value
                }} @${composition.source.render()}",
            )
            composition.discriminator?.let { discriminator ->
                appendLine(
                    "    discriminator ${discriminator.propertyName} mapping=${discriminator.mapping.entries.joinToString {
                        "${it.key}->${it.value}"
                    }} unmapped=${discriminator.unmappedBranches.joinToString()} extensions=${discriminator.extensions.renderMap()} @${discriminator.source.render()}",
                )
            }
        }
        schema.allOfPropertyOwnership.forEach { ownership ->
            appendLine(
                "  owner ${ownership.propertyName} -> ${ownership.ownerSchemaId} constraints=${ownership.constraints.renderMap()} @${ownership.source.render()}",
            )
        }
        appendLine("  extensions ${schema.extensions.renderMap()}")
    }

    private fun MediaTypeModel.render(): String =
        "media $mediaType schema=${schema?.schemaId} streaming=$streaming encoding=" +
            encoding.joinToString(prefix = "[", postfix = "]") {
                "${it.partName}:${it.contentType ?: "-"}:style=${it.style ?: "-"}:" +
                    "explode=${it.explode ?: "-"}:allowReserved=${it.allowReserved ?: "-"}"
            } + " @${source.render()}"

    private fun SourcePointer.render(): String =
        "$documentUri#$jsonPointer:${location.line}:${location.column}:${location.byteOffset}"

    private fun Map<String, JsonValue>.renderMap(): String =
        entries
            .sortedBy { it.key }
            .joinToString(prefix = "{", postfix = "}") { (key, value) -> "$key=${value.render()}" }

    private fun Map<String, List<String>>.renderScopes(): String =
        entries
            .sortedBy { it.key }
            .joinToString(prefix = "{", postfix = "}") { (key, value) -> "$key=[${value.sorted().joinToString()}]" }

    private fun JsonValue.render(): String =
        when (this) {
            JsonValue.Null -> "null"
            is JsonValue.BooleanValue -> value.toString()
            is JsonValue.NumberValue -> lexicalValue
            is JsonValue.StringValue -> quoted(value)
            is JsonValue.ArrayValue -> values.joinToString(prefix = "[", postfix = "]") { it.render() }
            is JsonValue.ObjectValue -> properties.renderMap()
        }

    private fun quoted(value: String?): String =
        value?.let { text ->
            "\"" + text.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + "\""
        } ?: "-"
}
