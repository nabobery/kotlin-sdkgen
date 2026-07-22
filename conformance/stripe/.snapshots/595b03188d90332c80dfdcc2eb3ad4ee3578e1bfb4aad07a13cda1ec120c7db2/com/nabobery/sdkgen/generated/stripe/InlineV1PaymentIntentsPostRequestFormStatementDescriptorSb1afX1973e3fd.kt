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

public enum class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdBranch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806,
}

public sealed class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdNoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_ka
 * nji.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_ka
 * nji
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806,
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
        ): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdNoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fd(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806>()
    return InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afX1973e3fdInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xb9e01806",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
