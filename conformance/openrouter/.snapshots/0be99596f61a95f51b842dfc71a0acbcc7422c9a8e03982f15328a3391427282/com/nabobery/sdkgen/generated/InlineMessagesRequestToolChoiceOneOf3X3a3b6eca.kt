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

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2
 */
@Serializable(with = InlineMessagesRequestToolChoiceOneOf3X3a3b6eca.Serializer::class)
public class InlineMessagesRequestToolChoiceOneOf3X3a3b6eca(
  public val type: InlineMessagesRequestToolChoiceOneOf3TypeXda87284b,
) {
  public class Builder {
    private var typeValue: InlineMessagesRequestToolChoiceOneOf3TypeXda87284b? = null

    public var type: InlineMessagesRequestToolChoiceOneOf3TypeXda87284b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesRequestToolChoiceOneOf3X3a3b6eca {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolChoiceOneOf3X3a3b6eca(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf3X3a3b6eca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolChoiceOneOf3X3a3b6eca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolChoiceOneOf3X3a3b6eca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolChoiceOneOf3X3a3b6eca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf3X3a3b6eca must be a JSON object")
      val type = json.decodeRequired<InlineMessagesRequestToolChoiceOneOf3TypeXda87284b>(rawObject, "type")
      return InlineMessagesRequestToolChoiceOneOf3X3a3b6eca(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolChoiceOneOf3X3a3b6eca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolChoiceOneOf3X3a3b6eca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestToolChoiceOneOf3X3a3b6eca(block: InlineMessagesRequestToolChoiceOneOf3X3a3b6eca.Builder.() -> Unit): InlineMessagesRequestToolChoiceOneOf3X3a3b6eca = InlineMessagesRequestToolChoiceOneOf3X3a3b6eca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolChoiceOneOf3X3a3b6eca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
