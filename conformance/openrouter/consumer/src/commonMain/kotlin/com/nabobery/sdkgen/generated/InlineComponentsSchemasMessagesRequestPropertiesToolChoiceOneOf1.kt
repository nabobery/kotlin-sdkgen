package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/1.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType,
  public val disableParallelToolUse: Boolean? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disableParallelToolUse: Boolean? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(
        type = type,
        disableParallelToolUse = disableParallelToolUse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 must be a JSON " +
          "object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(
        type = type,
        disableParallelToolUse = raw["disable_parallel_tool_use"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.disableParallelToolUse?.let { put("disable_parallel_tool_use", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(block: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
