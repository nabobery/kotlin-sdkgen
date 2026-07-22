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

public enum class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Branch {
    Branch1,
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1NoMatchException(
    message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/features/properties/subscription_update/properties/products
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Inspection,
) {
    public val branch1: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX4482dfe9>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX4482dfe9>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1) {
                json
                    .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Branch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1,
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
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1 {
            val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1NoMatchException(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1(
    element: JsonElement,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemX4482dfe9>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1 =
        element
            .isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1>()
    return InlineV1BillingPortalConfiab44PostRequestFormFeaturesProductsXf0f4d7e1Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1 = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1) {
                    add(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2X5fb9c9f1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
