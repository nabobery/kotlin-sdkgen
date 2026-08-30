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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ListBYOKKeysResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ListBYOKKeysResponse
 */
@Serializable(with = ListByokKeysResponse.Serializer::class)
public class ListByokKeysResponse(
  `data`: List<ByokKey>,
  /**
   * Total number of BYOK credentials matching the filters.
   */
  public val totalCount: Int,
) {
  /**
   * List of BYOK credentials.
   */
  public val `data`: List<ByokKey> = data.toList()

  public class Builder {
    private var dataValue: List<ByokKey>? = null

    public var `data`: List<ByokKey>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ListByokKeysResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListByokKeysResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListByokKeysResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ListByokKeysResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListByokKeysResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListByokKeysResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ListByokKeysResponse must be a JSON object")
      val data = json.decodeRequired<List<ByokKey>>(rawObject, "data")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ListByokKeysResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListByokKeysResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListByokKeysResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listByokKeysResponse(block: ListByokKeysResponse.Builder.() -> Unit): ListByokKeysResponse = ListByokKeysResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListByokKeysResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
