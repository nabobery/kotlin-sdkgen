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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GetObservabilityDestinationResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GetObservabilityDestinationResponse
 */
@Serializable(with = GetObservabilityDestinationResponse.Serializer::class)
public class GetObservabilityDestinationResponse(
  public val `data`: ObservabilityDestination,
) {
  public class Builder {
    private var dataValue: ObservabilityDestination? = null

    public var `data`: ObservabilityDestination
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): GetObservabilityDestinationResponse {
      check(dataValue != null) { "data is required" }
      return GetObservabilityDestinationResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GetObservabilityDestinationResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GetObservabilityDestinationResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GetObservabilityDestinationResponse {
      val jsonDecoder = decoder.requireJsonDecoder("GetObservabilityDestinationResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GetObservabilityDestinationResponse must be a JSON object")
      val data = json.decodeRequired<ObservabilityDestination>(rawObject, "data")
      return GetObservabilityDestinationResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GetObservabilityDestinationResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("GetObservabilityDestinationResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun getObservabilityDestinationResponse(block: GetObservabilityDestinationResponse.Builder.() -> Unit): GetObservabilityDestinationResponse = GetObservabilityDestinationResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GetObservabilityDestinationResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
