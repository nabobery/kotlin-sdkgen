package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineGelatoDocumentReportDobX15024453Branch {
    GelatoDataDocumentReportDateOfBirth,
}

public sealed class InlineGelatoDocumentReportDobX15024453DecodingException(
    message: String,
) : SerializationException(message)

public class InlineGelatoDocumentReportDobX15024453NoMatchException(
    message: String,
) : InlineGelatoDocumentReportDobX15024453DecodingException(message)

internal data class InlineGelatoDocumentReportDobX15024453Inspection(
    public val matchesGelatoDataDocumentReportDateOfBirth: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesGelatoDataDocumentReportDateOfBirth).count { it }
}

/**
 * Date of birth as it appears in the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/dob
 */
@Serializable(with = InlineGelatoDocumentReportDobX15024453.Serializer::class)
public class InlineGelatoDocumentReportDobX15024453 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineGelatoDocumentReportDobX15024453Inspection,
) {
    public val gelatoDataDocumentReportDateOfBirth: GelatoDataDocumentReportDateOfBirthView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesGelatoDataDocumentReportDateOfBirth) {
                json
                    .decodeFromJsonElement<GelatoDataDocumentReportDateOfBirthView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineGelatoDocumentReportDobX15024453Branch>
        get() =
            buildSet {
                if (inspection.matchesGelatoDataDocumentReportDateOfBirth) {
                    add(
                        InlineGelatoDocumentReportDobX15024453Branch.GelatoDataDocumentReportDateOfBirth,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineGelatoDocumentReportDobX15024453 {
            val inspection = inspectInlineGelatoDocumentReportDobX15024453(raw)
            if (inspection.matchCount == 0) {
                throw InlineGelatoDocumentReportDobX15024453NoMatchException(
                    "InlineGelatoDocumentReportDobX15024453 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineGelatoDocumentReportDobX15024453(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineGelatoDocumentReportDobX15024453> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportDobX15024453 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoDocumentReportDobX15024453")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineGelatoDocumentReportDobX15024453,
        ) {
            encoder.requireJsonEncoder("InlineGelatoDocumentReportDobX15024453").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineGelatoDocumentReportDobX15024453(
    element: JsonElement,
): InlineGelatoDocumentReportDobX15024453Inspection {
    val raw =
        element as? JsonObject ?: return InlineGelatoDocumentReportDobX15024453Inspection(
            matchesGelatoDataDocumentReportDateOfBirth = false,
            failures = listOf("GelatoDataDocumentReportDateOfBirth: expected JSON object"),
        )
    val matchesGelatoDataDocumentReportDateOfBirth = true
    return InlineGelatoDocumentReportDobX15024453Inspection(
        matchesGelatoDataDocumentReportDateOfBirth = matchesGelatoDataDocumentReportDateOfBirth,
        failures =
            buildList {
                if (!matchesGelatoDataDocumentReportDateOfBirth) {
                    add(
                        "GelatoDataDocumentReportDateOfBirth: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
