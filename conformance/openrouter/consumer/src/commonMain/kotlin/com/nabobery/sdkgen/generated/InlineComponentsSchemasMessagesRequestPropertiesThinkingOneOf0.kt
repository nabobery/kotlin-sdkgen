package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/0.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(
  public val budgetTokens: Int,
  public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType,
  public val display: AnthropicThinkingDisplay? = null,
) {
  public class Builder {
    private var budgetTokensValue: Int? = null

    public var budgetTokens: Int
      get() = requireNotNull(budgetTokensValue) { "budgetTokens is required" }
      set(`value`) {
        budgetTokensValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var display: AnthropicThinkingDisplay? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 {
      check(budgetTokensValue != null) { "budgetTokens is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(
        budgetTokens = budgetTokens,
        type = type,
        display = display,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 must be a JSON " +
          "object")
      val budgetTokens = json.decodeRequired<Int>(raw, "budget_tokens")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType>(raw,
        "type")
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(
        budgetTokens = budgetTokens,
        type = type,
        display = raw["display"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicThinkingDisplay?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("budget_tokens", json.encodeToJsonElement(value.budgetTokens))
        put("type", json.encodeToJsonElement(value.type))
        value.display?.let { put("display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(block: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
