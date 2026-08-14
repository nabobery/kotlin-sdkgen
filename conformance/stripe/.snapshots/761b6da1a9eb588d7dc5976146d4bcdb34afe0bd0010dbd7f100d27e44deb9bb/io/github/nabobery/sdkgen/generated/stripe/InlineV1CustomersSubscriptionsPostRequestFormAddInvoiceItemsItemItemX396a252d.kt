package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/discounts/items
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/discounts/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d(
  public val coupon: String? = null,
  public val discount: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var discount: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d(
      coupon = coupon,
      discount = discount,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.coupon?.let { put("coupon", it) }
        value.discount?.let { put("discount", it) }
        value.promotionCode?.let { put("promotion_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d(block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d.build(block)
