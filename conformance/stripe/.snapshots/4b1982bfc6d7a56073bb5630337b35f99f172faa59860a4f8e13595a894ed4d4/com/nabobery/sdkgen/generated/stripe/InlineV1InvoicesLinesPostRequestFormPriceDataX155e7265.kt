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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/price_data
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  public val product: String? = null,
  public val productData: InlineV1InvoicesLinesPostRequestFormPriceDataProductDataX0beab3a6? = null,
  public val taxBehavior: InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6? = null,
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

    public var product: String? = null

    public var productData: InlineV1InvoicesLinesPostRequestFormPriceDataProductDataX0beab3a6? =
        null

    public var taxBehavior: InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6? =
        null

    public var unitAmount: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var unitAmountDecimal: String? = null

    public fun build(): InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 {
      check(currencyValue != null) { "currency is required" }
      return InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265(
        currency = currency,
        product = product,
        productData = productData,
        taxBehavior = taxBehavior,
        unitAmount = unitAmount,
        unitAmountDecimal = unitAmountDecimal,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265(
        currency = currency,
        product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
        productData = rawObject["product_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormPriceDataProductDataX0beab3a6>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesLinesPostRequestFormPriceDataTaxBehaviorX80b183b6>(it) },
        unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        value.product?.let { put("product", it) }
        value.productData?.let { put("product_data", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
        value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesLinesPostRequestFormPriceDataX155e7265(block: InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265.Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 = InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesLinesPostRequestFormPriceDataX155e7265 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
