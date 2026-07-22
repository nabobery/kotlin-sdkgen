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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Branch {
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619,
    InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Inspection(
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619,
                matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments/proper
 * ties/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_options/properties/card/anyOf/0/properties/installments/proper
 * ties/plan
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Inspection,
) {
    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26:
        InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26) {
                    add(
                        InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Branch.InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26,
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
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6 {
            val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6NoMatchException(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Inspection {
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619>()
    val matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26>()
    return InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsPlanX27ac85d6Inspection(
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619,
        matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26,
        failures =
            buildList {
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf1X28b45619",
                    )
                }
                if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26) {
                    add(
                        "InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsAnyOf2X4cdb4c26",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
