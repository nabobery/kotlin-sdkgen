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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/swish/anyOf/0/properties/reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/swish/anyOf/0/properties/reference
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314 {
            val inspection =
                inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2Xb1516812",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
