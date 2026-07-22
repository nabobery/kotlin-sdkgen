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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Branch {
    Branch1,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/customer_reference
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade>()
    return InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1AnyOf2X8b36fade",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
