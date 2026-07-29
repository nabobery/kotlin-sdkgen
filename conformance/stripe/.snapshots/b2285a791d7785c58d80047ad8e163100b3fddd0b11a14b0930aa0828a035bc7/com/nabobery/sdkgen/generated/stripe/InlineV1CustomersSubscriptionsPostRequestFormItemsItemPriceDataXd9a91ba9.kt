package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/price_data
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val product: String,
  public val recurring: InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9,
  public val taxBehavior:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec? = null,
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

    private var recurringValue:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9? = null

    public var recurring: InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9
      get() = requireNotNull(recurringValue) { "recurring is required" }
      set(`value`) {
        recurringValue = value
      }

    public var taxBehavior:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 {
      check(currencyValue != null) { "currency is required" }
      check(productValue != null) { "product is required" }
      check(recurringValue != null) { "recurring is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9(
        currency = currency,
        product = product,
        recurring = recurring,
        taxBehavior = taxBehavior,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val product = json.decodeRequired<String>(rawObject, "product")
      val recurring = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormItemsItemRecurringX400ceab9>(rawObject, "recurring")
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9(
        currency = currency,
        product = product,
        recurring = recurring,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxBehaviorXc12102ec>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("product", value.product)
        put("recurring", json.encodeToJsonElement(value.recurring))
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9(block: InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 = InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
