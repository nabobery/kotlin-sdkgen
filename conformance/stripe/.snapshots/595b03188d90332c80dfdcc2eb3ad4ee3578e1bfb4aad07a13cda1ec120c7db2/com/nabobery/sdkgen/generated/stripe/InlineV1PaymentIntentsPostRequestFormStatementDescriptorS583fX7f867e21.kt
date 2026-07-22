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

public enum class InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25,
}

public sealed class InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kana.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kana
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25,
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
        ): InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25>()
    return InlineV1PaymentIntentsPostRequestFormStatementDescriptorS583fX7f867e21Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X2c7efe25",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
