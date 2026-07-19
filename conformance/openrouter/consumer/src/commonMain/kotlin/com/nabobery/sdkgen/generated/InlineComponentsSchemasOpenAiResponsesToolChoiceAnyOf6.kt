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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/6.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6(
  public val type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6PropertiesType,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6PropertiesType? =
        null

    public var type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6PropertiesType>(raw, "type")
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6(block: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6.Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf6 is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
