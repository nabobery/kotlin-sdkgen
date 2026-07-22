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

public enum class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bBranch {
    Branch1,
    InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bNoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/background_color.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/background_color
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384:
        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bBranch.InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384,
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
        ): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bNoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854b(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384 =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384>()
    return InlineV1CheckoutSessionsPostRequestFormBrandingSettingsBackgroundColorXe6c9854bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384 = matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384: value does not match InlineV1CheckoutSessionsPostRequestFormBrandingSettingsAnyOf2Xa2c61384",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
