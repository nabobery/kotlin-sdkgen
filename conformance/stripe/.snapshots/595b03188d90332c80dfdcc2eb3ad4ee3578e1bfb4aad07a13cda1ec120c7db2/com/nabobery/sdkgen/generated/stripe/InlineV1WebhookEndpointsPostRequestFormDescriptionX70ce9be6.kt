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

public enum class InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Branch {
    Branch1,
    InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662,
}

public sealed class InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6NoMatchException(
    message: String,
) : InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6DecodingException(message)

internal data class InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662,
            ).count { it }
}

/**
 * An optional description of what the webhook is used for.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints~1{webhook_endpoint}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/description
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662:
        InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662) {
                json
                    .decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Branch.InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662,
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
        ): InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6 {
            val inspection = inspectInlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6NoMatchException(
                    "InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6(
    element: JsonElement,
): InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662 =
        element
            .isJsonDecodable<InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662>()
    return InlineV1WebhookEndpointsPostRequestFormDescriptionX70ce9be6Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662 = matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662) {
                    add(
                        "InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662: value does not match InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X11660662",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
