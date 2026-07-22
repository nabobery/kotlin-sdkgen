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

public enum class InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Branch {
    InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433,
    InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8,
}

public sealed class InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433,
                matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8,
            ).count {
                it
            }
}

/**
 * This hash contains details about the Mandate to create. This parameter can only be used with
 * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433:
        InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8:
        InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Branch.InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Branch.InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8,
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
        ): InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433>()
    val matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8>()
    return InlineV1PaymentIntentsPostRequestFormMandateDataX6a9982e0Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 = matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433,
        matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8 = matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433: value does not match InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8: value does not match InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf2X6687f4a8",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
