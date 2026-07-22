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

public enum class InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bBranch {
    InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1,
    InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bNoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bInspection(
    public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1,
                matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/after_submit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/after_submit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bInspection,
) {
    public val inlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1:
        InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac:
        InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac,
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
        ): InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bNoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bInspection {
    val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1 =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1>()
    val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac>()
    return InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958bInspection(
        matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1 = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1,
        matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac,
        failures =
            buildList {
                if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf1X87e23aa1",
                    )
                }
                if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitAnyOf2X9a3c84ac",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
