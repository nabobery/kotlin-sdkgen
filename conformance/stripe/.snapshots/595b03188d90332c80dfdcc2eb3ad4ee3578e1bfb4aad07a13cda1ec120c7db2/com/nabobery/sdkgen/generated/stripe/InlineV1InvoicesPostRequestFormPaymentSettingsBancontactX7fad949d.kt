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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dBranch {
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09,
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dInspection(
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dInspection,
) {
    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dBranch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d {
            val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dNoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949d(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dInspection {
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsBancontactX7fad949dInspection(
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1Xaea27a09",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X198ba633",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
