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
 * A list of concurrency groups associated with a workflow run.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list
 */
@Serializable(with = ConcurrencyGroupRunList.Serializer::class)
public class ConcurrencyGroupRunList(
  concurrencyGroups: List<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612>,
  /**
   * The total number of concurrency groups this workflow run participates in,
   * derived from the run's configuration. This count is not filtered by
   * whether the run currently holds or is waiting in each group, so it can
   * include groups whose `group_members` array is empty (for example, when
   * the run has already released its lease in that group).
   */
  public val totalCount: Int,
) {
  public val concurrencyGroups: List<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612> =
      concurrencyGroups.toList()

  public class Builder {
    private var concurrencyGroupsValue:
        List<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612>? = null

    public var concurrencyGroups: List<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612>
      get() = requireNotNull(concurrencyGroupsValue) { "concurrencyGroups is required" }
      set(`value`) {
        concurrencyGroupsValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ConcurrencyGroupRunList {
      check(concurrencyGroupsValue != null) { "concurrencyGroups is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ConcurrencyGroupRunList(
        concurrencyGroups = concurrencyGroups,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConcurrencyGroupRunList = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ConcurrencyGroupRunList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConcurrencyGroupRunList {
      val jsonDecoder = decoder.requireJsonDecoder("ConcurrencyGroupRunList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConcurrencyGroupRunList must be a JSON object")
      val concurrencyGroups = json.decodeRequired<List<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612>>(rawObject, "concurrency_groups")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ConcurrencyGroupRunList(
        concurrencyGroups = concurrencyGroups,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConcurrencyGroupRunList) {
      val jsonEncoder = encoder.requireJsonEncoder("ConcurrencyGroupRunList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("concurrency_groups", json.encodeToJsonElement(value.concurrencyGroups))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun concurrencyGroupRunList(block: ConcurrencyGroupRunList.Builder.() -> Unit): ConcurrencyGroupRunList = ConcurrencyGroupRunList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConcurrencyGroupRunList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
