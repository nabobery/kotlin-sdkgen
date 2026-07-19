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
 * A paginated list of presets.
 */
@Serializable(with = ListPresetsResponse.Serializer::class)
public class ListPresetsResponse(
  `data`: List<Preset>,
  public val totalCount: Int,
) {
  public val `data`: List<Preset> = data.toList()

  public class Builder {
    private var dataValue: List<Preset>? = null

    public var `data`: List<Preset>
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

    public fun build(): ListPresetsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListPresetsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListPresetsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListPresetsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListPresetsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListPresetsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListPresetsResponse must be a JSON object")
      val data = json.decodeRequired<List<Preset>>(raw, "data")
      val totalCount = json.decodeRequired<Int>(raw, "total_count")
      return ListPresetsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListPresetsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListPresetsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listPresetsResponse(block: ListPresetsResponse.Builder.() -> Unit): ListPresetsResponse =
  ListPresetsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListPresetsResponse is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
