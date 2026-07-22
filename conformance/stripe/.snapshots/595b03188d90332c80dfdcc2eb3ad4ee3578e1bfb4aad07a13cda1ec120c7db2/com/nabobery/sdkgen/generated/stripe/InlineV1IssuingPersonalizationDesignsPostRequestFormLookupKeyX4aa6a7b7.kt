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

public enum class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Branch {
    Branch1,
    InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92,
}

public sealed class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7NoMatchException(
    message: String,
) : InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7DecodingException(message)

internal data class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92,
            ).count {
                it
            }
}

/**
 * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
 * characters.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/lookup_key
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92:
        InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92) {
                json
                    .decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92) {
                    add(
                        InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Branch.InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92,
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
        ): InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7 {
            val inspection = inspectInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7NoMatchException(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7(
    element: JsonElement,
): InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92 =
        element
            .isJsonDecodable<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92>()
    return InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92 = matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92) {
                    add(
                        "InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92: value does not match InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
