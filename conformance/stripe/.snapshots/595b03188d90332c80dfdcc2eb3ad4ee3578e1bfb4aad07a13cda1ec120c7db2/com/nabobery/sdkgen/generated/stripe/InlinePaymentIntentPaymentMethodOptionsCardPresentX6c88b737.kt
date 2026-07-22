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

public enum class InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Branch {
    PaymentMethodOptionsCardPresent,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Inspection(
    public val matchesPaymentMethodOptionsCardPresent: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsCardPresent,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/card_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/card_present
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Inspection,
) {
    public val paymentMethodOptionsCardPresent: PaymentMethodOptionsCardPresentView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsCardPresent) {
                json
                    .decodeFromJsonElement<PaymentMethodOptionsCardPresentView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsCardPresent) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Branch.PaymentMethodOptionsCardPresent,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737 {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737NoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Inspection(
            matchesPaymentMethodOptionsCardPresent = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsCardPresent: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsCardPresent = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737Inspection(
        matchesPaymentMethodOptionsCardPresent = matchesPaymentMethodOptionsCardPresent,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsCardPresent) {
                    add(
                        "PaymentMethodOptionsCardPresent: required properties  do not match their declared types",
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
