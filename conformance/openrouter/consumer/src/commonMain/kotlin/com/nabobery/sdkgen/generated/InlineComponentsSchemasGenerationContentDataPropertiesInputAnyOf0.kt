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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0.Serializer::class)
public class InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0(
  public val prompt: String,
) {
  public class Builder {
    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    public fun build(): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 {
      check(promptValue != null) { "prompt is required" }
      return InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0(
        prompt = prompt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 must be a " +
          "JSON object")
      val prompt = json.decodeRequired<String>(raw, "prompt")
      return InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0(
        prompt = prompt,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prompt", value.prompt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0(block: InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0.Builder.() -> Unit): InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 = InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasGenerationContentDataPropertiesInputAnyOf0 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
