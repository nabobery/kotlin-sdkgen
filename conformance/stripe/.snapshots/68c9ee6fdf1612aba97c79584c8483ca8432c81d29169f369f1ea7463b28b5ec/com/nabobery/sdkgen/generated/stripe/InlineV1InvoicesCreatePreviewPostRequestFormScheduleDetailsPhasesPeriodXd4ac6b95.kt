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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95(
  public val end: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesEndXeca801e4,
  public val start: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a,
) {
  public class Builder {
    private var endValue:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesEndXeca801e4? = null

    public var end: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesEndXeca801e4
      get() = requireNotNull(endValue) { "end is required" }
      set(`value`) {
        endValue = value
      }

    private var startValue:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a? = null

    public var start:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a
      get() = requireNotNull(startValue) { "start is required" }
      set(`value`) {
        startValue = value
      }

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 {
      check(endValue != null) { "end is required" }
      check(startValue != null) { "start is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95(
        end = end,
        start = start,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 must be a JSON object")
      val end = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesEndXeca801e4>(rawObject, "end")
      val start = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a>(rawObject, "start")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95(
        end = end,
        start = start,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end", json.encodeToJsonElement(value.end))
        put("start", json.encodeToJsonElement(value.start))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesPeriodXd4ac6b95 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
