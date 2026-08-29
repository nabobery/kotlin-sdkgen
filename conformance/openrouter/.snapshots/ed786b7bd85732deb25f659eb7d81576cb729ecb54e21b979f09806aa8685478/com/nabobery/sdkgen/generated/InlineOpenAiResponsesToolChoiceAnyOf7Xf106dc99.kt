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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/6
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99.Serializer::class)
public class InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99(
  public val type: InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74,
) {
  public class Builder {
    private var typeValue: InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74? = null

    public var type: InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 {
      check(typeValue != null) { "type is required" }
      return InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 must be a JSON object")
      val type = json.decodeRequired<InlineOpenAiResponsesToolChoiceAnyOf7TypeX970ddd74>(rawObject, "type")
      return InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99(block: InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99.Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 = InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf7Xf106dc99 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
