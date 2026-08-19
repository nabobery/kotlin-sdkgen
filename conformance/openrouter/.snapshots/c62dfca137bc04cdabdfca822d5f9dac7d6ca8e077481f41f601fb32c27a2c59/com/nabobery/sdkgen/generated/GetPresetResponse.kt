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
 * A preset with its currently designated version.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetPresetResponse
 */
@Serializable(with = GetPresetResponse.Serializer::class)
public class GetPresetResponse(
  public val `data`: PresetWithDesignatedVersion,
) {
  public class Builder {
    private var dataValue: PresetWithDesignatedVersion? = null

    public var `data`: PresetWithDesignatedVersion
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GetPresetResponse {
      check(dataValue != null) { "data is required" }
      return GetPresetResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetPresetResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetPresetResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetPresetResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetPresetResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetPresetResponse must be a JSON object")
      val data = json.decodeRequired<PresetWithDesignatedVersion>(rawObject, "data")
      return GetPresetResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetPresetResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetPresetResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getPresetResponse(block: GetPresetResponse.Builder.() -> Unit): GetPresetResponse = GetPresetResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetPresetResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
