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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Branch {
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218,
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Inspection(
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Inspection,
) {
    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6 {
            val inspection =
                inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Inspection {
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPaytoXbb7d38c6Inspection(
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X70665218",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2Xf2fa50e7",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
