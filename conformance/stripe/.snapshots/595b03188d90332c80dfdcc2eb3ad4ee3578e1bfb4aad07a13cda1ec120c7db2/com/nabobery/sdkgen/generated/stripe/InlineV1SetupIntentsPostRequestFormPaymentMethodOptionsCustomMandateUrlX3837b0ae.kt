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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeBranch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeNoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_
 * mandate_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_
 * mandate_url
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae {
            val inspection =
                inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeNoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0ae(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509 =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCustomMandateUrlX3837b0aeInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitAnyOf2Xcdf33509",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
