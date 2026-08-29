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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/duration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/duration
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670(
  public val interval: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55,
  public val intervalCount: Int? = null,
) {
  public class Builder {
    private var intervalValue:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55? = null

    public var interval:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55
      get() = requireNotNull(intervalValue) { "interval is required" }
      set(`value`) {
        intervalValue = value
      }

    public var intervalCount: Int? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 {
      check(intervalValue != null) { "interval is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670(
        interval = interval,
        intervalCount = intervalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 must be a JSON object")
      val interval = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsIntervalXc272de55>(rawObject, "interval")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670(
        interval = interval,
        intervalCount = rawObject["interval_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("interval", json.encodeToJsonElement(value.interval))
        value.intervalCount?.let { put("interval_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
