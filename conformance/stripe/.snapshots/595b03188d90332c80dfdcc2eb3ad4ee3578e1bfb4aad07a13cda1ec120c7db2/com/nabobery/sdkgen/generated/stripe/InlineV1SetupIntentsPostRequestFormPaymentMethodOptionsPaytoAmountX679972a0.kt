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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Branch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0NoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amount
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0 {
            val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0NoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07 =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07>()
    return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX679972a0Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X57f30d07",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
