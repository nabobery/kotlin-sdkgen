package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
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

public enum class InlineTaxCalculationShippingCostXdd462a1aBranch {
  TaxProductResourceTaxCalculationShippingCost,
}

public sealed class InlineTaxCalculationShippingCostXdd462a1aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxCalculationShippingCostXdd462a1aNoMatchException(
  message: String,
) : InlineTaxCalculationShippingCostXdd462a1aDecodingException(message)

internal data class InlineTaxCalculationShippingCostXdd462a1aInspection(
  public val matchesTaxProductResourceTaxCalculationShippingCost: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceTaxCalculationShippingCost).count { it }
}

/**
 * The shipping cost details for the calculation.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.calculation/properties/shipping_cost
 */
@Serializable(with = InlineTaxCalculationShippingCostXdd462a1a.Serializer::class)
public class InlineTaxCalculationShippingCostXdd462a1a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxCalculationShippingCostXdd462a1aInspection,
) {
  public val taxProductResourceTaxCalculationShippingCost:
      TaxProductResourceTaxCalculationShippingCostView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceTaxCalculationShippingCost) json.decodeFromJsonElement<TaxProductResourceTaxCalculationShippingCostView>(raw) else null }

  public val matchedBranches: Set<InlineTaxCalculationShippingCostXdd462a1aBranch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceTaxCalculationShippingCost) add(InlineTaxCalculationShippingCostXdd462a1aBranch.TaxProductResourceTaxCalculationShippingCost)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxCalculationShippingCostXdd462a1a {
      val inspection = inspectInlineTaxCalculationShippingCostXdd462a1a(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxCalculationShippingCostXdd462a1aNoMatchException("InlineTaxCalculationShippingCostXdd462a1a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxCalculationShippingCostXdd462a1a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxCalculationShippingCostXdd462a1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxCalculationShippingCostXdd462a1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxCalculationShippingCostXdd462a1a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxCalculationShippingCostXdd462a1a) {
      encoder.requireJsonEncoder("InlineTaxCalculationShippingCostXdd462a1a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxCalculationShippingCostXdd462a1a(element: JsonElement): InlineTaxCalculationShippingCostXdd462a1aInspection {
  val raw = element as? JsonObject ?: return InlineTaxCalculationShippingCostXdd462a1aInspection(
    matchesTaxProductResourceTaxCalculationShippingCost = false,
    failures = listOf("TaxProductResourceTaxCalculationShippingCost: expected JSON object"),
  )
  val matchesTaxProductResourceTaxCalculationShippingCost = raw["amount"] != null && raw["amount_tax"] != null && raw["tax_behavior"] != null && raw["tax_code"].isString()
  return InlineTaxCalculationShippingCostXdd462a1aInspection(
    matchesTaxProductResourceTaxCalculationShippingCost = matchesTaxProductResourceTaxCalculationShippingCost,
    failures = buildList {
      if (!matchesTaxProductResourceTaxCalculationShippingCost) add("TaxProductResourceTaxCalculationShippingCost: required properties 'amount', 'amount_tax', 'tax_behavior', 'tax_code' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
