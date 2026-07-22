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

public enum class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Branch {
    Branch1,
    InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6,
}

public sealed class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering/properties/template_version.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/rendering/properties/template_version
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6:
        InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6) {
                    add(
                        InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Branch.InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6,
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
        ): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450 {
            val inspection = inspectInlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450NoMatchException(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6>()
    return InlineV1InvoicesPostRequestFormRenderingTemplateVersionX1f9b9450Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6 = matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6) {
                    add(
                        "InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6: value does not match InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X565e81e6",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
