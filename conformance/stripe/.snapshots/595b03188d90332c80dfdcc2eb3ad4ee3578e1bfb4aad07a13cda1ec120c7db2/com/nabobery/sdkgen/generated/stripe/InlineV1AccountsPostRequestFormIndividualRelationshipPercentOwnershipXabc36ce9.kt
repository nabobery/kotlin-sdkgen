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

public enum class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Branch {
    Branch1,
    InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827,
}

public sealed class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Inspection,
) {
    public val branch1: Double? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

    public val inlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827:
        InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827) {
                    add(
                        InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Branch.InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827,
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
        ): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9 {
            val inspection = inspectInlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9NoMatchException(
                    "InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9(
    element: JsonElement,
): InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Inspection {
    val matchesBranch1 = element.isJsonDecodable<Double>()
    val matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827 =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827>()
    return InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipXabc36ce9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827 = matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Double")
                if (!matchesInlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827) {
                    add(
                        "InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827: value does not match InlineV1AccountsPostRequestFormIndividualRelationshipAnyOf2Xcfee3827",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
