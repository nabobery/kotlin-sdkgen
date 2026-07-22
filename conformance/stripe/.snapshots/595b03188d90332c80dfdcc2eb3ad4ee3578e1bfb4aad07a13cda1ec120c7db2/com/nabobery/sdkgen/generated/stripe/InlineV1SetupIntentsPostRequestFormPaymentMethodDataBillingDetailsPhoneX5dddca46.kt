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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Branch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46NoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46 {
            val inspection =
                inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46NoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX5dddca46Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X0774a83b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
