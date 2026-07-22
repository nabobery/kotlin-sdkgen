package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45View(
    public val cvc: String? = null,
    @SerialName("exp_month")
    public val expMonth: Int,
    @SerialName("exp_year")
    public val expYear: Int,
    public val networks: InlineV1PaymentMethodsPostRequestFormCardAnyOf1NetworksXc385ca6f? = null,
    public val number: String,
)

@Serializable
public data class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286aView(
    public val token: String,
)

public enum class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cBranch {
    InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45,
    InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a,
}

public sealed class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cNoMatchException(
    message: String,
) : InlineV1PaymentMethodsPostRequestFormCardXb44ab44cDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInspection(
    public val matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45: Boolean,
    public val matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45,
                matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a,
            ).count {
                it
            }
}

/**
 * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards compatibility, you can
 * alternatively provide a Stripe token (e.g., for Apple Pay, Amex Express Checkout, or legacy Checkout) into the card
 * hash with format `card: {token: "tok_visa"}`. When providing a card number, you must meet the requirements for [PCI
 * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly recommend using Stripe.js
 * instead of interacting with this API directly.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardXb44ab44c.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardXb44ab44c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInspection,
) {
    public val inlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45:
        InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45View?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45) {
                json
                    .decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45View>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a:
        InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286aView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286aView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1PaymentMethodsPostRequestFormCardXb44ab44cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormCardXb44ab44cBranch.InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45,
                    )
                }
                if (inspection.matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a) {
                    add(
                        InlineV1PaymentMethodsPostRequestFormCardXb44ab44cBranch.InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a,
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
        ): InlineV1PaymentMethodsPostRequestFormCardXb44ab44c {
            val inspection = inspectInlineV1PaymentMethodsPostRequestFormCardXb44ab44c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentMethodsPostRequestFormCardXb44ab44cNoMatchException(
                    "InlineV1PaymentMethodsPostRequestFormCardXb44ab44c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentMethodsPostRequestFormCardXb44ab44c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardXb44ab44c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardXb44ab44c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardXb44ab44c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentMethodsPostRequestFormCardXb44ab44c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentMethodsPostRequestFormCardXb44ab44c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormCardXb44ab44c(
    element: JsonElement,
): InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInspection {
    val raw =
        element as? JsonObject ?: return InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInspection(
            matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 = false,
            matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a = false,
            failures =
                listOf(
                    "InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45: expected JSON object",
                    "InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a: expected JSON object",
                ),
        )
    val matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 =
        raw["exp_month"] != null && raw["exp_year"] != null && raw["number"].isString()
    val matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a = raw["token"].isString()
    return InlineV1PaymentMethodsPostRequestFormCardXb44ab44cInspection(
        matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45 = matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45,
        matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a = matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a,
        failures =
            buildList {
                if (!matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45) {
                    add(
                        "InlineV1PaymentMethodsPostRequestFormCardAnyOf1X489c1b45: required properties 'exp_month', 'exp_year', 'number' do not match their declared types",
                    )
                }
                if (!matchesInlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a) {
                    add(
                        "InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a: required properties 'token' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
