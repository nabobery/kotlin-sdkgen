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

public enum class InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fBranch {
    InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97,
    InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180,
}

public sealed class InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fInspection(
    public val matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97,
                matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180,
            ).count {
                it
            }
}

/**
 * Settings that restrict the usage of a payment link.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/restrictions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fInspection,
) {
    public val inlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97:
        InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180:
        InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97) {
                    add(
                        InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fBranch.InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180) {
                    add(
                        InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fBranch.InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180,
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
        ): InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormRestrictionsX46016f8f(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fInspection {
    val matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97>()
    val matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180>()
    return InlineV1PaymentLinksPostRequestFormRestrictionsX46016f8fInspection(
        matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97 = matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97,
        matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180 = matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180,
        failures =
            buildList {
                if (!matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97: value does not match InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf1Xf7724c97",
                    )
                }
                if (!matchesInlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180: value does not match InlineV1PaymentLinksPostRequestFormRestrictionsAnyOf2X517e1180",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
