package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/price_data
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val product: String,
  public val taxBehavior:
      InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorX3bcf7206? = null,
  public val unitAmount: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val unitAmountDecimal: String? = null,
) {
  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var productValue: String? = null

    public var product: String
      get() = requireNotNull(productValue) { "product is required" }
      set(`value`) {
        productValue = value
      }

    public var taxBehavior:
        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorX3bcf7206? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 {
      check(currencyValue != null) { "currency is required" }
      check(productValue != null) { "product is required" }
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09(
        currency = currency,
        product = product,
        taxBehavior = taxBehavior,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val product = json.decodeRequired<String>(rawObject, "product")
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09(
        currency = currency,
        product = product,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorX3bcf7206>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("product", value.product)
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09(block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX3d872e09 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
