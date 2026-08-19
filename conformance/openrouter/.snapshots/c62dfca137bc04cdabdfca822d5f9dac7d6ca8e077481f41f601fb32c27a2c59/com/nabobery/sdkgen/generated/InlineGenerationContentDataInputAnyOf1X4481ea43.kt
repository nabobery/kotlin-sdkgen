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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input/anyOf/0
 */
@Serializable(with = InlineGenerationContentDataInputAnyOf1X4481ea43.Serializer::class)
public class InlineGenerationContentDataInputAnyOf1X4481ea43(
  public val prompt: String,
) {
  public class Builder {
    private var promptValue: String? = null

    public var prompt: String
      get() = requireNotNull(promptValue) { "prompt is required" }
      set(`value`) {
        promptValue = value
      }

    public fun build(): InlineGenerationContentDataInputAnyOf1X4481ea43 {
      check(promptValue != null) { "prompt is required" }
      return InlineGenerationContentDataInputAnyOf1X4481ea43(
        prompt = prompt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGenerationContentDataInputAnyOf1X4481ea43 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGenerationContentDataInputAnyOf1X4481ea43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGenerationContentDataInputAnyOf1X4481ea43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGenerationContentDataInputAnyOf1X4481ea43")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGenerationContentDataInputAnyOf1X4481ea43 must be a JSON object")
      val prompt = json.decodeRequired<String>(rawObject, "prompt")
      return InlineGenerationContentDataInputAnyOf1X4481ea43(
        prompt = prompt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGenerationContentDataInputAnyOf1X4481ea43) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGenerationContentDataInputAnyOf1X4481ea43")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("prompt", value.prompt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGenerationContentDataInputAnyOf1X4481ea43(block: InlineGenerationContentDataInputAnyOf1X4481ea43.Builder.() -> Unit): InlineGenerationContentDataInputAnyOf1X4481ea43 = InlineGenerationContentDataInputAnyOf1X4481ea43.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGenerationContentDataInputAnyOf1X4481ea43 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
