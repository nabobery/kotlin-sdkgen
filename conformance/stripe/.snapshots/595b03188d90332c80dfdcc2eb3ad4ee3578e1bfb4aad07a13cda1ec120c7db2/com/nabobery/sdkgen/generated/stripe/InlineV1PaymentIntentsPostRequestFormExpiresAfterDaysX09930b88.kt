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

public enum class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759,
}

public sealed class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_after_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_after_days
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759,
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
        ): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759>()
    return InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysX09930b88Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xfbee0759",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
