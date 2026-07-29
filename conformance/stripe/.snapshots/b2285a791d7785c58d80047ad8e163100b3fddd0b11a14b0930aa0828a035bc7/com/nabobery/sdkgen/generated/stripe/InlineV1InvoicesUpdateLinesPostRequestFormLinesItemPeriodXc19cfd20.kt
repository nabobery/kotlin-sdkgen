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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/period
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20(
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

    public fun build(): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 must be a JSON object")
      val end = json.decodeRequired<Int>(rawObject, "end")
      val start = json.decodeRequired<Int>(rawObject, "start")
      return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20(block: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20.Builder.() -> Unit): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesUpdateLinesPostRequestFormLinesItemPeriodXc19cfd20 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
