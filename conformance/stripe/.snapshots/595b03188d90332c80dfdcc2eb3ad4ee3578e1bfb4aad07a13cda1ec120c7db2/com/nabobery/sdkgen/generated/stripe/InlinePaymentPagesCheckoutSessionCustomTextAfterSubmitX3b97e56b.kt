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

public enum class InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bBranch {
    PaymentPagesCheckoutSessionCustomTextPosition,
}

public sealed class InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bNoMatchException(
    message: String,
) : InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bDecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bInspection(
    public val matchesPaymentPagesCheckoutSessionCustomTextPosition: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentPagesCheckoutSessionCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed after the payment confirmation button.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text/properties/after_submit
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b.Serializer::class)
public class InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bInspection,
) {
    public val paymentPagesCheckoutSessionCustomTextPosition:
        PaymentPagesCheckoutSessionCustomTextPositionView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) {
                json
                    .decodeFromJsonElement<PaymentPagesCheckoutSessionCustomTextPositionView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentPagesCheckoutSessionCustomTextPosition) {
                    add(
                        InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bBranch.PaymentPagesCheckoutSessionCustomTextPosition,
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
        ): InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b {
            val inspection = inspectInlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bNoMatchException(
                    "InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b(
    element: JsonElement,
): InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bInspection(
            matchesPaymentPagesCheckoutSessionCustomTextPosition = false,
            failures = listOf("PaymentPagesCheckoutSessionCustomTextPosition: expected JSON object"),
        )
    val matchesPaymentPagesCheckoutSessionCustomTextPosition = raw["message"].isString()
    return InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56bInspection(
        matchesPaymentPagesCheckoutSessionCustomTextPosition = matchesPaymentPagesCheckoutSessionCustomTextPosition,
        failures =
            buildList {
                if (!matchesPaymentPagesCheckoutSessionCustomTextPosition) {
                    add(
                        "PaymentPagesCheckoutSessionCustomTextPosition: required properties 'message' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
