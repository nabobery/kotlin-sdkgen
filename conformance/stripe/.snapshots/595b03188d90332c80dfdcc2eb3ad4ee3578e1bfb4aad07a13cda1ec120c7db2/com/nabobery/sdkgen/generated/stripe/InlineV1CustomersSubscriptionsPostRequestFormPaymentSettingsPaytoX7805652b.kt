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

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bBranch {
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e,
    InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bNoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bInspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e,
                matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/payto
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bInspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819:
        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bNoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652b(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bInspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819>()
    return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsPaytoX7805652bInspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e,
        matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819 = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf1X9018025e",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X981e3819",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
