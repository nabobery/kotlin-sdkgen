package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/period
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9(
  public val end: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3,
  public val start: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartXb25e9b7c,
) {
  public class Builder {
    private var endValue: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3?
        = null

    public var end: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue:
        InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartXb25e9b7c? = null

    public var start: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartXb25e9b7c
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 must be a JSON object")
      val end = json.decodeRequired<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndX164dc3c3>(rawObject, "end")
      val start = json.decodeRequired<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodStartXb25e9b7c>(rawObject, "start")
      return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9(block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX690cb9a9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
