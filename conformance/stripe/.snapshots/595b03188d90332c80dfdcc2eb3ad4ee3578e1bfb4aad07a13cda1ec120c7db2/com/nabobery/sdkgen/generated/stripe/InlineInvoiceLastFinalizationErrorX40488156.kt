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

public enum class InlineInvoiceLastFinalizationErrorX40488156Branch {
    ApiErrors,
}

public sealed class InlineInvoiceLastFinalizationErrorX40488156DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceLastFinalizationErrorX40488156NoMatchException(
    message: String,
) : InlineInvoiceLastFinalizationErrorX40488156DecodingException(message)

internal data class InlineInvoiceLastFinalizationErrorX40488156Inspection(
    public val matchesApiErrors: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesApiErrors).count { it }
}

/**
 * The error encountered during the previous attempt to finalize the invoice. This field is cleared when the invoice is
 * successfully finalized.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/last_finalization_error
 */
@Serializable(with = InlineInvoiceLastFinalizationErrorX40488156.Serializer::class)
public class InlineInvoiceLastFinalizationErrorX40488156 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceLastFinalizationErrorX40488156Inspection,
) {
    public val apiErrors: ApiErrorsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesApiErrors) json.decodeFromJsonElement<ApiErrorsView>(raw) else null
        }

    public val matchedBranches: Set<InlineInvoiceLastFinalizationErrorX40488156Branch>
        get() =
            buildSet {
                if (inspection.matchesApiErrors) add(InlineInvoiceLastFinalizationErrorX40488156Branch.ApiErrors)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineInvoiceLastFinalizationErrorX40488156 {
            val inspection = inspectInlineInvoiceLastFinalizationErrorX40488156(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceLastFinalizationErrorX40488156NoMatchException(
                    "InlineInvoiceLastFinalizationErrorX40488156 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceLastFinalizationErrorX40488156(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceLastFinalizationErrorX40488156> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceLastFinalizationErrorX40488156 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceLastFinalizationErrorX40488156")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceLastFinalizationErrorX40488156,
        ) {
            encoder.requireJsonEncoder("InlineInvoiceLastFinalizationErrorX40488156").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceLastFinalizationErrorX40488156(
    element: JsonElement,
): InlineInvoiceLastFinalizationErrorX40488156Inspection {
    val raw =
        element as? JsonObject ?: return InlineInvoiceLastFinalizationErrorX40488156Inspection(
            matchesApiErrors = false,
            failures = listOf("ApiErrors: expected JSON object"),
        )
    val matchesApiErrors = raw["type"] != null
    return InlineInvoiceLastFinalizationErrorX40488156Inspection(
        matchesApiErrors = matchesApiErrors,
        failures =
            buildList {
                if (!matchesApiErrors) add("ApiErrors: required properties 'type' do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
