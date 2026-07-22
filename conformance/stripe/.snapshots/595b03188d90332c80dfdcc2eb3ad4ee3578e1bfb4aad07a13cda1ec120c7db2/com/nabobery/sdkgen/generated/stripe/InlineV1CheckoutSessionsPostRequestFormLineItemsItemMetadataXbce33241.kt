package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Branch {
    Branch1,
    InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241NoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/metadata
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Branch.InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c,
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
        ): InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241 {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241NoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c>()
    return InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c = matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c: value does not match InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
