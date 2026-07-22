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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40>()
    return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX6ea8adb0Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X96ce5f40",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
