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

public enum class InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Branch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f,
}

public sealed class InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54NoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f:
        InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Branch.Branch1)
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f) {
                    add(
                        InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Branch.InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f,
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
        ): InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54 {
            val inspection = inspectInlineV1SetupIntentsPostRequestFormMetadataX0f37cb54(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54NoMatchException(
                    "InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormMetadataX0f37cb54(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f>()
    return InlineV1SetupIntentsPostRequestFormMetadataX0f37cb54Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f = matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f: value does not match InlineV1SetupIntentsPostRequestFormMetadataAnyOf2Xa3f5948f",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
