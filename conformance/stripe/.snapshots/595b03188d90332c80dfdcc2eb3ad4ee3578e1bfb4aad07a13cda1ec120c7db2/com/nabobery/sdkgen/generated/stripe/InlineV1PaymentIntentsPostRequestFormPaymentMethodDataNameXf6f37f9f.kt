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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fBranch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9f(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameXf6f37f9fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2Xadfa946a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
