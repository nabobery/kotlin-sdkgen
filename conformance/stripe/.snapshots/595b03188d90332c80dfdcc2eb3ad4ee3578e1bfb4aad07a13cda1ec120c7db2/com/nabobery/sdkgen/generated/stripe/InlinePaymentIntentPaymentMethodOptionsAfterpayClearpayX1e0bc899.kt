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

public enum class InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Branch {
    PaymentMethodOptionsAfterpayClearpay,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Inspection(
    public val matchesPaymentMethodOptionsAfterpayClearpay: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsAfterpayClearpay,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/afterpay_clearpay.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/afterpay_clearpay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Inspection,
) {
    public val paymentMethodOptionsAfterpayClearpay: PaymentMethodOptionsAfterpayClearpayView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsAfterpayClearpay) {
                json
                    .decodeFromJsonElement<PaymentMethodOptionsAfterpayClearpayView>(
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

    public val matchedBranches:
        Set<InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsAfterpayClearpay) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Branch.PaymentMethodOptionsAfterpayClearpay,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899 {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899NoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Inspection(
            matchesPaymentMethodOptionsAfterpayClearpay = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsAfterpayClearpay: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsAfterpayClearpay = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899Inspection(
        matchesPaymentMethodOptionsAfterpayClearpay = matchesPaymentMethodOptionsAfterpayClearpay,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsAfterpayClearpay) {
                    add(
                        "PaymentMethodOptionsAfterpayClearpay: required properties  do not match their declared types",
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
