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
 * Stored prompt and completion content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData
 */
@Serializable(with = GenerationContentData.Serializer::class)
public class GenerationContentData(
  /**
   * The input to the generation — either a prompt string or an array of messages
   */
  public val input: InlineGenerationContentDataInputX27fbcb8e,
  /**
   * The output from the generation
   */
  public val output: InlineGenerationContentDataOutputX0857aa88,
) {
  public class Builder {
    private var inputValue: InlineGenerationContentDataInputX27fbcb8e? = null

    public var input: InlineGenerationContentDataInputX27fbcb8e
      get() = requireNotNull(inputValue) { "input is required" }
      set(`value`) {
        inputValue = value
      }

    private var outputValue: InlineGenerationContentDataOutputX0857aa88? = null

    public var output: InlineGenerationContentDataOutputX0857aa88
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    public fun build(): GenerationContentData {
      check(inputValue != null) { "input is required" }
      check(outputValue != null) { "output is required" }
      return GenerationContentData(
        input = input,
        output = output,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GenerationContentData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GenerationContentData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GenerationContentData {
      val jsonDecoder = decoder.requireJsonDecoder("GenerationContentData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GenerationContentData must be a JSON object")
      val input = json.decodeRequired<InlineGenerationContentDataInputX27fbcb8e>(rawObject, "input")
      val output = json.decodeRequired<InlineGenerationContentDataOutputX0857aa88>(rawObject, "output")
      return GenerationContentData(
        input = input,
        output = output,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GenerationContentData) {
      val jsonEncoder = encoder.requireJsonEncoder("GenerationContentData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input", json.encodeToJsonElement(value.input))
        put("output", json.encodeToJsonElement(value.output))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun generationContentData(block: GenerationContentData.Builder.() -> Unit): GenerationContentData = GenerationContentData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GenerationContentData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
