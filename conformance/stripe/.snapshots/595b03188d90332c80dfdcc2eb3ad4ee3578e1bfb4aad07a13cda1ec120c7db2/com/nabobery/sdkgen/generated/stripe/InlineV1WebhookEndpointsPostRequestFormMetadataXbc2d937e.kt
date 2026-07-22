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

public enum class InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eBranch {
    Branch1,
    InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c,
}

public sealed class InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eNoMatchException(
    message: String,
) : InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eDecodingException(message)

internal data class InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/metadata
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c:
        InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c) {
                json
                    .decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eBranch.InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c,
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
        ): InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e {
            val inspection = inspectInlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eNoMatchException(
                    "InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937e(
    element: JsonElement,
): InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c =
        element
            .isJsonDecodable<InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c>()
    return InlineV1WebhookEndpointsPostRequestFormMetadataXbc2d937eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c = matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c) {
                    add(
                        "InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c: value does not match InlineV1WebhookEndpointsPostRequestFormMetadataAnyOf2X61474b6c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
