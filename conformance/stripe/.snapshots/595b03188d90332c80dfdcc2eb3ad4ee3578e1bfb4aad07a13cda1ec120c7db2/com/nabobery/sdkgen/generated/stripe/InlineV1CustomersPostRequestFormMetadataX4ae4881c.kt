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

public enum class InlineV1CustomersPostRequestFormMetadataX4ae4881cBranch {
    Branch1,
    InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e,
}

public sealed class InlineV1CustomersPostRequestFormMetadataX4ae4881cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormMetadataX4ae4881cNoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormMetadataX4ae4881cDecodingException(message)

internal data class InlineV1CustomersPostRequestFormMetadataX4ae4881cInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersPostRequestFormMetadataX4ae4881c.Serializer::class)
public class InlineV1CustomersPostRequestFormMetadataX4ae4881c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormMetadataX4ae4881cInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e:
        InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CustomersPostRequestFormMetadataX4ae4881cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormMetadataX4ae4881cBranch.Branch1)
                if (inspection.matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e) {
                    add(
                        InlineV1CustomersPostRequestFormMetadataX4ae4881cBranch.InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e,
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
        ): InlineV1CustomersPostRequestFormMetadataX4ae4881c {
            val inspection = inspectInlineV1CustomersPostRequestFormMetadataX4ae4881c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormMetadataX4ae4881cNoMatchException(
                    "InlineV1CustomersPostRequestFormMetadataX4ae4881c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormMetadataX4ae4881c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormMetadataX4ae4881c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormMetadataX4ae4881c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormMetadataX4ae4881c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormMetadataX4ae4881c,
        ) {
            encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormMetadataX4ae4881c").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormMetadataX4ae4881c(
    element: JsonElement,
): InlineV1CustomersPostRequestFormMetadataX4ae4881cInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e>()
    return InlineV1CustomersPostRequestFormMetadataX4ae4881cInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e = matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e) {
                    add(
                        "InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e: value does not match InlineV1CustomersPostRequestFormMetadataAnyOf2X129f5b1e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
