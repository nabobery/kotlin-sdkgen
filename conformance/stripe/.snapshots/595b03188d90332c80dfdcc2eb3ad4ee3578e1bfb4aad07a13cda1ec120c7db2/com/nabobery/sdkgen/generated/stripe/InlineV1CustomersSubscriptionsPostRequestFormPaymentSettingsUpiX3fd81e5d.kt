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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dBranch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dNoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dInspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/upi
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dInspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dNoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5d(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dInspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1>()
    return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsUpiX3fd81e5dInspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xdbc74186",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X13cb61d1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
