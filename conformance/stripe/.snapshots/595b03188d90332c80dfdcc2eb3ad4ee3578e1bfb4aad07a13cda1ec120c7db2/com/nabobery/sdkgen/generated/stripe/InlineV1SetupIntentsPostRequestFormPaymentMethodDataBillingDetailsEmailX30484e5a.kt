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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aBranch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aNoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a {
            val inspection =
                inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aNoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701 =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X40473701",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
