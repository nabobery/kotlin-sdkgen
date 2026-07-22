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

public enum class InlineV1ProductsPostRequestFormDescriptionX1695ae95Branch {
    Branch1,
    InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d,
}

public sealed class InlineV1ProductsPostRequestFormDescriptionX1695ae95DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormDescriptionX1695ae95NoMatchException(
    message: String,
) : InlineV1ProductsPostRequestFormDescriptionX1695ae95DecodingException(message)

internal data class InlineV1ProductsPostRequestFormDescriptionX1695ae95Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d).count { it }
}

/**
 * The product's description, meant to be displayable to the customer. Use this field to optionally store a long form
 * explanation of the product being sold for your own rendering purposes.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products~1{id}/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/description
 */
@Serializable(with = InlineV1ProductsPostRequestFormDescriptionX1695ae95.Serializer::class)
public class InlineV1ProductsPostRequestFormDescriptionX1695ae95 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ProductsPostRequestFormDescriptionX1695ae95Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d:
        InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d) {
                json
                    .decodeFromJsonElement<InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1ProductsPostRequestFormDescriptionX1695ae95Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1ProductsPostRequestFormDescriptionX1695ae95Branch.Branch1)
                if (inspection.matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d) {
                    add(
                        InlineV1ProductsPostRequestFormDescriptionX1695ae95Branch.InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d,
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
        ): InlineV1ProductsPostRequestFormDescriptionX1695ae95 {
            val inspection = inspectInlineV1ProductsPostRequestFormDescriptionX1695ae95(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ProductsPostRequestFormDescriptionX1695ae95NoMatchException(
                    "InlineV1ProductsPostRequestFormDescriptionX1695ae95 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ProductsPostRequestFormDescriptionX1695ae95(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDescriptionX1695ae95> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ProductsPostRequestFormDescriptionX1695ae95 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ProductsPostRequestFormDescriptionX1695ae95")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormDescriptionX1695ae95,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1ProductsPostRequestFormDescriptionX1695ae95",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ProductsPostRequestFormDescriptionX1695ae95(
    element: JsonElement,
): InlineV1ProductsPostRequestFormDescriptionX1695ae95Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d =
        element
            .isJsonDecodable<InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d>()
    return InlineV1ProductsPostRequestFormDescriptionX1695ae95Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d = matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d) {
                    add(
                        "InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d: value does not match InlineV1ProductsPostRequestFormDescriptionAnyOf2X5ced3a8d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
