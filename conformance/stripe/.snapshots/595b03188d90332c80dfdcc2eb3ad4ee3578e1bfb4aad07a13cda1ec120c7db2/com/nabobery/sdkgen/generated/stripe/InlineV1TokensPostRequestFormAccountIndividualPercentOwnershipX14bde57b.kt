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

public enum class InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bBranch {
    Branch1,
    InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe,
}

public sealed class InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bNoMatchException(
    message: String,
) : InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bDecodingException(message)

internal data class InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bInspection,
) {
    public val branch1: Double? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

    public val inlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe:
        InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe) {
                json
                    .decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe) {
                    add(
                        InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bBranch.InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe,
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
        ): InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b {
            val inspection = inspectInlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bNoMatchException(
                    "InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57b(
    element: JsonElement,
): InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bInspection {
    val matchesBranch1 = element.isJsonDecodable<Double>()
    val matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe =
        element
            .isJsonDecodable<InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe>()
    return InlineV1TokensPostRequestFormAccountIndividualPercentOwnershipX14bde57bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe = matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Double")
                if (!matchesInlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe) {
                    add(
                        "InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe: value does not match InlineV1TokensPostRequestFormAccountIndividualRelationshipAnyOf2X07571ebe",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
