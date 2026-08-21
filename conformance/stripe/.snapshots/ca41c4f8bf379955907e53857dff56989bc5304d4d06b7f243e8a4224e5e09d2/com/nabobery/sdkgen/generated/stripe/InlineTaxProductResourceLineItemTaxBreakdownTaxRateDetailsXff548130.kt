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

public enum class InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Branch {
  TaxProductResourceLineItemTaxRateDetails,
}

public sealed class InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130NoMatchException(
  message: String,
) : InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130DecodingException(message)

internal data class InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Inspection(
  public val matchesTaxProductResourceLineItemTaxRateDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxProductResourceLineItemTaxRateDetails).count { it }
}

/**
 * Details regarding the rate for this tax. This field will be `null` when the tax is not imposed, for example if the
 * product is exempt from tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_line_item_tax_breakdown/properties/tax_rate_det
 * ails
 */
@Serializable(with = InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130.Serializer::class)
public class InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Inspection,
) {
  public val taxProductResourceLineItemTaxRateDetails: TaxProductResourceLineItemTaxRateDetailsView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxProductResourceLineItemTaxRateDetails) json.decodeFromJsonElement<TaxProductResourceLineItemTaxRateDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Branch>
    get() = buildSet {
      if (inspection.matchesTaxProductResourceLineItemTaxRateDetails) add(InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Branch.TaxProductResourceLineItemTaxRateDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130 {
      val inspection = inspectInlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130NoMatchException("InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130) {
      encoder.requireJsonEncoder("InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130(element: JsonElement): InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Inspection {
  val raw = element as? JsonObject ?: return InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Inspection(
    matchesTaxProductResourceLineItemTaxRateDetails = false,
    failures = listOf("TaxProductResourceLineItemTaxRateDetails: expected JSON object"),
  )
  val matchesTaxProductResourceLineItemTaxRateDetails = raw["display_name"].isString() && raw["percentage_decimal"].isString() && raw["tax_type"] != null
  return InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130Inspection(
    matchesTaxProductResourceLineItemTaxRateDetails = matchesTaxProductResourceLineItemTaxRateDetails,
    failures = buildList {
      if (!matchesTaxProductResourceLineItemTaxRateDetails) add("TaxProductResourceLineItemTaxRateDetails: required properties 'display_name', 'percentage_decimal', 'tax_type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
