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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Branch {
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Inspection(
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sunbit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sunbit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Inspection,
) {
    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Inspection {
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82Inspection(
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba",
                    )
                }
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf2Xda5a9d0a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
