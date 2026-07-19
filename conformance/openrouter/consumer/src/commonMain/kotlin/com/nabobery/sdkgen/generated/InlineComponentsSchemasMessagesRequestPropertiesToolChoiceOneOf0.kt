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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/0.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType,
  public val disableParallelToolUse: Boolean? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disableParallelToolUse: Boolean? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(
        type = type,
        disableParallelToolUse = disableParallelToolUse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 must be a JSON " +
          "object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(
        type = type,
        disableParallelToolUse = raw["disable_parallel_tool_use"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.disableParallelToolUse?.let { put("disable_parallel_tool_use", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(block: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
