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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/4
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf5X204f2350.Serializer::class)
public class InlineOpenAiResponsesToolChoiceAnyOf5X204f2350(
  public val type: InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4,
) {
  public class Builder {
    private var typeValue: InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4? = null

    public var type: InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 {
      check(typeValue != null) { "type is required" }
      return InlineOpenAiResponsesToolChoiceAnyOf5X204f2350(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf5X204f2350> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesToolChoiceAnyOf5X204f2350")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 must be a JSON object")
      val type = json.decodeRequired<InlineOpenAiResponsesToolChoiceAnyOf5TypeX8d1563a4>(rawObject, "type")
      return InlineOpenAiResponsesToolChoiceAnyOf5X204f2350(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf5X204f2350) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesToolChoiceAnyOf5X204f2350")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesToolChoiceAnyOf5X204f2350(block: InlineOpenAiResponsesToolChoiceAnyOf5X204f2350.Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 = InlineOpenAiResponsesToolChoiceAnyOf5X204f2350.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf5X204f2350 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
