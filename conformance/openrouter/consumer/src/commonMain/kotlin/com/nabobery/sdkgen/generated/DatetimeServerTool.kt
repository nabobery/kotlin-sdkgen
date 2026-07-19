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
public data class DatetimeServerToolView(
  public val parameters: DatetimeServerToolConfig? = null,
  public val type: InlineComponentsSchemasDatetimeServerToolPropertiesType,
)

/**
 * OpenRouter built-in server tool: returns the current date and time
 */
@Serializable(with = DatetimeServerTool.Serializer::class)
public class DatetimeServerTool(
  public val type: InlineComponentsSchemasDatetimeServerToolPropertiesType,
  public val parameters: DatetimeServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasDatetimeServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasDatetimeServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: DatetimeServerToolConfig? = null

    public fun build(): DatetimeServerTool {
      check(typeValue != null) { "type is required" }
      return DatetimeServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DatetimeServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DatetimeServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DatetimeServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("DatetimeServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("DatetimeServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasDatetimeServerToolPropertiesType>(raw, "type")
      return DatetimeServerTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<DatetimeServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: DatetimeServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("DatetimeServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun datetimeServerTool(block: DatetimeServerTool.Builder.() -> Unit): DatetimeServerTool = DatetimeServerTool
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DatetimeServerTool is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
