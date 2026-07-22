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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Branch {
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b,
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Inspection(
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Inspection,
) {
    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512 {
            val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Inspection {
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPixX49f6e512Inspection(
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X4689b17b",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X771ecfe6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
