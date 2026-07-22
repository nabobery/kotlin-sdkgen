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

public enum class InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Branch {
    InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e,
    Branch2,
}

public sealed class InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8NoMatchException(
    message: String,
) : InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8DecodingException(message)

internal data class InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Inspection(
    public val matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e, matchesBranch2).count { it }
}

/**
 * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/card
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8.Serializer::class)
public class InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Inspection,
) {
    public val inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e:
        InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e>(
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

    public val matchedBranches: Set<InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e) {
                    add(
                        InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Branch.InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8 {
            val inspection = inspectInlineV1CustomersSourcesPostRequestFormCardXaca4ebd8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8NoMatchException(
                    "InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSourcesPostRequestFormCardXaca4ebd8(
    element: JsonElement,
): InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Inspection {
    val matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e =
        element
            .isJsonDecodable<InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e>()
    val matchesBranch2 = element.isJsonDecodable<String>()
    return InlineV1CustomersSourcesPostRequestFormCardXaca4ebd8Inspection(
        matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e = matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e) {
                    add(
                        "InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e: value does not match InlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e",
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
