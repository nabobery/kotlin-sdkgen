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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Branch {
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3,
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Inspection(
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Inspection,
) {
    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2 {
            val inspection =
                inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Inspection {
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoX20c197b2Inspection(
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X3401c5a3",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xb1d6d96a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
