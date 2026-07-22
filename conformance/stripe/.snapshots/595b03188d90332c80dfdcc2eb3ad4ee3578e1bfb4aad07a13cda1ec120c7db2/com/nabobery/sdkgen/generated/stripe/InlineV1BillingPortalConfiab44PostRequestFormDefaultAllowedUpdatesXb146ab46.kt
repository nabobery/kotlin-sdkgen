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

public enum class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Branch {
    Branch1,
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46NoMatchException(
    message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed_updates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/subscription_update/properties/default_allowed_updates
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Inspection,
) {
    public val branch1: List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d) {
                json
                    .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Branch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d,
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
        ): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46 {
            val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46NoMatchException(
                    "InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46(
    element: JsonElement,
): InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesItemXa5c17bd3>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d =
        element
            .isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d>()
    return InlineV1BillingPortalConfiab44PostRequestFormDefaultAllowedUpdatesXb146ab46Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d) {
                    add(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xc818563d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
