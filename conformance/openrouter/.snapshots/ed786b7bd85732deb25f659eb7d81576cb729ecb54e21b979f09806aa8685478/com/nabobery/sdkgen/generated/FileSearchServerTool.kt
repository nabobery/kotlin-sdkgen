package com.nabobery.sdkgen.generated

import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class FileSearchServerToolView internal constructor(
  public val filters: InlineFileSearchServerToolFiltersXeddb71f8? = null,
  @SerialName("max_num_results")
  public val maxNumResults: Int? = null,
  @SerialName("ranking_options")
  public val rankingOptions: InlineFileSearchServerToolRankingOptionsX5b95574c? = null,
  public val type: InlineFileSearchServerToolTypeXcfb1e282,
  @SerialName("vector_store_ids")
  public val vectorStoreIds: List<String>,
)

/**
 * File search tool configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool
 */
@Serializable(with = FileSearchServerTool.Serializer::class)
public class FileSearchServerTool(
  public val type: InlineFileSearchServerToolTypeXcfb1e282,
  vectorStoreIds: List<String>,
  public val filters: InlineFileSearchServerToolFiltersXeddb71f8? = null,
  public val maxNumResults: Int? = null,
  public val rankingOptions: InlineFileSearchServerToolRankingOptionsX5b95574c? = null,
) {
  public val vectorStoreIds: List<String> = vectorStoreIds.toList()

  public class Builder {
    private var typeValue: InlineFileSearchServerToolTypeXcfb1e282? = null

    public var type: InlineFileSearchServerToolTypeXcfb1e282
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var vectorStoreIdsValue: List<String>? = null

    public var vectorStoreIds: List<String>
      get() = requireNotNull(vectorStoreIdsValue) { "vectorStoreIds is required" }.toList()
      set(`value`) {
        vectorStoreIdsValue = value.toList()
      }

    public var filters: InlineFileSearchServerToolFiltersXeddb71f8? = null

    public var maxNumResults: Int? = null

    public var rankingOptions: InlineFileSearchServerToolRankingOptionsX5b95574c? = null

    public fun build(): FileSearchServerTool {
      check(typeValue != null) { "type is required" }
      check(vectorStoreIdsValue != null) { "vectorStoreIds is required" }
      return FileSearchServerTool(
        type = type,
        vectorStoreIds = vectorStoreIds,
        filters = filters,
        maxNumResults = maxNumResults,
        rankingOptions = rankingOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileSearchServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileSearchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileSearchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("FileSearchServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileSearchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineFileSearchServerToolTypeXcfb1e282>(rawObject, "type")
      val vectorStoreIds = json.decodeRequired<List<String>>(rawObject, "vector_store_ids")
      return FileSearchServerTool(
        type = type,
        vectorStoreIds = vectorStoreIds,
        filters = rawObject["filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFileSearchServerToolFiltersXeddb71f8?>(element) },
        maxNumResults = rawObject["max_num_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        rankingOptions = rawObject["ranking_options"]?.let { json.decodeFromJsonElement<InlineFileSearchServerToolRankingOptionsX5b95574c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileSearchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("FileSearchServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("vector_store_ids", json.encodeToJsonElement(value.vectorStoreIds))
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.maxNumResults?.let { put("max_num_results", json.encodeToJsonElement(it)) }
        value.rankingOptions?.let { put("ranking_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileSearchServerTool(block: FileSearchServerTool.Builder.() -> Unit): FileSearchServerTool = FileSearchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileSearchServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
