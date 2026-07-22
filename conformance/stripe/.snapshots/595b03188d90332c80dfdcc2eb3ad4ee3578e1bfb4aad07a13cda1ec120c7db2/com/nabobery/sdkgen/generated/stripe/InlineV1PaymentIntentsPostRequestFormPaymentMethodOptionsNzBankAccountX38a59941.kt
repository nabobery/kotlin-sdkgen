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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/nz_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/nz_bank_account
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xb45b8ddd",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xb5f79fa4",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
