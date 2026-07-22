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

public enum class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Branch {
    Branch1,
    InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05NoMatchException(
    message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per
 * _period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per
 * _period
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1) {
                    add(
                        InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1,
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
        ): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05 {
            val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05NoMatchException(
                    "InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05(
    element: JsonElement,
): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1 =
        element
            .isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1>()
    return InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX64fe4d05Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1) {
                    add(
                        "InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xb3ad79e1",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
