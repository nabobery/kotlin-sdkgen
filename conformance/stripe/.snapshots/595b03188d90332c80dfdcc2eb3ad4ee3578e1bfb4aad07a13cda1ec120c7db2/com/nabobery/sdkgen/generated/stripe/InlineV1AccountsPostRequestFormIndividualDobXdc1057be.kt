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

public enum class InlineV1AccountsPostRequestFormIndividualDobXdc1057beBranch {
    InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972,
    InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853,
}

public sealed class InlineV1AccountsPostRequestFormIndividualDobXdc1057beDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualDobXdc1057beNoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormIndividualDobXdc1057beDecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualDobXdc1057beInspection(
    public val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972: Boolean,
    public val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972,
                matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/dob.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/dob
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualDobXdc1057be.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualDobXdc1057be internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormIndividualDobXdc1057beInspection,
) {
    public val inlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972:
        InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853:
        InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1AccountsPostRequestFormIndividualDobXdc1057beBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972) {
                    add(
                        InlineV1AccountsPostRequestFormIndividualDobXdc1057beBranch.InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972,
                    )
                }
                if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853) {
                    add(
                        InlineV1AccountsPostRequestFormIndividualDobXdc1057beBranch.InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853,
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
        ): InlineV1AccountsPostRequestFormIndividualDobXdc1057be {
            val inspection = inspectInlineV1AccountsPostRequestFormIndividualDobXdc1057be(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormIndividualDobXdc1057beNoMatchException(
                    "InlineV1AccountsPostRequestFormIndividualDobXdc1057be matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormIndividualDobXdc1057be(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualDobXdc1057be> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualDobXdc1057be {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualDobXdc1057be")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualDobXdc1057be,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormIndividualDobXdc1057be",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualDobXdc1057be(
    element: JsonElement,
): InlineV1AccountsPostRequestFormIndividualDobXdc1057beInspection {
    val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972 =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972>()
    val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853 =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853>()
    return InlineV1AccountsPostRequestFormIndividualDobXdc1057beInspection(
        matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972 = matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972,
        matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853 = matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853,
        failures =
            buildList {
                if (!matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972) {
                    add(
                        "InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972: value does not match InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xd51c4972",
                    )
                }
                if (!matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853) {
                    add(
                        "InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853: value does not match InlineV1AccountsPostRequestFormIndividualDobAnyOf2X04b4b853",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
