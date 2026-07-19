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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3.Serializer::class)
public class InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3(
  public val name: String,
  public val type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType? =
        null

    public var type: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3(
        name = name,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 must be a JSON object")
      val name = json.decodeRequired<String>(raw, "name")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3PropertiesType>(raw, "type")
      return InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3(
        name = name,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3(block: InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3.Builder.() -> Unit): InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 = InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOpenAiResponsesToolChoiceAnyOf3 is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
