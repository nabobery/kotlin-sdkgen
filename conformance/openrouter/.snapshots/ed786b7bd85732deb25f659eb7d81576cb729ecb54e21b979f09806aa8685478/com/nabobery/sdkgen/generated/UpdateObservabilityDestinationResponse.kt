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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationResponse
 */
@Serializable(with = UpdateObservabilityDestinationResponse.Serializer::class)
public class UpdateObservabilityDestinationResponse(
  public val `data`: ObservabilityDestination,
) {
  public class Builder {
    private var dataValue: ObservabilityDestination? = null

    public var `data`: ObservabilityDestination
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): UpdateObservabilityDestinationResponse {
      check(dataValue != null) { "data is required" }
      return UpdateObservabilityDestinationResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateObservabilityDestinationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpdateObservabilityDestinationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateObservabilityDestinationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateObservabilityDestinationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpdateObservabilityDestinationResponse must be a JSON object")
      val data = json.decodeRequired<ObservabilityDestination>(rawObject, "data")
      return UpdateObservabilityDestinationResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateObservabilityDestinationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateObservabilityDestinationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateObservabilityDestinationResponse(block: UpdateObservabilityDestinationResponse.Builder.() -> Unit): UpdateObservabilityDestinationResponse = UpdateObservabilityDestinationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UpdateObservabilityDestinationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
