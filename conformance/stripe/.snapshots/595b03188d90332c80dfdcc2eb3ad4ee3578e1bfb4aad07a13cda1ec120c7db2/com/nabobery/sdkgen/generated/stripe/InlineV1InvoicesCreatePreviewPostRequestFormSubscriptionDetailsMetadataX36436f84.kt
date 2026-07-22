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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Branch {
    Branch1,
    InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84NoMatchException(
    message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/metadata
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035:
        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035) {
                    add(
                        InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035,
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
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84 {
            val inspection =
                inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84NoMatchException(
                    "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84(
    element: JsonElement,
): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035 =
        element
            .isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035>()
    return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsMetadataX36436f84Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035) {
                    add(
                        "InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2Xebbf5035",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
