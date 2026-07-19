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
 * Stored prompt and completion content for a generation
 */
@Serializable(with = GenerationContentResponse.Serializer::class)
public class GenerationContentResponse(
  public val `data`: GenerationContentData,
) {
  public class Builder {
    private var dataValue: GenerationContentData? = null

    public var `data`: GenerationContentData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GenerationContentResponse {
      check(dataValue != null) { "data is required" }
      return GenerationContentResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GenerationContentResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GenerationContentResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GenerationContentResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GenerationContentResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("GenerationContentResponse must be a JSON object")
      val data = json.decodeRequired<GenerationContentData>(raw, "data")
      return GenerationContentResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GenerationContentResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GenerationContentResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun generationContentResponse(block: GenerationContentResponse.Builder.() -> Unit): GenerationContentResponse =
  GenerationContentResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GenerationContentResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
