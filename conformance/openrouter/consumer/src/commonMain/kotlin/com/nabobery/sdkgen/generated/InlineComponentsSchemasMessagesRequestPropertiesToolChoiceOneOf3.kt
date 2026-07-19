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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/3.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(
  public val name: String,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType,
  public val disableParallelToolUse: Boolean? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var disableParallelToolUse: Boolean? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(
        name = name,
        type = type,
        disableParallelToolUse = disableParallelToolUse,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 must be a JSON " +
          "object")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(
        name = name,
        type = type,
        disableParallelToolUse = raw["disable_parallel_tool_use"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.disableParallelToolUse?.let { put("disable_parallel_tool_use", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(block: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
