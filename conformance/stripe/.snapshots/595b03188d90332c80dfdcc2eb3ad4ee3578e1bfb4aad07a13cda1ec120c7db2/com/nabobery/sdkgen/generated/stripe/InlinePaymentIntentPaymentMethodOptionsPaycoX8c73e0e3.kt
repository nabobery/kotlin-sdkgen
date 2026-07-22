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

public enum class InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Branch {
    PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3NoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3DecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Inspection(
    public val matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/payco.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/payco
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Inspection,
) {
    public val paymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions:
        PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptionsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions) {
                json
                    .decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptionsView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Branch.PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Branch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3 {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3NoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Inspection(
            matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = true
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3Inspection(
        matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions = matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions) {
                    add(
                        "PaymentFlowsPrivatePaymentMethodsPaycoPaymentMethodOptions: required properties  do not match their declared types",
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
