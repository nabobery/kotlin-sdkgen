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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eBranch {
    InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73,
    InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eInspection(
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73,
                matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/after_submit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/after_submit
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eInspection,
) {
    public val inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73:
        InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d:
        InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eBranch.InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d) {
                    add(
                        InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eBranch.InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d,
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
        ): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eInspection {
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73>()
    val matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d>()
    return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682eInspection(
        matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73 = matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73,
        matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d = matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d: value does not match InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
