package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3(
  public val id: String,
  public val amount: Int? = null,
  public val description: String? = null,
  public val discountable: Boolean? = null,
  public val discounts:
      InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7? = null,
  public val metadata: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2? = null,
  public val period: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20? = null,
  public val priceData:
      InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataX2a66dd7b? = null,
  public val pricing: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPricingX89f0268b? = null,
  public val quantity: Int? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val quantityDecimal: String? = null,
  public val taxAmounts:
      InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxAmountsX86f74ac5? = null,
  public val taxRates: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public var amount: Int? = null

    public var description: String? = null

    public var discountable: Boolean? = null

    public var discounts: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7? =
        null

    public var metadata: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2? =
        null

    public var period: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20? = null

    public var priceData: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataX2a66dd7b? =
        null

    public var pricing: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPricingX89f0268b? = null

    public var quantity: Int? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var quantityDecimal: String? = null

    public var taxAmounts: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxAmountsX86f74ac5? =
        null

    public var taxRates: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863? =
        null

    public fun build(): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 {
      check(idValue != null) { "id is required" }
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3(
        id = id,
        amount = amount,
        description = description,
        discountable = discountable,
        discounts = discounts,
        metadata = metadata,
        period = period,
        priceData = priceData,
        pricing = pricing,
        quantity = quantity,
        quantityDecimal = quantityDecimal,
        taxAmounts = taxAmounts,
        taxRates = taxRates,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3(
        id = id,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2>(it) },
        period = rawObject["period"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPriceDataX2a66dd7b>(it) },
        pricing = rawObject["pricing"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPricingX89f0268b>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        taxAmounts = rawObject["tax_amounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxAmountsX86f74ac5>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemTaxRatesX8a160863>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.period?.let { put("period", json.encodeToJsonElement(it)) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.quantityDecimal?.let { put("quantity_decimal", it) }
        value.taxAmounts?.let { put("tax_amounts", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3(block: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3.Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemX780032d3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
