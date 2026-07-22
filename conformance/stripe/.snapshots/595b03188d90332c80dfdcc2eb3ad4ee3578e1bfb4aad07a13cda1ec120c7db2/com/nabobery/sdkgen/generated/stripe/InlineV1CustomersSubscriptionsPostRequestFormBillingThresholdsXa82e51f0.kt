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

public enum class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Branch {
    InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4,
    InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Inspection(
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4,
                matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a,
            ).count {
                it
            }
}

/**
 * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
 * updating, pass an empty string to remove previously-defined thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/billing_thresholds
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Inspection,
) {
    public val inlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4:
        InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a:
        InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Branch.InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Branch.InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Inspection {
    val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4>()
    val matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a>()
    return InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsXa82e51f0Inspection(
        matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4 = matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4,
        matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a = matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a,
        failures =
            buildList {
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4: value does not match InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf1Xe547d2b4",
                    )
                }
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a: value does not match InlineV1CustomersSubscriptionsPostRequestFormBillingThresholdsAnyOf2X3821362a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
