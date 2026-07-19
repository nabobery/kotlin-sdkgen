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
public data class ChatNamedToolChoiceView(
  public val function: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction,
  public val type: InlineComponentsSchemasChatNamedToolChoicePropertiesType,
)

/**
 * Named tool choice for specific function
 */
@Serializable(with = ChatNamedToolChoice.Serializer::class)
public class ChatNamedToolChoice(
  public val function: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction,
  public val type: InlineComponentsSchemasChatNamedToolChoicePropertiesType,
) {
  public class Builder {
    private var functionValue: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction? = null

    public var function: InlineComponentsSchemasChatNamedToolChoicePropertiesFunction
      get() = requireNotNull(functionValue) { "function is required" }
      set(`value`) {
        functionValue = value
      }

    private var typeValue: InlineComponentsSchemasChatNamedToolChoicePropertiesType? = null

    public var type: InlineComponentsSchemasChatNamedToolChoicePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ChatNamedToolChoice {
      check(functionValue != null) { "function is required" }
      check(typeValue != null) { "type is required" }
      return ChatNamedToolChoice(
        function = function,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatNamedToolChoice = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatNamedToolChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatNamedToolChoice {
      val jsonDecoder = decoder.requireJsonDecoder("ChatNamedToolChoice")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatNamedToolChoice must be a JSON object")
      val function = json.decodeRequired<InlineComponentsSchemasChatNamedToolChoicePropertiesFunction>(raw, "function")
      val type = json.decodeRequired<InlineComponentsSchemasChatNamedToolChoicePropertiesType>(raw, "type")
      return ChatNamedToolChoice(
        function = function,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatNamedToolChoice) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatNamedToolChoice")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("function", json.encodeToJsonElement(value.function))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatNamedToolChoice(block: ChatNamedToolChoice.Builder.() -> Unit): ChatNamedToolChoice =
  ChatNamedToolChoice.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatNamedToolChoice is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
