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
 * The period associated with this invoice item. When set to different values, the period will be rendered on the
 * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the period
 * will be used to recognize and defer revenue. See the [Revenue Recognition
 * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/period
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7(
  public val end: Int,
  public val start: Int,
) {
  public class Builder {
    private var endValue: Int? = null

    public var end: Int
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue: Int? = null

    public var start: Int
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 must be a JSON object")
      val end = json.decodeRequired<Int>(rawObject, "end")
      val start = json.decodeRequired<Int>(rawObject, "start")
      return InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoiceitemsPostRequestFormPeriodXcae985a7(block: InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7.Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 = InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
