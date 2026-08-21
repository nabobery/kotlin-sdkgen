package com.nabobery.sdkgen.github.generated

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
 * A list of active concurrency groups for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-list
 */
@Serializable(with = ConcurrencyGroupList.Serializer::class)
public class ConcurrencyGroupList(
  concurrencyGroups: List<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d>,
  public val totalCount: Int,
) {
  public val concurrencyGroups: List<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d> =
      concurrencyGroups.toList()

  public class Builder {
    private var concurrencyGroupsValue:
        List<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d>? = null

    public var concurrencyGroups: List<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d>
      get() = requireNotNull(concurrencyGroupsValue) { "concurrencyGroups is required" }.toList()
      set(`value`) {
        concurrencyGroupsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ConcurrencyGroupList {
      check(concurrencyGroupsValue != null) { "concurrencyGroups is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ConcurrencyGroupList(
        concurrencyGroups = concurrencyGroups,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConcurrencyGroupList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConcurrencyGroupList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConcurrencyGroupList {
      val jsonDecoder = decoder.requireJsonDecoder("ConcurrencyGroupList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConcurrencyGroupList must be a JSON object")
      val concurrencyGroups = json.decodeRequired<List<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d>>(rawObject, "concurrency_groups")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ConcurrencyGroupList(
        concurrencyGroups = concurrencyGroups,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConcurrencyGroupList) {
      val jsonEncoder = encoder.requireJsonEncoder("ConcurrencyGroupList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("concurrency_groups", json.encodeToJsonElement(value.concurrencyGroups))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun concurrencyGroupList(block: ConcurrencyGroupList.Builder.() -> Unit): ConcurrencyGroupList = ConcurrencyGroupList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConcurrencyGroupList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
