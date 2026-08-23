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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatTextDetail.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatTextDetail
 */
@Serializable(with = ChatTextDetail.Serializer::class)
public class ChatTextDetail(
  public val text: String,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    public fun build(): ChatTextDetail {
      check(textValue != null) { "text is required" }
      return ChatTextDetail(
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatTextDetail = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatTextDetail> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatTextDetail {
      val jsonDecoder = decoder.requireJsonDecoder("ChatTextDetail")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatTextDetail must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      return ChatTextDetail(
        text = text,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatTextDetail) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatTextDetail")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatTextDetail(block: ChatTextDetail.Builder.() -> Unit): ChatTextDetail = ChatTextDetail.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatTextDetail is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
