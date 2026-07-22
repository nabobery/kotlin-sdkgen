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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Branch {
    Branch1,
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473NoMatchException(
    message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875,
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473 {
            val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473NoMatchException(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473(
    element: JsonElement,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875 =
        element
            .isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875>()
    return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataEmailXe67bf473Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875) {
                    add(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X32030875",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
