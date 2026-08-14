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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesToolChoice/anyOf/3
 */
@Serializable(with = InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c.Serializer::class)
public class InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c(
  public val name: String,
  public val type: InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68? = null

    public var type: InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c {
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c(
        name = name,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineOpenAiResponsesToolChoiceAnyOf4TypeXebdfbb68>(rawObject, "type")
      return InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c(
        name = name,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c(block: InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c.Builder.() -> Unit): InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c = InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOpenAiResponsesToolChoiceAnyOf4X3ee0349c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
