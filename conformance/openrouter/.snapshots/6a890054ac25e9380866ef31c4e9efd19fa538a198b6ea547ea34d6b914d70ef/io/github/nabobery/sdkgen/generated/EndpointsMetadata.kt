package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EndpointsMetadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EndpointsMetadata
 */
@Serializable(with = EndpointsMetadata.Serializer::class)
public class EndpointsMetadata(
  available: List<EndpointInfo>,
  public val total: Int,
) {
  public val available: List<EndpointInfo> = available.toList()

  public class Builder {
    private var availableValue: List<EndpointInfo>? = null

    public var available: List<EndpointInfo>
      get() = requireNotNull(availableValue) { "available is required" }.toList()
      set(`value`) {
        availableValue = value.toList()
      }

    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    public fun build(): EndpointsMetadata {
      check(availableValue != null) { "available is required" }
      check(totalValue != null) { "total is required" }
      return EndpointsMetadata(
        available = available,
        total = total,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EndpointsMetadata = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EndpointsMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EndpointsMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("EndpointsMetadata")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EndpointsMetadata must be a JSON object")
      val available = json.decodeRequired<List<EndpointInfo>>(rawObject, "available")
      val total = json.decodeRequired<Int>(rawObject, "total")
      return EndpointsMetadata(
        available = available,
        total = total,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EndpointsMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("EndpointsMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
        put("total", json.encodeToJsonElement(value.total))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun endpointsMetadata(block: EndpointsMetadata.Builder.() -> Unit): EndpointsMetadata = EndpointsMetadata.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EndpointsMetadata is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
