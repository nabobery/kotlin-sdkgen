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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaBranch {
    Branch1,
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaNoMatchException(
    message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaDecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaBranch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387,
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea {
            val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaNoMatchException(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1ea(
    element: JsonElement,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387 =
        element
            .isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387>()
    return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNameXde50d1eaInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387) {
                    add(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32bcd387",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
