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

public enum class InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Branch {
    PaymentLinksResourceOptionalItemAdjustableQuantity,
}

public sealed class InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3NoMatchException(
    message: String,
) : InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3DecodingException(message)

internal data class InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Inspection(
    public val matchesPaymentLinksResourceOptionalItemAdjustableQuantity: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentLinksResourceOptionalItemAdjustableQuantity).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_optional_item/properties/adjustable_quantity.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_optional_item/properties/adjustable_quantity
 */
@Serializable(with = InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3.Serializer::class)
public class InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Inspection,
) {
    public val paymentLinksResourceOptionalItemAdjustableQuantity:
        PaymentLinksResourceOptionalItemAdjustableQuantityView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentLinksResourceOptionalItemAdjustableQuantity) {
                json
                    .decodeFromJsonElement<PaymentLinksResourceOptionalItemAdjustableQuantityView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentLinksResourceOptionalItemAdjustableQuantity) {
                    add(
                        InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Branch.PaymentLinksResourceOptionalItemAdjustableQuantity,
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
        ): InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3 {
            val inspection = inspectInlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3NoMatchException(
                    "InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3(
    element: JsonElement,
): InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Inspection(
            matchesPaymentLinksResourceOptionalItemAdjustableQuantity = false,
            failures = listOf("PaymentLinksResourceOptionalItemAdjustableQuantity: expected JSON object"),
        )
    val matchesPaymentLinksResourceOptionalItemAdjustableQuantity = raw["enabled"] != null
    return InlinePaymentLinksResourceOptionalItemAdjustableQuantityXe9d6e1a3Inspection(
        matchesPaymentLinksResourceOptionalItemAdjustableQuantity = matchesPaymentLinksResourceOptionalItemAdjustableQuantity,
        failures =
            buildList {
                if (!matchesPaymentLinksResourceOptionalItemAdjustableQuantity) {
                    add(
                        "PaymentLinksResourceOptionalItemAdjustableQuantity: required properties 'enabled' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
