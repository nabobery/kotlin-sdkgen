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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sunbit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sunbit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4fInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X0fb9e2c8",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2X30e01f7e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
