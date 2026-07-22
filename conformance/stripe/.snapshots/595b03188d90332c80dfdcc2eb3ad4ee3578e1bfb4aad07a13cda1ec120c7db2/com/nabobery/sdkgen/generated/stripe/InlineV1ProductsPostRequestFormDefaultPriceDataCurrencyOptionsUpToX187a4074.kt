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

public enum class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Branch {
    InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5,
    Branch2,
}

public sealed class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074NoMatchException(
    message: String,
) : InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074DecodingException(message)

internal data class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Inspection(
    public val matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5,
                matchesBranch2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items/properties/up_
 * to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1products/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/default_price_data/properties/currency_options/additionalProperties/properties/tiers/items/properties/up_
 * to
 */
@Serializable(with = InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074.Serializer::class)
public class InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Inspection,
) {
    public val inlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5:
        InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5) {
                json
                    .decodeFromJsonElement<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

    public val matchedBranches:
        Set<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5) {
                    add(
                        InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Branch.InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5,
                    )
                }
                if (inspection.matchesBranch2) {
                    add(
                        InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Branch.Branch2,
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
        ): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074 {
            val inspection = inspectInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074NoMatchException(
                    "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074(
    element: JsonElement,
): InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Inspection {
    val matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 =
        element
            .isJsonDecodable<InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsUpToX187a4074Inspection(
        matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5 = matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5) {
                    add(
                        "InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5: value does not match InlineV1ProductsPostRequestFormDefaultPriceDataCurrencyOptionsAnyOf1X54a8ebc5",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
