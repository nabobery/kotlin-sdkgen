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

public enum class InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dBranch {
    PaymentMethodOptionsBancontact,
    PaymentIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dNoMatchException(
    message: String,
) : InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dDecodingException(message)

internal data class InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dInspection(
    public val matchesPaymentMethodOptionsBancontact: Boolean,
    public val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesPaymentMethodOptionsBancontact,
                matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bancontact.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options/properties/bancontact
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d.Serializer::class)
public class InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dInspection,
) {
    public val paymentMethodOptionsBancontact: PaymentMethodOptionsBancontactView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodOptionsBancontact) {
                json
                    .decodeFromJsonElement<PaymentMethodOptionsBancontactView>(
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

    public val matchedBranches: Set<InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dBranch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodOptionsBancontact) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dBranch.PaymentMethodOptionsBancontact,
                    )
                }
                if (inspection.matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient) {
                    add(
                        InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dBranch.PaymentIntentTypeSpecificPaymentMethodOptionsClient,
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
        ): InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d {
            val inspection = inspectInlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dNoMatchException(
                    "InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d(
    element: JsonElement,
): InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dInspection(
            matchesPaymentMethodOptionsBancontact = false,
            matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = false,
            failures =
                listOf(
                    "PaymentMethodOptionsBancontact: expected JSON object",
                    "PaymentIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object",
                ),
        )
    val matchesPaymentMethodOptionsBancontact = raw["preferred_language"] != null
    val matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = true
    return InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2dInspection(
        matchesPaymentMethodOptionsBancontact = matchesPaymentMethodOptionsBancontact,
        matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient = matchesPaymentIntentTypeSpecificPaymentMethodOptionsClient,
        failures =
            buildList {
                if (!matchesPaymentMethodOptionsBancontact) {
                    add(
                        "PaymentMethodOptionsBancontact: required properties 'preferred_language' do not match their declared types",
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
