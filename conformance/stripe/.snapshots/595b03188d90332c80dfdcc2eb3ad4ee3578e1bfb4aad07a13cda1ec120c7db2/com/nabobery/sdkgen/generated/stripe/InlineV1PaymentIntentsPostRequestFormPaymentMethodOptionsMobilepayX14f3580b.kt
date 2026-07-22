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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bBranch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bInspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/mobilepay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/mobilepay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bInspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bInspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580bInspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xff718008",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X48a235f6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
