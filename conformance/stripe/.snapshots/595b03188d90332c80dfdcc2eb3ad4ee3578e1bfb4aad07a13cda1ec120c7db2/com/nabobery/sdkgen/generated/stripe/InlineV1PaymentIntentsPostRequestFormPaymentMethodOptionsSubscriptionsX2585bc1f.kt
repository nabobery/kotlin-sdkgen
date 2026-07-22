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
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fBranch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fInspection,
) {
    public val branch1:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1f(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXe0bb0450>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX2585bc1fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X739c940b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
