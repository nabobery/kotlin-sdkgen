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

public enum class InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Branch {
    Branch1,
    InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729,
}

public sealed class InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8NoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729,
            ).count { it }
}

/**
 * The custom message to be displayed to a customer when a payment link is no longer active.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/inactive_message
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729:
        InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Branch.InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729,
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
        ): InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8 {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8NoMatchException(
                    "InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729>()
    return InlineV1PaymentLinksPostRequestFormInactiveMessageX3e4cb4a8Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729 = matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729: value does not match InlineV1PaymentLinksPostRequestFormInactiveMessageAnyOf2Xa714e729",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
