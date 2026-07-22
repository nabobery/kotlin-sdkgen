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

public enum class InlineV1CustomersPostRequestFormAddressX54fa48b0Branch {
    InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b,
    InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c,
}

public sealed class InlineV1CustomersPostRequestFormAddressX54fa48b0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormAddressX54fa48b0NoMatchException(
    message: String,
) : InlineV1CustomersPostRequestFormAddressX54fa48b0DecodingException(message)

internal data class InlineV1CustomersPostRequestFormAddressX54fa48b0Inspection(
    public val matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b: Boolean,
    public val matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b,
                matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c,
            ).count {
                it
            }
}

/**
 * The customer's address. Learn about [country-specific requirements for calculating
 * tax](https://docs.stripe.com/invoicing/taxes?dashboard-or-api=dashboard#set-up-customer).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/address
 */
@Serializable(with = InlineV1CustomersPostRequestFormAddressX54fa48b0.Serializer::class)
public class InlineV1CustomersPostRequestFormAddressX54fa48b0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersPostRequestFormAddressX54fa48b0Inspection,
) {
    public val inlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b:
        InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c:
        InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c) {
                json
                    .decodeFromJsonElement<InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CustomersPostRequestFormAddressX54fa48b0Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b) {
                    add(
                        InlineV1CustomersPostRequestFormAddressX54fa48b0Branch.InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b,
                    )
                }
                if (inspection.matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c) {
                    add(
                        InlineV1CustomersPostRequestFormAddressX54fa48b0Branch.InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c,
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
        ): InlineV1CustomersPostRequestFormAddressX54fa48b0 {
            val inspection = inspectInlineV1CustomersPostRequestFormAddressX54fa48b0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersPostRequestFormAddressX54fa48b0NoMatchException(
                    "InlineV1CustomersPostRequestFormAddressX54fa48b0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersPostRequestFormAddressX54fa48b0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormAddressX54fa48b0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormAddressX54fa48b0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormAddressX54fa48b0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormAddressX54fa48b0,
        ) {
            encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormAddressX54fa48b0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersPostRequestFormAddressX54fa48b0(
    element: JsonElement,
): InlineV1CustomersPostRequestFormAddressX54fa48b0Inspection {
    val matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b>()
    val matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c =
        element
            .isJsonDecodable<InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c>()
    return InlineV1CustomersPostRequestFormAddressX54fa48b0Inspection(
        matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b = matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b,
        matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c = matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c,
        failures =
            buildList {
                if (!matchesInlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b) {
                    add(
                        "InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b: value does not match InlineV1CustomersPostRequestFormAddressAnyOf1X3332e09b",
                    )
                }
                if (!matchesInlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c) {
                    add(
                        "InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c: value does not match InlineV1CustomersPostRequestFormAddressAnyOf2Xfe16359c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
