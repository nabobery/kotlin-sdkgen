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

public enum class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bBranch {
    Branch1,
    InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7,
}

public sealed class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bNoMatchException(
    message: String,
) : InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bInspection,
) {
    public val branch1: Double? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

    public val inlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7:
        InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7) {
                    add(
                        InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bBranch.InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7,
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
        ): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b {
            val inspection = inspectInlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bNoMatchException(
                    "InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883b(
    element: JsonElement,
): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bInspection {
    val matchesBranch1 = element.isJsonDecodable<Double>()
    val matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7 =
        element
            .isJsonDecodable<InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7>()
    return InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXa456883bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7 = matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Double")
                if (!matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7) {
                    add(
                        "InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7: value does not match InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X0c807ef7",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
