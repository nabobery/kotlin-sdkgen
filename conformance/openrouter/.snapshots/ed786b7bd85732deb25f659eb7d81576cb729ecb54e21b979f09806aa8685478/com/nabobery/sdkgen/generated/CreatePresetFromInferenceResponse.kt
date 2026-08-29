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
 * Response containing the created preset with its designated version.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreatePresetFromInferenceResponse
 */
@Serializable(with = CreatePresetFromInferenceResponse.Serializer::class)
public class CreatePresetFromInferenceResponse(
  public val `data`: PresetWithDesignatedVersion,
) {
  public class Builder {
    private var dataValue: PresetWithDesignatedVersion? = null

    public var `data`: PresetWithDesignatedVersion
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): CreatePresetFromInferenceResponse {
      check(dataValue != null) { "data is required" }
      return CreatePresetFromInferenceResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreatePresetFromInferenceResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreatePresetFromInferenceResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreatePresetFromInferenceResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CreatePresetFromInferenceResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreatePresetFromInferenceResponse must be a JSON object")
      val data = json.decodeRequired<PresetWithDesignatedVersion>(rawObject, "data")
      return CreatePresetFromInferenceResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreatePresetFromInferenceResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CreatePresetFromInferenceResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createPresetFromInferenceResponse(block: CreatePresetFromInferenceResponse.Builder.() -> Unit): CreatePresetFromInferenceResponse = CreatePresetFromInferenceResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreatePresetFromInferenceResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
