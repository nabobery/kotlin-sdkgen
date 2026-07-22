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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/cashapp.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/cashapp
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf1X1d978596",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappAnyOf2X70da91ba",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
