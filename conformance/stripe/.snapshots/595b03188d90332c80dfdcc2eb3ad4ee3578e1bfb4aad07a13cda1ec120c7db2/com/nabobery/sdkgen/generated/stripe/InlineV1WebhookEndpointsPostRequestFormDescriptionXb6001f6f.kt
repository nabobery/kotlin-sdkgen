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

public enum class InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fBranch {
    Branch1,
    InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c,
}

public sealed class InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fNoMatchException(
    message: String,
) : InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fDecodingException(message)

internal data class InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c,
            ).count { it }
}

/**
 * An optional description of what the webhook is used for.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/description
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f.Serializer::class)
public class InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c:
        InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c) {
                json
                    .decodeFromJsonElement<InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c) {
                    add(
                        InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fBranch.InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c,
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
        ): InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f {
            val inspection = inspectInlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fNoMatchException(
                    "InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6f(
    element: JsonElement,
): InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c =
        element
            .isJsonDecodable<InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c>()
    return InlineV1WebhookEndpointsPostRequestFormDescriptionXb6001f6fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c = matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c) {
                    add(
                        "InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c: value does not match InlineV1WebhookEndpointsPostRequestFormDescriptionAnyOf2X810fdb5c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
