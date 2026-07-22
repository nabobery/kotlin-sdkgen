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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xac8cc680",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X3aeb8fcd",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
