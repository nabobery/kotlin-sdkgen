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
 * A paginated list of preset versions.
 */
@Serializable(with = ListPresetVersionsResponse.Serializer::class)
public class ListPresetVersionsResponse(
  `data`: List<PresetDesignatedVersion?>,
  public val totalCount: Int,
) {
  public val `data`: List<PresetDesignatedVersion?> = data.toList()

  public class Builder {
    private var dataValue: List<PresetDesignatedVersion?>? = null

    public var `data`: List<PresetDesignatedVersion?>
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

    public fun build(): ListPresetVersionsResponse {
      check(dataValue != null) { "data is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ListPresetVersionsResponse(
        data = data,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ListPresetVersionsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ListPresetVersionsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ListPresetVersionsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ListPresetVersionsResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ListPresetVersionsResponse must be a JSON object")
      val data = json.decodeRequired<List<PresetDesignatedVersion?>>(raw, "data")
      val totalCount = json.decodeRequired<Int>(raw, "total_count")
      return ListPresetVersionsResponse(
        data = data,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ListPresetVersionsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ListPresetVersionsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun listPresetVersionsResponse(block: ListPresetVersionsResponse.Builder.() ->
  Unit): ListPresetVersionsResponse = ListPresetVersionsResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ListPresetVersionsResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
