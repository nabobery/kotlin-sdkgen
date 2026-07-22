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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dBranch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030d(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtX8c18030dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xef8a8531",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
