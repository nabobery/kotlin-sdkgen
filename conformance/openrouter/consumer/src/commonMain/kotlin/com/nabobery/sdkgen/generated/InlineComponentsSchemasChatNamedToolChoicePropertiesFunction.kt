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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatNamedToolChoice/properties/function.
 */
@Serializable(with = InlineComponentsSchemasChatNamedToolChoicePropertiesFunction.Serializer::class)
public class InlineComponentsSchemasChatNamedToolChoicePropertiesFunction(
  /**
   * Function name to call
   */
  public val name: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineComponentsSchemasChatNamedToolChoicePropertiesFunction {
      check(nameValue != null) { "name is required" }
      return InlineComponentsSchemasChatNamedToolChoicePropertiesFunction(
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatNamedToolChoicePropertiesFunction =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatNamedToolChoicePropertiesFunction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatNamedToolChoicePropertiesFunction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatNamedToolChoicePropertiesFunction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatNamedToolChoicePropertiesFunction must be a JSON " +
          "object")
      val name = json.decodeRequired<String>(raw, "name")
      return InlineComponentsSchemasChatNamedToolChoicePropertiesFunction(
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatNamedToolChoicePropertiesFunction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatNamedToolChoicePropertiesFunction(block: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction.Builder.() -> Unit): InlineComponentsSchemasChatNamedToolChoicePropertiesFunction = InlineComponentsSchemasChatNamedToolChoicePropertiesFunction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatNamedToolChoicePropertiesFunction is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
