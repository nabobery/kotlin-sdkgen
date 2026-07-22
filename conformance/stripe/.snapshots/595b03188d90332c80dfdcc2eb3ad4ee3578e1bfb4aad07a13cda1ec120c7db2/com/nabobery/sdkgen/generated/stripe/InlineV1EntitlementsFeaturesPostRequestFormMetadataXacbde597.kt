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

public enum class InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Branch {
    Branch1,
    InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695,
}

public sealed class InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597NoMatchException(
    message: String,
) : InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597DecodingException(message)

internal data class InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695,
            ).count { it }
}

/**
 * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about
 * the object in a structured format.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597.Serializer::class)
public class InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695:
        InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695) {
                json
                    .decodeFromJsonElement<InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695) {
                    add(
                        InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Branch.InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695,
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
        ): InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597 {
            val inspection = inspectInlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597NoMatchException(
                    "InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597(
    element: JsonElement,
): InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 =
        element
            .isJsonDecodable<InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695>()
    return InlineV1EntitlementsFeaturesPostRequestFormMetadataXacbde597Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 = matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695) {
                    add(
                        "InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695: value does not match InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
