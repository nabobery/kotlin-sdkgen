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

public enum class InlineGelatoDocumentReportAddressXf1c23419Branch {
    Address,
}

public sealed class InlineGelatoDocumentReportAddressXf1c23419DecodingException(
    message: String,
) : SerializationException(message)

public class InlineGelatoDocumentReportAddressXf1c23419NoMatchException(
    message: String,
) : InlineGelatoDocumentReportAddressXf1c23419DecodingException(message)

internal data class InlineGelatoDocumentReportAddressXf1c23419Inspection(
    public val matchesAddress: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesAddress).count { it }
}

/**
 * Address as it appears in the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/address
 */
@Serializable(with = InlineGelatoDocumentReportAddressXf1c23419.Serializer::class)
public class InlineGelatoDocumentReportAddressXf1c23419 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineGelatoDocumentReportAddressXf1c23419Inspection,
) {
    public val address: AddressView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesAddress) json.decodeFromJsonElement<AddressView>(raw) else null
        }

    public val matchedBranches: Set<InlineGelatoDocumentReportAddressXf1c23419Branch>
        get() =
            buildSet {
                if (inspection.matchesAddress) add(InlineGelatoDocumentReportAddressXf1c23419Branch.Address)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineGelatoDocumentReportAddressXf1c23419 {
            val inspection = inspectInlineGelatoDocumentReportAddressXf1c23419(raw)
            if (inspection.matchCount == 0) {
                throw InlineGelatoDocumentReportAddressXf1c23419NoMatchException(
                    "InlineGelatoDocumentReportAddressXf1c23419 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineGelatoDocumentReportAddressXf1c23419(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineGelatoDocumentReportAddressXf1c23419> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportAddressXf1c23419 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoDocumentReportAddressXf1c23419")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineGelatoDocumentReportAddressXf1c23419,
        ) {
            encoder.requireJsonEncoder("InlineGelatoDocumentReportAddressXf1c23419").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineGelatoDocumentReportAddressXf1c23419(
    element: JsonElement,
): InlineGelatoDocumentReportAddressXf1c23419Inspection {
    val raw =
        element as? JsonObject ?: return InlineGelatoDocumentReportAddressXf1c23419Inspection(
            matchesAddress = false,
            failures = listOf("Address: expected JSON object"),
        )
    val matchesAddress = true
    return InlineGelatoDocumentReportAddressXf1c23419Inspection(
        matchesAddress = matchesAddress,
        failures =
            buildList {
                if (!matchesAddress) add("Address: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
