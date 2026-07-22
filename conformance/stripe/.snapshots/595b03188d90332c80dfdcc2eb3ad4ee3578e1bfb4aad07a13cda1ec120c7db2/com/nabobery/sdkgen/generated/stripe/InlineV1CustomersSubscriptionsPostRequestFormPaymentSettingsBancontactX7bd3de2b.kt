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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bBranch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bNoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bInspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bInspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bNoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2b(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bInspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6>()
    return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsBancontactX7bd3de2bInspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X571d2191",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xfdb3b4c6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
