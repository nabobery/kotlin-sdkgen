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
 * List of available models
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelsListResponse
 */
@Serializable(with = ModelsListResponse.Serializer::class)
public class ModelsListResponse(
  `data`: List<Model>,
  /**
   * Pagination links
   */
  public val links: InlineModelsListResponseLinksX85316965,
  /**
   * Total number of models matching the query
   */
  public val totalCount: Int,
) {
  public val `data`: List<Model> = data.toList()

  public class Builder {
    private var dataValue: List<Model>? = null

    public var `data`: List<Model>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var linksValue: InlineModelsListResponseLinksX85316965? = null

    public var links: InlineModelsListResponseLinksX85316965
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ModelsListResponse {
      check(dataValue != null) { "data is required" }
      check(linksValue != null) { "links is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ModelsListResponse(
        data = data,
        links = links,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelsListResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModelsListResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelsListResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ModelsListResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModelsListResponse must be a JSON object")
      val data = json.decodeRequired<List<Model>>(rawObject, "data")
      val links = json.decodeRequired<InlineModelsListResponseLinksX85316965>(rawObject, "links")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ModelsListResponse(
        data = data,
        links = links,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelsListResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelsListResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("links", json.encodeToJsonElement(value.links))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelsListResponse(block: ModelsListResponse.Builder.() -> Unit): ModelsListResponse = ModelsListResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelsListResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
