package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/0
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf1Xe7d31581.Serializer::class)
public class InlineMessagesRequestThinkingOneOf1Xe7d31581(
  public val budgetTokens: Int,
  public val type: InlineMessagesRequestThinkingOneOf1TypeX9c49263e,
  public val display: AnthropicThinkingDisplay? = null,
) {
  public class Builder {
    private var budgetTokensValue: Int? = null

    public var budgetTokens: Int
      get() = requireNotNull(budgetTokensValue) { "budgetTokens is required" }
      set(`value`) {
        budgetTokensValue = value
      }

    private var typeValue: InlineMessagesRequestThinkingOneOf1TypeX9c49263e? = null

    public var type: InlineMessagesRequestThinkingOneOf1TypeX9c49263e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var display: AnthropicThinkingDisplay? = null

    public fun build(): InlineMessagesRequestThinkingOneOf1Xe7d31581 {
      check(budgetTokensValue != null) { "budgetTokens is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestThinkingOneOf1Xe7d31581(
        budgetTokens = budgetTokens,
        type = type,
        display = display,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestThinkingOneOf1Xe7d31581 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf1Xe7d31581> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf1Xe7d31581 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestThinkingOneOf1Xe7d31581")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestThinkingOneOf1Xe7d31581 must be a JSON object")
      val budgetTokens = json.decodeRequired<Int>(rawObject, "budget_tokens")
      val type = json.decodeRequired<InlineMessagesRequestThinkingOneOf1TypeX9c49263e>(rawObject, "type")
      return InlineMessagesRequestThinkingOneOf1Xe7d31581(
        budgetTokens = budgetTokens,
        type = type,
        display = rawObject["display"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicThinkingDisplay?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf1Xe7d31581) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestThinkingOneOf1Xe7d31581")
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

public fun inlineMessagesRequestThinkingOneOf1Xe7d31581(block: InlineMessagesRequestThinkingOneOf1Xe7d31581.Builder.() -> Unit): InlineMessagesRequestThinkingOneOf1Xe7d31581 = InlineMessagesRequestThinkingOneOf1Xe7d31581.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestThinkingOneOf1Xe7d31581 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
