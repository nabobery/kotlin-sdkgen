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
 * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/price_data
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val product: String,
  public val recurring: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21,
  public val taxBehavior:
      InlineV1SubscriptionItemsPostRequestFormPriceDataTaxBehaviorXa5406aa1? = null,
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

    private var recurringValue: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21?
        = null

    public var recurring: InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21
      get() = requireNotNull(recurringValue) { "recurring is required" }
      set(`value`) {
        recurringValue = value
      }

    public var taxBehavior: InlineV1SubscriptionItemsPostRequestFormPriceDataTaxBehaviorXa5406aa1? =
        null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd {
      check(currencyValue != null) { "currency is required" }
      check(productValue != null) { "product is required" }
      check(recurringValue != null) { "recurring is required" }
      return InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd(
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
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val product = json.decodeRequired<String>(rawObject, "product")
      val recurring = json.decodeRequired<InlineV1SubscriptionItemsPostRequestFormPriceDataRecurringX305daf21>(rawObject, "recurring")
      return InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd(
        currency = currency,
        product = product,
        recurring = recurring,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormPriceDataTaxBehaviorXa5406aa1>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd")
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

public fun inlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd(block: InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd.Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd = InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionItemsPostRequestFormPriceDataX022e42bd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
