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
import kotlin.Double
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Branch {
    Branch1,
    InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d,
}

public sealed class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4NoMatchException(
    message: String,
) : InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Inspection,
) {
    public val branch1: Double? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

    public val inlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d:
        InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Branch.InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d,
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
        ): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4 {
            val inspection = inspectInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4NoMatchException(
                    "InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4(
    element: JsonElement,
): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Inspection {
    val matchesBranch1 = element.isJsonDecodable<Double>()
    val matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d>()
    return InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipXe014d5b4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d = matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Double")
                if (!matchesInlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d: value does not match InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X0d88108d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
