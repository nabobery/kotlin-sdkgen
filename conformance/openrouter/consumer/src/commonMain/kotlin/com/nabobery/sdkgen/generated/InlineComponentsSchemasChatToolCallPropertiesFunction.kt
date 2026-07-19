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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/function.
 */
@Serializable(with = InlineComponentsSchemasChatToolCallPropertiesFunction.Serializer::class)
public class InlineComponentsSchemasChatToolCallPropertiesFunction(
  /**
   * Function arguments as JSON string
   */
  public val arguments: String,
  /**
   * Function name to call
   */
  public val name: String,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineComponentsSchemasChatToolCallPropertiesFunction {
      check(argumentsValue != null) { "arguments is required" }
      check(nameValue != null) { "name is required" }
      return InlineComponentsSchemasChatToolCallPropertiesFunction(
        arguments = arguments,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatToolCallPropertiesFunction = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolCallPropertiesFunction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolCallPropertiesFunction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatToolCallPropertiesFunction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatToolCallPropertiesFunction must be a JSON object")
      val arguments = json.decodeRequired<String>(raw, "arguments")
      val name = json.decodeRequired<String>(raw, "name")
      return InlineComponentsSchemasChatToolCallPropertiesFunction(
        arguments = arguments,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolCallPropertiesFunction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatToolCallPropertiesFunction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatToolCallPropertiesFunction(block: InlineComponentsSchemasChatToolCallPropertiesFunction.Builder.() -> Unit): InlineComponentsSchemasChatToolCallPropertiesFunction = InlineComponentsSchemasChatToolCallPropertiesFunction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatToolCallPropertiesFunction is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
