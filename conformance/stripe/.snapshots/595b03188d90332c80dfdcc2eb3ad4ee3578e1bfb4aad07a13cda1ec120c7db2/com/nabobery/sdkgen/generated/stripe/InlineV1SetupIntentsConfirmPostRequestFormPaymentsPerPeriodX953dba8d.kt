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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dBranch {
    Branch1,
    InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dNoMatchException(
    message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dDecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/pay
 * ments_per_period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/pay
 * ments_per_period
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dInspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5) {
                json
                    .decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5) {
                    add(
                        InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dBranch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5,
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
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d {
            val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dNoMatchException(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8d(
    element: JsonElement,
): InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dInspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5 =
        element
            .isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5>()
    return InlineV1SetupIntentsConfirmPostRequestFormPaymentsPerPeriodX953dba8dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5) {
                    add(
                        "InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X7984aba5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
