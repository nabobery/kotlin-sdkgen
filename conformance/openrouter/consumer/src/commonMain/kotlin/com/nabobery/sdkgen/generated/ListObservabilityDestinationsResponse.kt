package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListObservabilityDestinationsResponse.
 */
@Serializable(with = ListObservabilityDestinationsResponse.Serializer::class)
public class ListObservabilityDestinationsResponse(
  `data`: List<ObservabilityDestination>,
  /**
   * Total number of destinations matching the filters.
   */
  public val totalCount: Int,
) {
  /**
   * List of observability destinations.
   */
  public val `data`: List<ObservabilityDestination> = data.toList()

  public class Builder {
    private var dataValue: List<ObservabilityDestination>? = null

    public var `data`: List<ObservabilityDestination>
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ListObservabilityDestinationsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListObservabilityDestinationsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListObservabilityDestinationsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListObservabilityDestinationsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListObservabilityDestinationsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListObservabilityDestinationsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListObservabilityDestinationsResponse must be a JSON object")
      val data = json.decodeRequired<List<ObservabilityDestination>>(raw, "data")
      val totalCount = json.decodeRequired<Int>(raw, "total_count")
      return ListObservabilityDestinationsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListObservabilityDestinationsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListObservabilityDestinationsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listObservabilityDestinationsResponse(block: ListObservabilityDestinationsResponse.Builder.() ->
  Unit): ListObservabilityDestinationsResponse = ListObservabilityDestinationsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ListObservabilityDestinationsResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
