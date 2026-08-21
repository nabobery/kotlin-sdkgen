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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ReasoningTextContent.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningTextContent
 */
@Serializable(with = ReasoningTextContent.Serializer::class)
public class ReasoningTextContent(
  public val text: String,
  public val type: InlineReasoningTextContentTypeX570a9598,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineReasoningTextContentTypeX570a9598? = null

    public var type: InlineReasoningTextContentTypeX570a9598
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ReasoningTextContent {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningTextContent(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningTextContent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReasoningTextContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningTextContent {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningTextContent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReasoningTextContent must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineReasoningTextContentTypeX570a9598>(rawObject, "type")
      return ReasoningTextContent(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningTextContent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningTextContent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningTextContent(block: ReasoningTextContent.Builder.() -> Unit): ReasoningTextContent = ReasoningTextContent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningTextContent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
