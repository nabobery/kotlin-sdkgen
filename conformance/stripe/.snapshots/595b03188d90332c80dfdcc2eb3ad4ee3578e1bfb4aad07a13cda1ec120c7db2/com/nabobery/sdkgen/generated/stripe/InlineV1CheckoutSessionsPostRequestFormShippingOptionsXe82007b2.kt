package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Branch {
    Branch1,
    InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2NoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e).count {
                it
            }
}

/**
 * The shipping rate options to apply to this Session. Up to a maximum of 5.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Inspection,
) {
    public val branch1:
        List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Branch.InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e,
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
        ): InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2 {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2NoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemX4122261a>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e>()
    return InlineV1CheckoutSessionsPostRequestFormShippingOptionsXe82007b2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e = matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e: value does not match InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
