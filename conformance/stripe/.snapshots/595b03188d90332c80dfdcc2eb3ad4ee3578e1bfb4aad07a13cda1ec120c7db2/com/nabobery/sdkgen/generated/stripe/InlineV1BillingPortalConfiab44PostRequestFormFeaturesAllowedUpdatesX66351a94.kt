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

public enum class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Branch {
    Branch1,
    InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94NoMatchException(
    message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/features/properties/customer_update/properties/allowed_updates
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Inspection,
) {
    public val branch1:
        List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemX502502e4>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemX502502e4>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377:
        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377) {
                json
                    .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Branch.InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377,
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
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94 {
            val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94NoMatchException(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94(
    element: JsonElement,
): InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1BillingPortalConfiab44PostRequestFormFeaturesCustomerUpdateItemX502502e4>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377 =
        element
            .isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377>()
    return InlineV1BillingPortalConfiab44PostRequestFormFeaturesAllowedUpdatesX66351a94Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377 = matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377) {
                    add(
                        "InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377: value does not match InlineV1BillingPortalConfiab44PostRequestFormFeaturesAnyOf2Xe1c9d377",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
