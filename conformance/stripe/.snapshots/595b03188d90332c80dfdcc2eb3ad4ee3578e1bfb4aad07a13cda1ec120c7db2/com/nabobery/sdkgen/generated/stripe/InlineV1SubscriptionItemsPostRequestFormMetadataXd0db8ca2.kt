package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Branch {
    Branch1,
    InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2NoMatchException(
    message: String,
) : InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993:
        InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993) {
                    add(
                        InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Branch.InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993,
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
        ): InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2 {
            val inspection = inspectInlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2NoMatchException(
                    "InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2(
    element: JsonElement,
): InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993 =
        element
            .isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993>()
    return InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993 = matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993) {
                    add(
                        "InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993: value does not match InlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
