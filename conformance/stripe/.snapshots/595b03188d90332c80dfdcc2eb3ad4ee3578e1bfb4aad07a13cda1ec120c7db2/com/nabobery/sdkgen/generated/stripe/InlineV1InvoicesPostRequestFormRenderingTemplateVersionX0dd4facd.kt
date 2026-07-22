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

public enum class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdBranch {
    Branch1,
    InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455,
}

public sealed class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/template_version.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/rendering/properties/template_version
 */
@Serializable(with = InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd.Serializer::class)
public class InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455:
        InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455) {
                    add(
                        InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdBranch.InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455,
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
        ): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd {
            val inspection = inspectInlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdNoMatchException(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facd(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455>()
    return InlineV1InvoicesPostRequestFormRenderingTemplateVersionX0dd4facdInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455 = matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455) {
                    add(
                        "InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455: value does not match InlineV1InvoicesPostRequestFormRenderingTemplateVersionAnyOf2X82252455",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
