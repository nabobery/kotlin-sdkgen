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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_line_item_period
 */
@Serializable(with = InvoiceLineItemPeriod.Serializer::class)
public class InvoiceLineItemPeriod(
  /**
   * The end of the period, which must be greater than or equal to the start. This value is inclusive.
   */
  public val end: Int,
  /**
   * The start of the period. This value is inclusive.
   */
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

    public fun build(): InvoiceLineItemPeriod {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InvoiceLineItemPeriod(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceLineItemPeriod = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InvoiceLineItemPeriod> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceLineItemPeriod {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceLineItemPeriod")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceLineItemPeriod must be a JSON object")
      val end = json.decodeRequired<Int>(rawObject, "end")
      val start = json.decodeRequired<Int>(rawObject, "start")
      return InvoiceLineItemPeriod(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceLineItemPeriod) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceLineItemPeriod")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceLineItemPeriod(block: InvoiceLineItemPeriod.Builder.() -> Unit): InvoiceLineItemPeriod = InvoiceLineItemPeriod.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InvoiceLineItemPeriod is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
