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
 * JSON Schema response format for structured outputs
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonSchemaConfig
 */
@Serializable(with = ChatFormatJsonSchemaConfig.Serializer::class)
public class ChatFormatJsonSchemaConfig(
  public val jsonSchema: ChatJsonSchemaConfig,
  public val type: InlineChatFormatJsonSchemaConfigTypeX2306a669,
) {
  public class Builder {
    private var jsonSchemaValue: ChatJsonSchemaConfig? = null

    public var jsonSchema: ChatJsonSchemaConfig
      get() = requireNotNull(jsonSchemaValue) { "jsonSchema is required" }
      set(`value`) {
        jsonSchemaValue = value
      }

    private var typeValue: InlineChatFormatJsonSchemaConfigTypeX2306a669? = null

    public var type: InlineChatFormatJsonSchemaConfigTypeX2306a669
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatFormatJsonSchemaConfig {
      check(jsonSchemaValue != null) { "jsonSchema is required" }
      check(typeValue != null) { "type is required" }
      return ChatFormatJsonSchemaConfig(
        jsonSchema = jsonSchema,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatFormatJsonSchemaConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatFormatJsonSchemaConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatFormatJsonSchemaConfig {
      val jsonDecoder = decoder.requireJsonDecoder("ChatFormatJsonSchemaConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatFormatJsonSchemaConfig must be a JSON object")
      val jsonSchema = json.decodeRequired<ChatJsonSchemaConfig>(rawObject, "json_schema")
      val type = json.decodeRequired<InlineChatFormatJsonSchemaConfigTypeX2306a669>(rawObject, "type")
      return ChatFormatJsonSchemaConfig(
        jsonSchema = jsonSchema,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatFormatJsonSchemaConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatFormatJsonSchemaConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("json_schema", json.encodeToJsonElement(value.jsonSchema))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatFormatJsonSchemaConfig(block: ChatFormatJsonSchemaConfig.Builder.() -> Unit): ChatFormatJsonSchemaConfig = ChatFormatJsonSchemaConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatFormatJsonSchemaConfig is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
