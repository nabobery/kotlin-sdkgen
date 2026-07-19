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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasChatFunctionToolAnyOf0.Serializer::class)
public class InlineComponentsSchemasChatFunctionToolAnyOf0(
  /**
   * Function definition for tool calling
   */
  public val function: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction,
  public val type: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType,
  public val cacheControl: ChatContentCacheControl? = null,
) {
  public class Builder {
    private var functionValue: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction? =
        null

    public var function: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction
      get() = requireNotNull(functionValue) { "function is required" }
      set(`value`) {
        functionValue = value
      }

    private var typeValue: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType? = null

    public var type: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cacheControl: ChatContentCacheControl? = null

    public fun build(): InlineComponentsSchemasChatFunctionToolAnyOf0 {
      check(functionValue != null) { "function is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasChatFunctionToolAnyOf0(
        function = function,
        type = type,
        cacheControl = cacheControl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatFunctionToolAnyOf0 = Builder().apply(block)
      .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFunctionToolAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFunctionToolAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatFunctionToolAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatFunctionToolAnyOf0 must be a JSON object")
      val function = json.decodeRequired<InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesFunction>(raw,
        "function")
      val type = json.decodeRequired<InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType>(raw, "type")
      return InlineComponentsSchemasChatFunctionToolAnyOf0(
        function = function,
        type = type,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<ChatContentCacheControl>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFunctionToolAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatFunctionToolAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("function", json.encodeToJsonElement(value.function))
        put("type", json.encodeToJsonElement(value.type))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatFunctionToolAnyOf0(block: InlineComponentsSchemasChatFunctionToolAnyOf0.Builder
  .() -> Unit): InlineComponentsSchemasChatFunctionToolAnyOf0 = InlineComponentsSchemasChatFunctionToolAnyOf0
    .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatFunctionToolAnyOf0 is missing required property '" +
      name + "'")
  return decodeFromJsonElement(element)
}
