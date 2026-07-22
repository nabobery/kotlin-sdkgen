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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Branch {
    Branch1,
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858NoMatchException(
    message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/pa
 * yments_per_period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/pa
 * yments_per_period
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a) {
                    add(
                        InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a,
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858 {
            val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858NoMatchException(
                    "InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858(
    element: JsonElement,
): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a =
        element
            .isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a>()
    return InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodX7ca58858Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a) {
                    add(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X8de9292a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
