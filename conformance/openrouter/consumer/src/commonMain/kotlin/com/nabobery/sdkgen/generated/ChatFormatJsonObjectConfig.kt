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
 * JSON object response format
 */
@Serializable(with = ChatFormatJsonObjectConfig.Serializer::class)
public class ChatFormatJsonObjectConfig(
  public val type: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType? = null

    public var type: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatFormatJsonObjectConfig {
      check(typeValue != null) { "type is required" }
      return ChatFormatJsonObjectConfig(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatFormatJsonObjectConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatFormatJsonObjectConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFormatJsonObjectConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFormatJsonObjectConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatFormatJsonObjectConfig must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType>(raw, "type")
      return ChatFormatJsonObjectConfig(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatFormatJsonObjectConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatFormatJsonObjectConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatFormatJsonObjectConfig(block: ChatFormatJsonObjectConfig.Builder.() ->
  Unit): ChatFormatJsonObjectConfig = ChatFormatJsonObjectConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatFormatJsonObjectConfig is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
