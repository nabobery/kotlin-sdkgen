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

public enum class InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Branch {
    PaymentIntentPaymentMethodOptionsBlik,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Inspection(
    public val matchesPaymentIntentPaymentMethodOptionsBlik: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentIntentPaymentMethodOptionsBlik,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/blik.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/blik
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Inspection,
) {
    public val paymentIntentPaymentMethodOptionsBlik: PaymentIntentPaymentMethodOptionsBlikView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntentPaymentMethodOptionsBlik) {
                json
                    .decodeFromJsonElement<PaymentIntentPaymentMethodOptionsBlikView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val paymentIntentTypeSpecificPaymentMethodOptionsClient:
        PaymentIntentTypeSpecificPaymentMethodOptionsClientView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                json
                    .decodeFromJsonElement<PaymentIntentTypeSpecificPaymentMethodOptionsClientView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentIntentPaymentMethodOptionsBlik) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Branch.PaymentIntentPaymentMethodOptionsBlik,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2 {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsBlikX94e475d2(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2NoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsBlikX94e475d2(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Inspection(
            matchesPaymentIntentPaymentMethodOptionsBlik = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentIntentPaymentMethodOptionsBlik: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentIntentPaymentMethodOptionsBlik = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2Inspection(
        matchesPaymentIntentPaymentMethodOptionsBlik = matchesPaymentIntentPaymentMethodOptionsBlik,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentIntentPaymentMethodOptionsBlik) {
                    add(
                        "PaymentIntentPaymentMethodOptionsBlik: required properties  do not match their declared types",
                    )
                }
                if (!matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        "PaymentIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
