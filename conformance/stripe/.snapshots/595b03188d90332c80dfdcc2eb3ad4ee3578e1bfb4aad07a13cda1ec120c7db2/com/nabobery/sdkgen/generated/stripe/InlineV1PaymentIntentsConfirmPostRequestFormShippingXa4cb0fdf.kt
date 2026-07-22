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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfBranch {
    InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c,
    InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfNoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfInspection(
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896,
            ).count {
                it
            }
}

/**
 * Shipping information for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfInspection,
) {
    public val inlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c:
        InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896:
        InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfBranch.InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfBranch.InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfNoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdf(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfInspection {
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896>()
    return InlineV1PaymentIntentsConfirmPostRequestFormShippingXa4cb0fdfInspection(
        matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c = matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896 = matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c: value does not match InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf1X9e528b4c",
                    )
                }
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896: value does not match InlineV1PaymentIntentsConfirmPostRequestFormShippingAnyOf2Xbd938896",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
