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

public enum class InlinePaymentIntentAutomaticPaymentMethodsX68be6956Branch {
    PaymentFlowsAutomaticPaymentMethodsPaymentIntent,
}

public sealed class InlinePaymentIntentAutomaticPaymentMethodsX68be6956DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentAutomaticPaymentMethodsX68be6956NoMatchException(
    message: String,
) : InlinePaymentIntentAutomaticPaymentMethodsX68be6956DecodingException(message)

internal data class InlinePaymentIntentAutomaticPaymentMethodsX68be6956Inspection(
    public val matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent).count { it }
}

/**
 * Settings to configure compatible payment methods from the [Stripe
 * Dashboard](https://dashboard.stripe.com/settings/payment_methods)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/automatic_payment_methods
 */
@Serializable(with = InlinePaymentIntentAutomaticPaymentMethodsX68be6956.Serializer::class)
public class InlinePaymentIntentAutomaticPaymentMethodsX68be6956 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentAutomaticPaymentMethodsX68be6956Inspection,
) {
    public val paymentFlowsAutomaticPaymentMethodsPaymentIntent:
        PaymentFlowsAutomaticPaymentMethodsPaymentIntentView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent) {
                json
                    .decodeFromJsonElement<PaymentFlowsAutomaticPaymentMethodsPaymentIntentView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentIntentAutomaticPaymentMethodsX68be6956Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent) {
                    add(
                        InlinePaymentIntentAutomaticPaymentMethodsX68be6956Branch.PaymentFlowsAutomaticPaymentMethodsPaymentIntent,
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
        ): InlinePaymentIntentAutomaticPaymentMethodsX68be6956 {
            val inspection = inspectInlinePaymentIntentAutomaticPaymentMethodsX68be6956(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentAutomaticPaymentMethodsX68be6956NoMatchException(
                    "InlinePaymentIntentAutomaticPaymentMethodsX68be6956 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentAutomaticPaymentMethodsX68be6956(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentAutomaticPaymentMethodsX68be6956> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentAutomaticPaymentMethodsX68be6956 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentAutomaticPaymentMethodsX68be6956")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentAutomaticPaymentMethodsX68be6956,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentAutomaticPaymentMethodsX68be6956",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentAutomaticPaymentMethodsX68be6956(
    element: JsonElement,
): InlinePaymentIntentAutomaticPaymentMethodsX68be6956Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentAutomaticPaymentMethodsX68be6956Inspection(
            matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent = false,
            failures = listOf("PaymentFlowsAutomaticPaymentMethodsPaymentIntent: expected JSON object"),
        )
    val matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent = raw["enabled"] != null
    return InlinePaymentIntentAutomaticPaymentMethodsX68be6956Inspection(
        matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent = matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent,
        failures =
            buildList {
                if (!matchesPaymentFlowsAutomaticPaymentMethodsPaymentIntent) {
                    add(
                        "PaymentFlowsAutomaticPaymentMethodsPaymentIntent: required properties 'enabled' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
