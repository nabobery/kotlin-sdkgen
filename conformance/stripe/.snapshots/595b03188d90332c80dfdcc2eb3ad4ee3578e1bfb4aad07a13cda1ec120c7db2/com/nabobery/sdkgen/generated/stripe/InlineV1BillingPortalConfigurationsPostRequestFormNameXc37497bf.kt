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

public enum class InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfBranch {
    Branch1,
    InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf,
}

public sealed class InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfNoMatchException(
    message: String,
) : InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfDecodingException(message)

internal data class InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(matchesBranch1, matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf).count {
                it
            }
}

/**
 * The name of the configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/name
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf:
        InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf) {
                json
                    .decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf) {
                    add(
                        InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfBranch.InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf,
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
        ): InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf {
            val inspection = inspectInlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfNoMatchException(
                    "InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf(
    element: JsonElement,
): InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf =
        element
            .isJsonDecodable<InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf>()
    return InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bfInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf = matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf) {
                    add(
                        "InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf: value does not match InlineV1BillingPortalConfigurationsPostRequestFormNameAnyOf2Xf3aff0cf",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
