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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Branch {
    Branch1,
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159NoMatchException(
    message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8) {
                    add(
                        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8,
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
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159 {
            val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159NoMatchException(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159(
    element: JsonElement,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8>()
    return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataPhoneX61d2d159Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8) {
                    add(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X9f8ddba8",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
