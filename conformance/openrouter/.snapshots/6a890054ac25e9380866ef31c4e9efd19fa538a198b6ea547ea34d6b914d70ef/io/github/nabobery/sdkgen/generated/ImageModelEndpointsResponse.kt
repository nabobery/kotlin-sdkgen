package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * The full per-endpoint records for an image model.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageModelEndpointsResponse
 */
@Serializable(with = ImageModelEndpointsResponse.Serializer::class)
public class ImageModelEndpointsResponse(
  endpoints: List<ImageEndpoint>,
  /**
   * Model slug
   */
  public val id: String,
) {
  public val endpoints: List<ImageEndpoint> = endpoints.toList()

  public class Builder {
    private var endpointsValue: List<ImageEndpoint>? = null

    public var endpoints: List<ImageEndpoint>
      get() = requireNotNull(endpointsValue) { "endpoints is required" }.toList()
      set(`value`) {
        endpointsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): ImageModelEndpointsResponse {
      check(endpointsValue != null) { "endpoints is required" }
      check(idValue != null) { "id is required" }
      return ImageModelEndpointsResponse(
        endpoints = endpoints,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageModelEndpointsResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImageModelEndpointsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageModelEndpointsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ImageModelEndpointsResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImageModelEndpointsResponse must be a JSON object")
      val endpoints = json.decodeRequired<List<ImageEndpoint>>(rawObject, "endpoints")
      val id = json.decodeRequired<String>(rawObject, "id")
      return ImageModelEndpointsResponse(
        endpoints = endpoints,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageModelEndpointsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageModelEndpointsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("endpoints", json.encodeToJsonElement(value.endpoints))
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageModelEndpointsResponse(block: ImageModelEndpointsResponse.Builder.() -> Unit): ImageModelEndpointsResponse = ImageModelEndpointsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImageModelEndpointsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
