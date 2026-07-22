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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Branch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Inspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/payto
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Inspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Inspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930>()
    return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX97da3899Inspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X129cdd48",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X5d48a930",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
