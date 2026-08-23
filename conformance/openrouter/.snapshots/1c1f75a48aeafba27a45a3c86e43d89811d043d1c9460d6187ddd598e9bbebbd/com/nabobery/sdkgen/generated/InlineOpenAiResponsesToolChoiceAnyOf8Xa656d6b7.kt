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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/7.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/7
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7.Serializer::class)
public class InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7(
  public val type: InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2,
) {
  public class Builder {
    private var typeValue: InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2? = null

    public var type: InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 {
      check(typeValue != null) { "type is required" }
      return InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 must be a JSON object")
      val type = json.decodeRequired<InlineOpenAiResponsesToolChoiceAnyOf8TypeXc89fc1c2>(rawObject, "type")
      return InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7(block: InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7.Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 = InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf8Xa656d6b7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
