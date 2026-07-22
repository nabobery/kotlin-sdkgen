package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pay_by_bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pay_by_bank
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xadc48c42",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
