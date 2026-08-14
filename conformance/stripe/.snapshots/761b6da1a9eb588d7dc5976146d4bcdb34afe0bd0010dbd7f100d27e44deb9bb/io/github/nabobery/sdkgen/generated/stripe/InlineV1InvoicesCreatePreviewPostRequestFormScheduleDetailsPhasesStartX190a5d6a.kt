package io.github.nabobery.sdkgen.generated.stripe

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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/start.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/start
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc,
  public val timestamp: Int? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var timestamp: Int? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a(
        type = type,
        timestamp = timestamp,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeX2b9c39cc>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a(
        type = type,
        timestamp = rawObject["timestamp"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.timestamp?.let { put("timestamp", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesStartX190a5d6a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
