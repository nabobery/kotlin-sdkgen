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
 * Single model response
 */
@Serializable(with = ModelResponse.Serializer::class)
public class ModelResponse(
  public val `data`: Model,
) {
  public class Builder {
    private var dataValue: Model? = null

    public var `data`: Model
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ModelResponse {
      check(dataValue != null) { "data is required" }
      return ModelResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ModelResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ModelResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ModelResponse must be a JSON object")
      val data = json.decodeRequired<Model>(raw, "data")
      return ModelResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelResponse(block: ModelResponse.Builder.() -> Unit): ModelResponse = ModelResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
