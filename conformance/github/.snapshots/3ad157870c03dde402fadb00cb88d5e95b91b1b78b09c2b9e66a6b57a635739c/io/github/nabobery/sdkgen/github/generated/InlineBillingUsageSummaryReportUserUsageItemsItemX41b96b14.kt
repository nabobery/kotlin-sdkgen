package io.github.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user/properties/usageItems/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/billing-usage-summary-report-user/properties/usageItems/items
 */
@Serializable(with = InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14.Serializer::class)
public class InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14(
  /**
   * Discount amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val discountAmount: Double,
  /**
   * Discount quantity of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val discountQuantity: Double,
  /**
   * Gross amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val grossAmount: Double,
  /**
   * Gross quantity of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val grossQuantity: Double,
  /**
   * Net amount of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val netAmount: Double,
  /**
   * Net quantity of the usage line item.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val netQuantity: Double,
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
   * SKU name.
   */
  public val sku: String,
  /**
   * Unit type of the usage line item.
   */
  public val unitType: String,
) {
  public class Builder {
    private var discountAmountValue: Double? = null

    public var discountAmount: Double
      get() = requireNotNull(discountAmountValue) { "discountAmount is required" }
      set(`value`) {
        discountAmountValue = value
      }

    private var discountQuantityValue: Double? = null

    public var discountQuantity: Double
      get() = requireNotNull(discountQuantityValue) { "discountQuantity is required" }
      set(`value`) {
        discountQuantityValue = value
      }

    private var grossAmountValue: Double? = null

    public var grossAmount: Double
      get() = requireNotNull(grossAmountValue) { "grossAmount is required" }
      set(`value`) {
        grossAmountValue = value
      }

    private var grossQuantityValue: Double? = null

    public var grossQuantity: Double
      get() = requireNotNull(grossQuantityValue) { "grossQuantity is required" }
      set(`value`) {
        grossQuantityValue = value
      }

    private var netAmountValue: Double? = null

    public var netAmount: Double
      get() = requireNotNull(netAmountValue) { "netAmount is required" }
      set(`value`) {
        netAmountValue = value
      }

    private var netQuantityValue: Double? = null

    public var netQuantity: Double
      get() = requireNotNull(netQuantityValue) { "netQuantity is required" }
      set(`value`) {
        netQuantityValue = value
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

    public fun build(): InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 {
      check(discountAmountValue != null) { "discountAmount is required" }
      check(discountQuantityValue != null) { "discountQuantity is required" }
      check(grossAmountValue != null) { "grossAmount is required" }
      check(grossQuantityValue != null) { "grossQuantity is required" }
      check(netAmountValue != null) { "netAmount is required" }
      check(netQuantityValue != null) { "netQuantity is required" }
      check(pricePerUnitValue != null) { "pricePerUnit is required" }
      check(productValue != null) { "product is required" }
      check(skuValue != null) { "sku is required" }
      check(unitTypeValue != null) { "unitType is required" }
      return InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14(
        discountAmount = discountAmount,
        discountQuantity = discountQuantity,
        grossAmount = grossAmount,
        grossQuantity = grossQuantity,
        netAmount = netAmount,
        netQuantity = netQuantity,
        pricePerUnit = pricePerUnit,
        product = product,
        sku = sku,
        unitType = unitType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 must be a JSON object")
      val discountAmount = json.decodeRequired<Double>(rawObject, "discountAmount")
      val discountQuantity = json.decodeRequired<Double>(rawObject, "discountQuantity")
      val grossAmount = json.decodeRequired<Double>(rawObject, "grossAmount")
      val grossQuantity = json.decodeRequired<Double>(rawObject, "grossQuantity")
      val netAmount = json.decodeRequired<Double>(rawObject, "netAmount")
      val netQuantity = json.decodeRequired<Double>(rawObject, "netQuantity")
      val pricePerUnit = json.decodeRequired<Double>(rawObject, "pricePerUnit")
      val product = json.decodeRequired<String>(rawObject, "product")
      val sku = json.decodeRequired<String>(rawObject, "sku")
      val unitType = json.decodeRequired<String>(rawObject, "unitType")
      return InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14(
        discountAmount = discountAmount,
        discountQuantity = discountQuantity,
        grossAmount = grossAmount,
        grossQuantity = grossQuantity,
        netAmount = netAmount,
        netQuantity = netQuantity,
        pricePerUnit = pricePerUnit,
        product = product,
        sku = sku,
        unitType = unitType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discountAmount", json.encodeToJsonElement(value.discountAmount))
        put("discountQuantity", json.encodeToJsonElement(value.discountQuantity))
        put("grossAmount", json.encodeToJsonElement(value.grossAmount))
        put("grossQuantity", json.encodeToJsonElement(value.grossQuantity))
        put("netAmount", json.encodeToJsonElement(value.netAmount))
        put("netQuantity", json.encodeToJsonElement(value.netQuantity))
        put("pricePerUnit", json.encodeToJsonElement(value.pricePerUnit))
        put("product", value.product)
        put("sku", value.sku)
        put("unitType", value.unitType)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14(block: InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14.Builder.() -> Unit): InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 = InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBillingUsageSummaryReportUserUsageItemsItemX41b96b14 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
