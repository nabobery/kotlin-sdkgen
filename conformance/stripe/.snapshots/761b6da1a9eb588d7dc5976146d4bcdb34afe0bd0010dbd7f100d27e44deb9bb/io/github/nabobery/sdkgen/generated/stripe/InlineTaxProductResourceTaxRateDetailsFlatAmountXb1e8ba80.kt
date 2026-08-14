package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Branch {
  TaxRateFlatAmount,
}

public sealed class InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80NoMatchException(
  message: String,
) : InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80DecodingException(message)

internal data class InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_rate_details/properties/flat_amount
 */
@Serializable(with = InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80.Serializer::class)
public class InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Inspection,
) {
  public val taxRateFlatAmount: TaxRateFlatAmountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxRateFlatAmount) json.decodeFromJsonElement<TaxRateFlatAmountView>(raw) else null }

  public val matchedBranches: Set<InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Branch>
    get() = buildSet {
      if (inspection.matchesTaxRateFlatAmount) add(InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Branch.TaxRateFlatAmount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80 {
      val inspection = inspectInlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80NoMatchException("InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80) {
      encoder.requireJsonEncoder("InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80(element: JsonElement): InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Inspection {
  val raw = element as? JsonObject ?: return InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Inspection(
    matchesTaxRateFlatAmount = false,
    failures = listOf("TaxRateFlatAmount: expected JSON object"),
  )
  val matchesTaxRateFlatAmount = raw["amount"] != null && raw["currency"].isString()
  return InlineTaxProductResourceTaxRateDetailsFlatAmountXb1e8ba80Inspection(
    matchesTaxRateFlatAmount = matchesTaxRateFlatAmount,
    failures = buildList {
      if (!matchesTaxRateFlatAmount) add("TaxRateFlatAmount: required properties 'amount', 'currency' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
