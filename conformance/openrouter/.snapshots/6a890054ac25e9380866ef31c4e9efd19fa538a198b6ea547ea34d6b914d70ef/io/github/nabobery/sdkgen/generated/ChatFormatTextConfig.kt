package io.github.nabobery.sdkgen.generated

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
 * Default text response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatTextConfig
 */
@Serializable(with = ChatFormatTextConfig.Serializer::class)
public class ChatFormatTextConfig(
  public val type: InlineChatFormatTextConfigTypeX1900046b,
) {
  public class Builder {
    private var typeValue: InlineChatFormatTextConfigTypeX1900046b? = null

    public var type: InlineChatFormatTextConfigTypeX1900046b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatFormatTextConfig {
      check(typeValue != null) { "type is required" }
      return ChatFormatTextConfig(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatFormatTextConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatFormatTextConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFormatTextConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFormatTextConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatFormatTextConfig must be a JSON object")
      val type = json.decodeRequired<InlineChatFormatTextConfigTypeX1900046b>(rawObject, "type")
      return ChatFormatTextConfig(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatFormatTextConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatFormatTextConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatFormatTextConfig(block: ChatFormatTextConfig.Builder.() -> Unit): ChatFormatTextConfig = ChatFormatTextConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatFormatTextConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
