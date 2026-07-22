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

public enum class InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Branch {
    Branch1,
    InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1,
}

public sealed class InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213NoMatchException(
    message: String,
) : InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213DecodingException(message)

internal data class InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/business_profile/properties/terms_of_service_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations~1{configuration}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema/properties/business_profile/properties/terms_of_service_url
 */
@Serializable(with = InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213.Serializer::class)
public class InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1:
        InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1) {
                json
                    .decodeFromJsonElement<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1) {
                    add(
                        InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Branch.InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1,
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
        ): InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213 {
            val inspection = inspectInlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213NoMatchException(
                    "InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213(
    element: JsonElement,
): InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1 =
        element
            .isJsonDecodable<InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1>()
    return InlineV1BillingPortalConfiab44PostRequestFormTermsOfServiceUrlX8d7a5213Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1 = matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1) {
                    add(
                        "InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1: value does not match InlineV1BillingPortalConfiab44PostRequestFormBusinessProfileAnyOf2X69531ce1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
