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

@Serializable
public data class ShellServerToolView(
  public val type: InlineComponentsSchemasShellServerToolPropertiesType,
)

/**
 * Shell tool configuration
 */
@Serializable(with = ShellServerTool.Serializer::class)
public class ShellServerTool(
  public val type: InlineComponentsSchemasShellServerToolPropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasShellServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasShellServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ShellServerTool {
      check(typeValue != null) { "type is required" }
      return ShellServerTool(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShellServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ShellServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShellServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("ShellServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ShellServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasShellServerToolPropertiesType>(raw, "type")
      return ShellServerTool(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShellServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("ShellServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shellServerTool(block: ShellServerTool.Builder.() -> Unit): ShellServerTool = ShellServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShellServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
