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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0/properties/order_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0/properties/order_reference
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c:
        InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Branch.InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20 {
            val inspection =
                inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c>()
    return InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c = matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1AnyOf2X32c3ac6c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
