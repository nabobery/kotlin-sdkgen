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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Branch {
    Branch1,
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55NoMatchException(
    message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end
 * _date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/end
 * _date
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265,
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55 {
            val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55NoMatchException(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55(
    element: JsonElement,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265 =
        element
            .isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265>()
    return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateX61308e55Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265) {
                    add(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X64c8e265",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
