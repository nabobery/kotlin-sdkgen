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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf(
  public val end: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX71518250,
  public val start: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90,
) {
  public class Builder {
    private var endValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX71518250? = null

    public var end: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX71518250
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue:
        InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90? = null

    public var start: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf must be a JSON object")
      val end = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemEndX71518250>(rawObject, "end")
      val start = json.decodeRequired<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemStartXd78f9b90>(rawObject, "start")
      return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf(block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
