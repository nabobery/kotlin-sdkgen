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

public enum class InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Branch {
    PaymentMethodConfigBizPaymentMethodConfigurationDetails,
}

public sealed class InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90NoMatchException(
    message: String,
) : InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90DecodingException(message)

internal data class InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Inspection(
    public val matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails).count { it }
}

/**
 * Information about the [payment method configuration](https://docs.stripe.com/api/payment_method_configurations) used
 * for this Setup Intent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/payment_method_configuration_details
 */
@Serializable(with = InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90.Serializer::class)
public class InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Inspection,
) {
    public val paymentMethodConfigBizPaymentMethodConfigurationDetails:
        PaymentMethodConfigBizPaymentMethodConfigurationDetailsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) {
                json
                    .decodeFromJsonElement<PaymentMethodConfigBizPaymentMethodConfigurationDetailsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) {
                    add(
                        InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Branch.PaymentMethodConfigBizPaymentMethodConfigurationDetails,
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
        ): InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90 {
            val inspection = inspectInlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90(raw)
            if (inspection.matchCount == 0) {
                throw InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90NoMatchException(
                    "InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90(
    element: JsonElement,
): InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Inspection {
    val raw =
        element as? JsonObject ?: return InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Inspection(
            matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = false,
            failures = listOf("PaymentMethodConfigBizPaymentMethodConfigurationDetails: expected JSON object"),
        )
    val matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = raw["id"].isString()
    return InlineSetupIntentPaymentMethodConfigurationDetailsXbc2a0b90Inspection(
        matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails = matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails,
        failures =
            buildList {
                if (!matchesPaymentMethodConfigBizPaymentMethodConfigurationDetails) {
                    add(
                        "PaymentMethodConfigBizPaymentMethodConfigurationDetails: required properties 'id' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
