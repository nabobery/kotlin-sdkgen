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

public enum class InlineV1CustomersPostRequestFormMetadataXc4710090Branch {
    Branch1,
    InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa,
}

public sealed class InlineV1CustomersPostRequestFormMetadataXc4710090DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormMetadataXc4710090NoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormMetadataXc4710090DecodingException(message)

internal data class InlineV1CustomersPostRequestFormMetadataXc4710090Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/metadata
 */
@Serializable(with = InlineV1CustomersPostRequestFormMetadataXc4710090.Serializer::class)
public class InlineV1CustomersPostRequestFormMetadataXc4710090 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormMetadataXc4710090Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa:
        InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CustomersPostRequestFormMetadataXc4710090Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormMetadataXc4710090Branch.Branch1)
                if (inspection.matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa) {
                    add(
                        InlineV1CustomersPostRequestFormMetadataXc4710090Branch.InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa,
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
        ): InlineV1CustomersPostRequestFormMetadataXc4710090 {
            val inspection = inspectInlineV1CustomersPostRequestFormMetadataXc4710090(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormMetadataXc4710090NoMatchException(
                    "InlineV1CustomersPostRequestFormMetadataXc4710090 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormMetadataXc4710090(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormMetadataXc4710090> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormMetadataXc4710090 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormMetadataXc4710090")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormMetadataXc4710090,
        ) {
            encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormMetadataXc4710090").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormMetadataXc4710090(
    element: JsonElement,
): InlineV1CustomersPostRequestFormMetadataXc4710090Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa>()
    return InlineV1CustomersPostRequestFormMetadataXc4710090Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa = matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa) {
                    add(
                        "InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa: value does not match InlineV1CustomersPostRequestFormMetadataAnyOf2Xd3025eaa",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
