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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf1X70881198",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoAnyOf2Xa56771a8",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
