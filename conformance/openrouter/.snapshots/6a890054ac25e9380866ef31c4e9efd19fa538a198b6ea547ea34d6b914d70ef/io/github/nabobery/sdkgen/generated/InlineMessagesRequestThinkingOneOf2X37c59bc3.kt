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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/1
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf2X37c59bc3.Serializer::class)
public class InlineMessagesRequestThinkingOneOf2X37c59bc3(
  public val type: InlineMessagesRequestThinkingOneOf2TypeX650a8d42,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestThinkingOneOf2TypeX650a8d42? = null

    public var type: InlineMessagesRequestThinkingOneOf2TypeX650a8d42
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesRequestThinkingOneOf2X37c59bc3 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestThinkingOneOf2X37c59bc3(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestThinkingOneOf2X37c59bc3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf2X37c59bc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf2X37c59bc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestThinkingOneOf2X37c59bc3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestThinkingOneOf2X37c59bc3 must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestThinkingOneOf2TypeX650a8d42>(rawObject, "type")
      return InlineMessagesRequestThinkingOneOf2X37c59bc3(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf2X37c59bc3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestThinkingOneOf2X37c59bc3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestThinkingOneOf2X37c59bc3(block: InlineMessagesRequestThinkingOneOf2X37c59bc3.Builder.() -> Unit): InlineMessagesRequestThinkingOneOf2X37c59bc3 = InlineMessagesRequestThinkingOneOf2X37c59bc3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestThinkingOneOf2X37c59bc3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
