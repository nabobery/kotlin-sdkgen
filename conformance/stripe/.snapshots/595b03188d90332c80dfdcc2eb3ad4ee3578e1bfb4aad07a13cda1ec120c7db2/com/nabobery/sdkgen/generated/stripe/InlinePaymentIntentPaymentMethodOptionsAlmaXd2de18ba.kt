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

public enum class InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baBranch {
    PaymentMethodOptionsAlma,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baNoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baInspection(
    public val matchesPaymentMethodOptionsAlma: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsAlma,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/alma.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/alma
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baInspection,
) {
    public val paymentMethodOptionsAlma: PaymentMethodOptionsAlmaView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsAlma) {
                json.decodeFromJsonElement<PaymentMethodOptionsAlmaView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsAlma) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baBranch.PaymentMethodOptionsAlma,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baNoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baInspection(
            matchesPaymentMethodOptionsAlma = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsAlma: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsAlma = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18baInspection(
        matchesPaymentMethodOptionsAlma = matchesPaymentMethodOptionsAlma,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsAlma) {
                    add(
                        "PaymentMethodOptionsAlma: required properties  do not match their declared types",
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
