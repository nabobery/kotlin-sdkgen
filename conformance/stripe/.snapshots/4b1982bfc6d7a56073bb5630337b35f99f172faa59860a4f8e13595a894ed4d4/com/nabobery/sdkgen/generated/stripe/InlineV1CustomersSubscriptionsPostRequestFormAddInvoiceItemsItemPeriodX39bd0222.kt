package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222(
  public val end: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f,
  public val start: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXb3c48c0a,
) {
  public class Builder {
    private var endValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f? = null

    public var end: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXb3c48c0a? = null

    public var start: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXb3c48c0a
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 must be a JSON object")
      val end = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX5b13774f>(rawObject, "end")
      val start = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXb3c48c0a>(rawObject, "start")
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222(block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
