package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryText.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryText
 */
@Serializable(with = ReasoningSummaryText.Serializer::class)
public class ReasoningSummaryText(
  public val text: String,
  public val type: InlineReasoningSummaryTextTypeX1dc2a89f,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineReasoningSummaryTextTypeX1dc2a89f? = null

    public var type: InlineReasoningSummaryTextTypeX1dc2a89f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ReasoningSummaryText {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningSummaryText(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningSummaryText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReasoningSummaryText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningSummaryText {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningSummaryText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReasoningSummaryText must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineReasoningSummaryTextTypeX1dc2a89f>(rawObject, "type")
      return ReasoningSummaryText(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningSummaryText) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningSummaryText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningSummaryText(block: ReasoningSummaryText.Builder.() -> Unit): ReasoningSummaryText = ReasoningSummaryText.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningSummaryText is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
