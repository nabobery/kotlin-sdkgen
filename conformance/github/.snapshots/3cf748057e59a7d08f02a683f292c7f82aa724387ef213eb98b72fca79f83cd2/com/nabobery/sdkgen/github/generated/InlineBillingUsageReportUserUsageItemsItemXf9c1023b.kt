package com.nabobery.sdkgen.github.generated

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report-user/properties/usageItems/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report-user/properties/usageItems/items
 */
@Serializable(with = InlineBillingUsageReportUserUsageItemsItemXf9c1023b.Serializer::class)
public class InlineBillingUsageReportUserUsageItemsItemXf9c1023b(
  /**
   * Date of the usage line item.
   */
  public val date: String,
  /**
   * Discount amount of the usage line item.
   */
  public val discountAmount: Double,
  /**
   * Gross amount of the usage line item.
   */
  public val grossAmount: Double,
  /**
   * Net amount of the usage line item.
   */
  public val netAmount: Double,
  /**
   * Price per unit of the usage line item.
   */
  public val pricePerUnit: Double,
  /**
   * Product name.
   */
  public val product: String,
  /**
   * Quantity of the usage line item.
   */
  public val quantity: Int,
  /**
   * SKU name.
   */
  public val sku: String,
  /**
   * Unit type of the usage line item.
   */
  public val unitType: String,
  /**
   * Name of the repository.
   */
  public val repositoryName: String? = null,
) {
  public class Builder {
    private var dateValue: String? = null

    public var date: String
      get() = requireNotNull(dateValue) { "date is required" }
      set(`value`) {
        dateValue = value
      }

    private var discountAmountValue: Double? = null

    public var discountAmount: Double
      get() = requireNotNull(discountAmountValue) { "discountAmount is required" }
      set(`value`) {
        discountAmountValue = value
      }

    private var grossAmountValue: Double? = null

    public var grossAmount: Double
      get() = requireNotNull(grossAmountValue) { "grossAmount is required" }
      set(`value`) {
        grossAmountValue = value
      }

    private var netAmountValue: Double? = null

    public var netAmount: Double
      get() = requireNotNull(netAmountValue) { "netAmount is required" }
      set(`value`) {
        netAmountValue = value
      }

    private var pricePerUnitValue: Double? = null

    public var pricePerUnit: Double
      get() = requireNotNull(pricePerUnitValue) { "pricePerUnit is required" }
      set(`value`) {
        pricePerUnitValue = value
      }

    private var productValue: String? = null

    public var product: String
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    private var quantityValue: Int? = null

    public var quantity: Int
      get() = requireNotNull(quantityValue) { "quantity is required" }
      set(`value`) {
        quantityValue = value
      }

    private var skuValue: String? = null

    public var sku: String
      get() = requireNotNull(skuValue) { "sku is required" }
      set(`value`) {
        skuValue = value
      }

    private var unitTypeValue: String? = null

    public var unitType: String
      get() = requireNotNull(unitTypeValue) { "unitType is required" }
      set(`value`) {
        unitTypeValue = value
      }

    /**
     * Name of the repository.
     */
    public var repositoryName: String? = null

    public fun build(): InlineBillingUsageReportUserUsageItemsItemXf9c1023b {
      check(dateValue != null) { "date is required" }
      check(discountAmountValue != null) { "discountAmount is required" }
      check(grossAmountValue != null) { "grossAmount is required" }
      check(netAmountValue != null) { "netAmount is required" }
      check(pricePerUnitValue != null) { "pricePerUnit is required" }
      check(productValue != null) { "product is required" }
      check(quantityValue != null) { "quantity is required" }
      check(skuValue != null) { "sku is required" }
      check(unitTypeValue != null) { "unitType is required" }
      return InlineBillingUsageReportUserUsageItemsItemXf9c1023b(
        date = date,
        discountAmount = discountAmount,
        grossAmount = grossAmount,
        netAmount = netAmount,
        pricePerUnit = pricePerUnit,
        product = product,
        quantity = quantity,
        sku = sku,
        unitType = unitType,
        repositoryName = repositoryName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingUsageReportUserUsageItemsItemXf9c1023b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBillingUsageReportUserUsageItemsItemXf9c1023b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingUsageReportUserUsageItemsItemXf9c1023b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingUsageReportUserUsageItemsItemXf9c1023b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingUsageReportUserUsageItemsItemXf9c1023b must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val discountAmount = json.decodeRequired<Double>(rawObject, "discountAmount")
      val grossAmount = json.decodeRequired<Double>(rawObject, "grossAmount")
      val netAmount = json.decodeRequired<Double>(rawObject, "netAmount")
      val pricePerUnit = json.decodeRequired<Double>(rawObject, "pricePerUnit")
      val product = json.decodeRequired<String>(rawObject, "product")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val sku = json.decodeRequired<String>(rawObject, "sku")
      val unitType = json.decodeRequired<String>(rawObject, "unitType")
      return InlineBillingUsageReportUserUsageItemsItemXf9c1023b(
        date = date,
        discountAmount = discountAmount,
        grossAmount = grossAmount,
        netAmount = netAmount,
        pricePerUnit = pricePerUnit,
        product = product,
        quantity = quantity,
        sku = sku,
        unitType = unitType,
        repositoryName = rawObject["repositoryName"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingUsageReportUserUsageItemsItemXf9c1023b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingUsageReportUserUsageItemsItemXf9c1023b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("discountAmount", json.encodeToJsonElement(value.discountAmount))
        put("grossAmount", json.encodeToJsonElement(value.grossAmount))
        put("netAmount", json.encodeToJsonElement(value.netAmount))
        put("pricePerUnit", json.encodeToJsonElement(value.pricePerUnit))
        put("product", value.product)
        put("quantity", json.encodeToJsonElement(value.quantity))
        put("sku", value.sku)
        put("unitType", value.unitType)
        value.repositoryName?.let { put("repositoryName", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBillingUsageReportUserUsageItemsItemXf9c1023b(block: InlineBillingUsageReportUserUsageItemsItemXf9c1023b.Builder.() -> Unit): InlineBillingUsageReportUserUsageItemsItemXf9c1023b = InlineBillingUsageReportUserUsageItemsItemXf9c1023b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingUsageReportUserUsageItemsItemXf9c1023b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
