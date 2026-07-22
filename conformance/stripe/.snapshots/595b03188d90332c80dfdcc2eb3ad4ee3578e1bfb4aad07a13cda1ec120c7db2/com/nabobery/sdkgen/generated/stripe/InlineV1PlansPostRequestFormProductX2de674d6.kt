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

public enum class InlineV1PlansPostRequestFormProductX2de674d6Branch {
    InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31,
    Branch2,
}

public sealed class InlineV1PlansPostRequestFormProductX2de674d6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PlansPostRequestFormProductX2de674d6NoMatchException(
    message: String,
) : InlineV1PlansPostRequestFormProductX2de674d6DecodingException(message)

internal data class InlineV1PlansPostRequestFormProductX2de674d6Inspection(
    public val matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/product.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/product
 */
@Serializable(with = InlineV1PlansPostRequestFormProductX2de674d6.Serializer::class)
public class InlineV1PlansPostRequestFormProductX2de674d6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PlansPostRequestFormProductX2de674d6Inspection,
) {
    public val inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31:
        InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31) {
                json
                    .decodeFromJsonElement<InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

    public val matchedBranches: Set<InlineV1PlansPostRequestFormProductX2de674d6Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31) {
                    add(
                        InlineV1PlansPostRequestFormProductX2de674d6Branch.InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1PlansPostRequestFormProductX2de674d6Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1PlansPostRequestFormProductX2de674d6 {
            val inspection = inspectInlineV1PlansPostRequestFormProductX2de674d6(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PlansPostRequestFormProductX2de674d6NoMatchException(
                    "InlineV1PlansPostRequestFormProductX2de674d6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PlansPostRequestFormProductX2de674d6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PlansPostRequestFormProductX2de674d6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormProductX2de674d6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansPostRequestFormProductX2de674d6")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PlansPostRequestFormProductX2de674d6,
        ) {
            encoder.requireJsonEncoder("InlineV1PlansPostRequestFormProductX2de674d6").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PlansPostRequestFormProductX2de674d6(
    element: JsonElement,
): InlineV1PlansPostRequestFormProductX2de674d6Inspection {
    val matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 =
        element
            .isJsonDecodable<InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31>()
    val matchesBranch2 = element.isJsonDecodable<String>()
    return InlineV1PlansPostRequestFormProductX2de674d6Inspection(
        matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 = matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1PlansPostRequestFormProductAnyOf1X83e9ef31) {
                    add(
                        "InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31: value does not match InlineV1PlansPostRequestFormProductAnyOf1X83e9ef31",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match String")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
