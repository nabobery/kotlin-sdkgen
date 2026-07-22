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

public enum class InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Branch {
    InvoiceSettingCustomerRenderingOptions,
}

public sealed class InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96DecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96NoMatchException(
    message: String,
) : InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96DecodingException(message)

internal data class InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Inspection(
    public val matchesInvoiceSettingCustomerRenderingOptions: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoiceSettingCustomerRenderingOptions).count { it }
}

/**
 * Default options for invoice PDF rendering for this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_setting_customer_setting/properties/rendering_options
 */
@Serializable(with = InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96.Serializer::class)
public class InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Inspection,
) {
    public val invoiceSettingCustomerRenderingOptions: InvoiceSettingCustomerRenderingOptionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInvoiceSettingCustomerRenderingOptions) {
                json
                    .decodeFromJsonElement<InvoiceSettingCustomerRenderingOptionsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Branch>
        get() =
            buildSet {
                if (inspection.matchesInvoiceSettingCustomerRenderingOptions) {
                    add(
                        InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Branch.InvoiceSettingCustomerRenderingOptions,
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
        ): InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96 {
            val inspection = inspectInlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96NoMatchException(
                    "InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96(
    element: JsonElement,
): InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Inspection {
    val raw =
        element as? JsonObject ?: return InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Inspection(
            matchesInvoiceSettingCustomerRenderingOptions = false,
            failures = listOf("InvoiceSettingCustomerRenderingOptions: expected JSON object"),
        )
    val matchesInvoiceSettingCustomerRenderingOptions = true
    return InlineInvoiceSettingCustomerSettingRenderingOptionsXe8181c96Inspection(
        matchesInvoiceSettingCustomerRenderingOptions = matchesInvoiceSettingCustomerRenderingOptions,
        failures =
            buildList {
                if (!matchesInvoiceSettingCustomerRenderingOptions) {
                    add(
                        "InvoiceSettingCustomerRenderingOptions: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
