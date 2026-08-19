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
 * Generation response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationResponse
 */
@Serializable(with = GenerationResponse.Serializer::class)
public class GenerationResponse(
  /**
   * Generation data
   */
  public val `data`: InlineGenerationResponseDataX5ba38337,
) {
  public class Builder {
    private var dataValue: InlineGenerationResponseDataX5ba38337? = null

    public var `data`: InlineGenerationResponseDataX5ba38337
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GenerationResponse {
      check(dataValue != null) { "data is required" }
      return GenerationResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GenerationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GenerationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GenerationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GenerationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GenerationResponse must be a JSON object")
      val data = json.decodeRequired<InlineGenerationResponseDataX5ba38337>(rawObject, "data")
      return GenerationResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GenerationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GenerationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun generationResponse(block: GenerationResponse.Builder.() -> Unit): GenerationResponse = GenerationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GenerationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
