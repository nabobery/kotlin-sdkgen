package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1.Serializer::class)
public class InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1(
  messages: List<JsonElement?>,
) {
  public val messages: List<JsonElement?> = messages.toList()

  public class Builder {
    private var messagesValue: List<JsonElement?>? = null

    public var messages: List<JsonElement?>
      get() = requireNotNull(messagesValue) { "messages is required" }
      set(`value`) {
        messagesValue = value
      }

    public fun build(): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 {
      check(messagesValue != null) { "messages is required" }
      return InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1(
        messages = messages,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 must be a " +
          "JSON object")
      val messages = json.decodeRequired<List<JsonElement?>>(raw, "messages")
      return InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1(
        messages = messages,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("messages", json.encodeToJsonElement(value.messages))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1(block: InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1.Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 = InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf1 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
