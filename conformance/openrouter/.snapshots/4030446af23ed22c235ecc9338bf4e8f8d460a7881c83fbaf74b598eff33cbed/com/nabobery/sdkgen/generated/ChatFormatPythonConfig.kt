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
 * Python code response format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatPythonConfig
 */
@Serializable(with = ChatFormatPythonConfig.Serializer::class)
public class ChatFormatPythonConfig(
  public val type: InlineChatFormatPythonConfigTypeX5069ebcf,
) {
  public class Builder {
    private var typeValue: InlineChatFormatPythonConfigTypeX5069ebcf? = null

    public var type: InlineChatFormatPythonConfigTypeX5069ebcf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatFormatPythonConfig {
      check(typeValue != null) { "type is required" }
      return ChatFormatPythonConfig(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatFormatPythonConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatFormatPythonConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFormatPythonConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFormatPythonConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatFormatPythonConfig must be a JSON object")
      val type = json.decodeRequired<InlineChatFormatPythonConfigTypeX5069ebcf>(rawObject, "type")
      return ChatFormatPythonConfig(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatFormatPythonConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatFormatPythonConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatFormatPythonConfig(block: ChatFormatPythonConfig.Builder.() -> Unit): ChatFormatPythonConfig = ChatFormatPythonConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatFormatPythonConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
