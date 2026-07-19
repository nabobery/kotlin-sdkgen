package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Function call details
 */
@Serializable(with = InlineComponentsSchemasChatStreamToolCallPropertiesFunction.Serializer::class)
public class InlineComponentsSchemasChatStreamToolCallPropertiesFunction(
  /**
   * Function arguments as JSON string
   */
  public val arguments: String? = null,
  /**
   * Function name
   */
  public val name: String? = null,
) {
  public class Builder {
    /**
     * Function arguments as JSON string
     */
    public var arguments: String? = null

    /**
     * Function name
     */
    public var name: String? = null

    public fun build(): InlineComponentsSchemasChatStreamToolCallPropertiesFunction =
      InlineComponentsSchemasChatStreamToolCallPropertiesFunction(
      arguments = arguments,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatStreamToolCallPropertiesFunction =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamToolCallPropertiesFunction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamToolCallPropertiesFunction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatStreamToolCallPropertiesFunction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatStreamToolCallPropertiesFunction must be a JSON " +
          "object")
      return InlineComponentsSchemasChatStreamToolCallPropertiesFunction(
        arguments = raw["arguments"]?.let { json.decodeFromJsonElement<String>(it) },
        name = raw["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatStreamToolCallPropertiesFunction) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatStreamToolCallPropertiesFunction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.arguments?.let { put("arguments", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatStreamToolCallPropertiesFunction(block: InlineComponentsSchemasChatStreamToolCallPropertiesFunction.Builder.() -> Unit): InlineComponentsSchemasChatStreamToolCallPropertiesFunction = InlineComponentsSchemasChatStreamToolCallPropertiesFunction.build(block)
