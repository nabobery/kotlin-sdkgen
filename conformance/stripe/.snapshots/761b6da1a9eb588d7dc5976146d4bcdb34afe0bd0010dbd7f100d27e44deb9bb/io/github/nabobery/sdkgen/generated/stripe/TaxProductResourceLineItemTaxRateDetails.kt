package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxProductResourceLineItemTaxRateDetailsView(
  @SerialName("display_name")
  public val displayName: String,
  @SerialName("percentage_decimal")
  public val percentageDecimal: String,
  @SerialName("tax_type")
  public val taxType: InlineTaxProductResourceLineItemTaxRateDetailsTaxTypeX451abf22,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_line_item_tax_rate_details
 */
@Serializable(with = TaxProductResourceLineItemTaxRateDetails.Serializer::class)
public class TaxProductResourceLineItemTaxRateDetails(
  /**
   * A localized display name for tax type, intended to be human-readable. For example, "Local Sales and Use Tax",
   * "Value-added tax (VAT)", or "Umsatzsteuer (USt.)".
   */
  public val displayName: String,
  /**
   * The tax rate percentage as a string. For example, 8.5% is represented as "8.5".
   */
  public val percentageDecimal: String,
  /**
   * The tax type, such as `vat` or `sales_tax`.
   */
  public val taxType: InlineTaxProductResourceLineItemTaxRateDetailsTaxTypeX451abf22,
) {
  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var percentageDecimalValue: String? = null

    public var percentageDecimal: String
      get() = requireNotNull(percentageDecimalValue) { "percentageDecimal is required" }
      set(`value`) {
        percentageDecimalValue = value
      }

    private var taxTypeValue: InlineTaxProductResourceLineItemTaxRateDetailsTaxTypeX451abf22? = null

    public var taxType: InlineTaxProductResourceLineItemTaxRateDetailsTaxTypeX451abf22
      get() = requireNotNull(taxTypeValue) { "taxType is required" }
      set(`value`) {
        taxTypeValue = value
      }

    public fun build(): TaxProductResourceLineItemTaxRateDetails {
      check(displayNameValue != null) { "displayName is required" }
      check(percentageDecimalValue != null) { "percentageDecimal is required" }
      check(taxTypeValue != null) { "taxType is required" }
      return TaxProductResourceLineItemTaxRateDetails(
        displayName = displayName,
        percentageDecimal = percentageDecimal,
        taxType = taxType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceLineItemTaxRateDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceLineItemTaxRateDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceLineItemTaxRateDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceLineItemTaxRateDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceLineItemTaxRateDetails must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val percentageDecimal = json.decodeRequired<String>(rawObject, "percentage_decimal")
      val taxType = json.decodeRequired<InlineTaxProductResourceLineItemTaxRateDetailsTaxTypeX451abf22>(rawObject, "tax_type")
      return TaxProductResourceLineItemTaxRateDetails(
        displayName = displayName,
        percentageDecimal = percentageDecimal,
        taxType = taxType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceLineItemTaxRateDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceLineItemTaxRateDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        put("percentage_decimal", value.percentageDecimal)
        put("tax_type", json.encodeToJsonElement(value.taxType))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceLineItemTaxRateDetails(block: TaxProductResourceLineItemTaxRateDetails.Builder.() -> Unit): TaxProductResourceLineItemTaxRateDetails = TaxProductResourceLineItemTaxRateDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceLineItemTaxRateDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
