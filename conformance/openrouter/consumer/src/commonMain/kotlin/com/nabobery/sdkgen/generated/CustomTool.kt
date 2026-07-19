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
public data class CustomToolView(
  public val description: String? = null,
  public val format: InlineComponentsSchemasCustomToolPropertiesFormat? = null,
  public val name: String,
  public val type: InlineComponentsSchemasCustomToolPropertiesType,
)

/**
 * Custom tool configuration
 */
@Serializable(with = CustomTool.Serializer::class)
public class CustomTool(
  public val name: String,
  public val type: InlineComponentsSchemasCustomToolPropertiesType,
  public val description: String? = null,
  public val format: InlineComponentsSchemasCustomToolPropertiesFormat? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineComponentsSchemasCustomToolPropertiesType? = null

    public var type: InlineComponentsSchemasCustomToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var description: String? = null

    public var format: InlineComponentsSchemasCustomToolPropertiesFormat? = null

    public fun build(): CustomTool {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return CustomTool(
        name = name,
        type = type,
        description = description,
        format = format,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomTool {
      val jsonDecoder = decoder.requireJsonDecoder("CustomTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("CustomTool must be a JSON object")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasCustomToolPropertiesType>(raw, "type")
      return CustomTool(
        name = name,
        type = type,
        description = raw["description"]?.let { json.decodeFromJsonElement<String>(it) },
        format = raw["format"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasCustomToolPropertiesFormat>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomTool) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.description?.let { put("description", it) }
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customTool(block: CustomTool.Builder.() -> Unit): CustomTool = CustomTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
