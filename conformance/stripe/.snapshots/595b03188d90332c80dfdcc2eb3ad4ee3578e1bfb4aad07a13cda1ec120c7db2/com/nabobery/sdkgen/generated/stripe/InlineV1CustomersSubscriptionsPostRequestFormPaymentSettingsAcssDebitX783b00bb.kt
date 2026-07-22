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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbBranch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbNoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbInspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/acss_debit
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbInspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbNoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bb(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbInspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699>()
    return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAcssDebitX783b00bbInspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X7ab487ee",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2Xa6ef3699",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
