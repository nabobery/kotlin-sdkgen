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

public enum class InlinePaymentLinksResourceCustomTextSubmitX46160aa5Branch {
    PaymentLinksResourceCustomTextPosition,
}

public sealed class InlinePaymentLinksResourceCustomTextSubmitX46160aa5DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceCustomTextSubmitX46160aa5NoMatchException(
    message: String,
) : InlinePaymentLinksResourceCustomTextSubmitX46160aa5DecodingException(message)

internal data class InlinePaymentLinksResourceCustomTextSubmitX46160aa5Inspection(
    public val matchesPaymentLinksResourceCustomTextPosition: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentLinksResourceCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed alongside the payment confirmation button.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text/properties/submit
 */
@Serializable(with = InlinePaymentLinksResourceCustomTextSubmitX46160aa5.Serializer::class)
public class InlinePaymentLinksResourceCustomTextSubmitX46160aa5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentLinksResourceCustomTextSubmitX46160aa5Inspection,
) {
    public val paymentLinksResourceCustomTextPosition: PaymentLinksResourceCustomTextPositionView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentLinksResourceCustomTextPosition) {
                json
                    .decodeFromJsonElement<PaymentLinksResourceCustomTextPositionView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentLinksResourceCustomTextSubmitX46160aa5Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentLinksResourceCustomTextPosition) {
                    add(
                        InlinePaymentLinksResourceCustomTextSubmitX46160aa5Branch.PaymentLinksResourceCustomTextPosition,
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
        ): InlinePaymentLinksResourceCustomTextSubmitX46160aa5 {
            val inspection = inspectInlinePaymentLinksResourceCustomTextSubmitX46160aa5(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentLinksResourceCustomTextSubmitX46160aa5NoMatchException(
                    "InlinePaymentLinksResourceCustomTextSubmitX46160aa5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentLinksResourceCustomTextSubmitX46160aa5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentLinksResourceCustomTextSubmitX46160aa5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomTextSubmitX46160aa5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceCustomTextSubmitX46160aa5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinksResourceCustomTextSubmitX46160aa5,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentLinksResourceCustomTextSubmitX46160aa5",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentLinksResourceCustomTextSubmitX46160aa5(
    element: JsonElement,
): InlinePaymentLinksResourceCustomTextSubmitX46160aa5Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentLinksResourceCustomTextSubmitX46160aa5Inspection(
            matchesPaymentLinksResourceCustomTextPosition = false,
            failures = listOf("PaymentLinksResourceCustomTextPosition: expected JSON object"),
        )
    val matchesPaymentLinksResourceCustomTextPosition = raw["message"].isString()
    return InlinePaymentLinksResourceCustomTextSubmitX46160aa5Inspection(
        matchesPaymentLinksResourceCustomTextPosition = matchesPaymentLinksResourceCustomTextPosition,
        failures =
            buildList {
                if (!matchesPaymentLinksResourceCustomTextPosition) {
                    add(
                        "PaymentLinksResourceCustomTextPosition: required properties 'message' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
