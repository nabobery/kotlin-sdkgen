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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfBranch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfNoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf {
            val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfNoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bf(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountXf16fb4bfInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1940ea1b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
