package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf3Xbbd41d37.Serializer::class)
public class InlineMessagesRequestThinkingOneOf3Xbbd41d37(
  public val type: InlineMessagesRequestThinkingOneOf3TypeX33127efb,
  public val display: AnthropicThinkingDisplay? = null,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestThinkingOneOf3TypeX33127efb? = null

    public var type: InlineMessagesRequestThinkingOneOf3TypeX33127efb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var display: AnthropicThinkingDisplay? = null

    public fun build(): InlineMessagesRequestThinkingOneOf3Xbbd41d37 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestThinkingOneOf3Xbbd41d37(
        type = type,
        display = display,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestThinkingOneOf3Xbbd41d37 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf3Xbbd41d37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf3Xbbd41d37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestThinkingOneOf3Xbbd41d37")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestThinkingOneOf3Xbbd41d37 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestThinkingOneOf3TypeX33127efb>(rawObject, "type")
      return InlineMessagesRequestThinkingOneOf3Xbbd41d37(
        type = type,
        display = rawObject["display"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicThinkingDisplay?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf3Xbbd41d37) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestThinkingOneOf3Xbbd41d37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.display?.let { put("display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestThinkingOneOf3Xbbd41d37(block: InlineMessagesRequestThinkingOneOf3Xbbd41d37.Builder.() -> Unit): InlineMessagesRequestThinkingOneOf3Xbbd41d37 = InlineMessagesRequestThinkingOneOf3Xbbd41d37.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestThinkingOneOf3Xbbd41d37 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
