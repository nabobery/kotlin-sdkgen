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

public enum class InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cBranch {
    PaymentMethodOptionsScalapay,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cNoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cInspection(
    public val matchesPaymentMethodOptionsScalapay: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsScalapay,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/scalapay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/scalapay
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cInspection,
) {
    public val paymentMethodOptionsScalapay: PaymentMethodOptionsScalapayView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsScalapay) {
                json
                    .decodeFromJsonElement<PaymentMethodOptionsScalapayView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsScalapay) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cBranch.PaymentMethodOptionsScalapay,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cNoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cInspection(
            matchesPaymentMethodOptionsScalapay = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsScalapay: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsScalapay = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7cInspection(
        matchesPaymentMethodOptionsScalapay = matchesPaymentMethodOptionsScalapay,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsScalapay) {
                    add(
                        "PaymentMethodOptionsScalapay: required properties  do not match their declared types",
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
