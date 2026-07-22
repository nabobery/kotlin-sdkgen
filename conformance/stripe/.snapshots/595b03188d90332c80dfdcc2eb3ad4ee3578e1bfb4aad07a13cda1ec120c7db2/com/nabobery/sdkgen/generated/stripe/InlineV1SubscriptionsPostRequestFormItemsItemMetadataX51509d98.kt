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

public enum class InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Branch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items/properties/metadata
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc:
        InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc) {
                    add(
                        InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Branch.InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc,
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
        ): InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc>()
    return InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc = matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc: value does not match InlineV1SubscriptionsPostRequestFormItemsItemMetadataAnyOf2Xb2fec2cc",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
