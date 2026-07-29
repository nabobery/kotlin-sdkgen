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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report/properties/usageItems/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/billing-usage-report/properties/usageItems/items
 */
@Serializable(with = InlineBillingUsageReportUsageItemsItemXd7a8f9c2.Serializer::class)
public class InlineBillingUsageReportUsageItemsItemXd7a8f9c2(
  /**
   * Date of the usage line item.
   */
  public val date: String,
  /**
   * Discount amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val discountAmount: Double,
  /**
   * Gross amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val grossAmount: Double,
  /**
   * Net amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val netAmount: Double,
  /**
   * Name of the organization.
   */
  public val organizationName: String,
  /**
   * Price per unit of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
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

    private var organizationNameValue: String? = null

    public var organizationName: String
      get() = requireNotNull(organizationNameValue) { "organizationName is required" }
      set(`value`) {
        organizationNameValue = value
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

    public fun build(): InlineBillingUsageReportUsageItemsItemXd7a8f9c2 {
      check(dateValue != null) { "date is required" }
      check(discountAmountValue != null) { "discountAmount is required" }
      check(grossAmountValue != null) { "grossAmount is required" }
      check(netAmountValue != null) { "netAmount is required" }
      check(organizationNameValue != null) { "organizationName is required" }
      check(pricePerUnitValue != null) { "pricePerUnit is required" }
      check(productValue != null) { "product is required" }
      check(quantityValue != null) { "quantity is required" }
      check(skuValue != null) { "sku is required" }
      check(unitTypeValue != null) { "unitType is required" }
      return InlineBillingUsageReportUsageItemsItemXd7a8f9c2(
        date = date,
        discountAmount = discountAmount,
        grossAmount = grossAmount,
        netAmount = netAmount,
        organizationName = organizationName,
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
    public fun build(block: Builder.() -> Unit): InlineBillingUsageReportUsageItemsItemXd7a8f9c2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBillingUsageReportUsageItemsItemXd7a8f9c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingUsageReportUsageItemsItemXd7a8f9c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingUsageReportUsageItemsItemXd7a8f9c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingUsageReportUsageItemsItemXd7a8f9c2 must be a JSON object")
      val date = json.decodeRequired<String>(rawObject, "date")
      val discountAmount = json.decodeRequired<Double>(rawObject, "discountAmount")
      val grossAmount = json.decodeRequired<Double>(rawObject, "grossAmount")
      val netAmount = json.decodeRequired<Double>(rawObject, "netAmount")
      val organizationName = json.decodeRequired<String>(rawObject, "organizationName")
      val pricePerUnit = json.decodeRequired<Double>(rawObject, "pricePerUnit")
      val product = json.decodeRequired<String>(rawObject, "product")
      val quantity = json.decodeRequired<Int>(rawObject, "quantity")
      val sku = json.decodeRequired<String>(rawObject, "sku")
      val unitType = json.decodeRequired<String>(rawObject, "unitType")
      return InlineBillingUsageReportUsageItemsItemXd7a8f9c2(
        date = date,
        discountAmount = discountAmount,
        grossAmount = grossAmount,
        netAmount = netAmount,
        organizationName = organizationName,
        pricePerUnit = pricePerUnit,
        product = product,
        quantity = quantity,
        sku = sku,
        unitType = unitType,
        repositoryName = rawObject["repositoryName"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingUsageReportUsageItemsItemXd7a8f9c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingUsageReportUsageItemsItemXd7a8f9c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("date", value.date)
        put("discountAmount", json.encodeToJsonElement(value.discountAmount))
        put("grossAmount", json.encodeToJsonElement(value.grossAmount))
        put("netAmount", json.encodeToJsonElement(value.netAmount))
        put("organizationName", value.organizationName)
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

public fun inlineBillingUsageReportUsageItemsItemXd7a8f9c2(block: InlineBillingUsageReportUsageItemsItemXd7a8f9c2.Builder.() -> Unit): InlineBillingUsageReportUsageItemsItemXd7a8f9c2 = InlineBillingUsageReportUsageItemsItemXd7a8f9c2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingUsageReportUsageItemsItemXd7a8f9c2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
