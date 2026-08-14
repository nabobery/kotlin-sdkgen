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
 * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/price_data
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val product: String,
  public val taxBehavior: InlineV1InvoiceitemsPostRequestFormPriceDataTaxBehaviorX5e6b7b1a? = null,
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

    public var taxBehavior: InlineV1InvoiceitemsPostRequestFormPriceDataTaxBehaviorX5e6b7b1a? = null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 {
      check(currencyValue != null) { "currency is required" }
      check(productValue != null) { "product is required" }
      return InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26(
        currency = currency,
        product = product,
        taxBehavior = taxBehavior,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val product = json.decodeRequired<String>(rawObject, "product")
      return InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26(
        currency = currency,
        product = product,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPriceDataTaxBehaviorX5e6b7b1a>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26")
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

public fun inlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26(block: InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26.Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 = InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
