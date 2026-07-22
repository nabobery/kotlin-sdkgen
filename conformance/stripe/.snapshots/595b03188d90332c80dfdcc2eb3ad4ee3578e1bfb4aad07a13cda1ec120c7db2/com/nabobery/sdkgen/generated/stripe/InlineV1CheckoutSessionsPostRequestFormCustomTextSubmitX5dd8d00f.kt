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

public enum class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fBranch {
    InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b,
    InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fNoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fInspection(
    public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b,
                matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/submit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/submit
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fInspection,
) {
    public val inlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b:
        InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250:
        InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250,
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
        ): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fNoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fInspection {
    val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b>()
    val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250 =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250>()
    return InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00fInspection(
        matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b,
        matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250 = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250,
        failures =
            buildList {
                if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b",
                    )
                }
                if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf2X4fdf3250",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
