package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaBranch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a,
            ).count {
                it
            }
}

/**
 * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to the
 * application owner's Stripe account. The amount of the application fee collected will be capped at the total amount
 * captured. For more information, see the PaymentIntents [use case for connected
 * accounts](https://docs.stripe.com/payments/connected-accounts).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/application_fee_amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a:
        InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaBranch.InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a,
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
        ): InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5acea(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a>()
    return InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountX29b5aceaInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a = matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a: value does not match InlineV1PaymentIntentsPostRequestFormApplicationFeeAmountAnyOf2X7772bf8a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
