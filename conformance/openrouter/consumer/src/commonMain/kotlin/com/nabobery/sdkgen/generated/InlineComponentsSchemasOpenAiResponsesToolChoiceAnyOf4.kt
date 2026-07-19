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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4(
  public val type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType? =
        null

    public var type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4PropertiesType>(raw, "type")
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4(block: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4.Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf4 is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
