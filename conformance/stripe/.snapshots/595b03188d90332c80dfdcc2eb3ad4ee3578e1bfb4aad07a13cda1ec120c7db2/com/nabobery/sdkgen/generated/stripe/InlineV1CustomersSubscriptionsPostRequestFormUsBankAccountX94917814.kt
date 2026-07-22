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

public enum class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Branch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Inspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Inspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Inspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4>()
    return InlineV1CustomersSubscriptionsPostRequestFormUsBankAccountX94917814Inspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1Xa5c314b9",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xd82646c4",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
