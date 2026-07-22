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

public enum class InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55,
}

public sealed class InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properties/custom_
 * mandate_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options/properties/custom_
 * mandate_url
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55,
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
        ): InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55>()
    return InlineV1PaymentIntentsPostRequestFormCustomMandateUrlXead5e9c9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xdadb3a55",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
