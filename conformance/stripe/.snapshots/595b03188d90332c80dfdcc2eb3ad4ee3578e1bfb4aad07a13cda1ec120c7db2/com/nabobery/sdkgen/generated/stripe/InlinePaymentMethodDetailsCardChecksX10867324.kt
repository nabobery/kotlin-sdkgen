package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlinePaymentMethodDetailsCardChecksX10867324Branch {
    PaymentMethodDetailsCardChecks,
}

public sealed class InlinePaymentMethodDetailsCardChecksX10867324DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardChecksX10867324NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsCardChecksX10867324DecodingException(message)

internal data class InlinePaymentMethodDetailsCardChecksX10867324Inspection(
    public val matchesPaymentMethodDetailsCardChecks: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentMethodDetailsCardChecks).count { it }
}

/**
 * Check results by Card networks on Card address and CVC at time of payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/checks
 */
@Serializable(with = InlinePaymentMethodDetailsCardChecksX10867324.Serializer::class)
public class InlinePaymentMethodDetailsCardChecksX10867324 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsCardChecksX10867324Inspection,
) {
    public val paymentMethodDetailsCardChecks: PaymentMethodDetailsCardChecksView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentMethodDetailsCardChecks) {
                json
                    .decodeFromJsonElement<PaymentMethodDetailsCardChecksView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsCardChecksX10867324Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentMethodDetailsCardChecks) {
                    add(
                        InlinePaymentMethodDetailsCardChecksX10867324Branch.PaymentMethodDetailsCardChecks,
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
        ): InlinePaymentMethodDetailsCardChecksX10867324 {
            val inspection = inspectInlinePaymentMethodDetailsCardChecksX10867324(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsCardChecksX10867324NoMatchException(
                    "InlinePaymentMethodDetailsCardChecksX10867324 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsCardChecksX10867324(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsCardChecksX10867324> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardChecksX10867324 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardChecksX10867324")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsCardChecksX10867324,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardChecksX10867324").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsCardChecksX10867324(
    element: JsonElement,
): InlinePaymentMethodDetailsCardChecksX10867324Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsCardChecksX10867324Inspection(
            matchesPaymentMethodDetailsCardChecks = false,
            failures = listOf("PaymentMethodDetailsCardChecks: expected JSON object"),
        )
    val matchesPaymentMethodDetailsCardChecks = true
    return InlinePaymentMethodDetailsCardChecksX10867324Inspection(
        matchesPaymentMethodDetailsCardChecks = matchesPaymentMethodDetailsCardChecks,
        failures =
            buildList {
                if (!matchesPaymentMethodDetailsCardChecks) {
                    add(
                        "PaymentMethodDetailsCardChecks: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
