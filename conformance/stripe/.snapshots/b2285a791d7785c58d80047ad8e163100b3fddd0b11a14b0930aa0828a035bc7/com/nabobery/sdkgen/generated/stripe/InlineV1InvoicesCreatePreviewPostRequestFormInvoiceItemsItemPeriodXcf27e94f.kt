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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/invoice_items/items/properties/period
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f(
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

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f must be a JSON object")
      val end = json.decodeRequired<Int>(rawObject, "end")
      val start = json.decodeRequired<Int>(rawObject, "start")
      return InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f(block: InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f = InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemPeriodXcf27e94f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
