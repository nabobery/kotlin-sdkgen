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

public enum class InlineTaxRateFlatAmountXa35356a0Branch {
    TaxRateFlatAmount,
}

public sealed class InlineTaxRateFlatAmountXa35356a0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTaxRateFlatAmountXa35356a0NoMatchException(
    message: String,
) : InlineTaxRateFlatAmountXa35356a0DecodingException(message)

internal data class InlineTaxRateFlatAmountXa35356a0Inspection(
    public val matchesTaxRateFlatAmount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTaxRateFlatAmount).count { it }
}

/**
 * The amount of the tax rate when the `rate_type` is `flat_amount`. Tax rates with `rate_type` `percentage` can vary
 * based on the transaction, resulting in this field being `null`. This field exposes the amount and currency of the
 * flat tax rate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_rate/properties/flat_amount
 */
@Serializable(with = InlineTaxRateFlatAmountXa35356a0.Serializer::class)
public class InlineTaxRateFlatAmountXa35356a0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTaxRateFlatAmountXa35356a0Inspection,
) {
    public val taxRateFlatAmount: TaxRateFlatAmountView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTaxRateFlatAmount) json.decodeFromJsonElement<TaxRateFlatAmountView>(raw) else null
        }

    public val matchedBranches: Set<InlineTaxRateFlatAmountXa35356a0Branch>
        get() =
            buildSet {
                if (inspection.matchesTaxRateFlatAmount) add(InlineTaxRateFlatAmountXa35356a0Branch.TaxRateFlatAmount)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTaxRateFlatAmountXa35356a0 {
            val inspection = inspectInlineTaxRateFlatAmountXa35356a0(raw)
            if (inspection.matchCount == 0) {
                throw InlineTaxRateFlatAmountXa35356a0NoMatchException(
                    "InlineTaxRateFlatAmountXa35356a0 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineTaxRateFlatAmountXa35356a0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTaxRateFlatAmountXa35356a0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTaxRateFlatAmountXa35356a0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTaxRateFlatAmountXa35356a0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxRateFlatAmountXa35356a0,
        ) {
            encoder.requireJsonEncoder("InlineTaxRateFlatAmountXa35356a0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTaxRateFlatAmountXa35356a0(element: JsonElement): InlineTaxRateFlatAmountXa35356a0Inspection {
    val raw =
        element as? JsonObject ?: return InlineTaxRateFlatAmountXa35356a0Inspection(
            matchesTaxRateFlatAmount = false,
            failures = listOf("TaxRateFlatAmount: expected JSON object"),
        )
    val matchesTaxRateFlatAmount = raw["amount"] != null && raw["currency"].isString()
    return InlineTaxRateFlatAmountXa35356a0Inspection(
        matchesTaxRateFlatAmount = matchesTaxRateFlatAmount,
        failures =
            buildList {
                if (!matchesTaxRateFlatAmount) {
                    add(
                        "TaxRateFlatAmount: required properties 'amount', 'currency' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
