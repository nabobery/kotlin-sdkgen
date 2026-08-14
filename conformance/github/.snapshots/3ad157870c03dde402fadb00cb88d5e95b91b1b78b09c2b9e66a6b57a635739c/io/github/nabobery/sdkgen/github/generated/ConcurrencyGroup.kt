package io.github.nabobery.sdkgen.github.generated

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
 * A concurrency group with the workflow runs and jobs that are either currently holding
 * or waiting for the concurrency group lease.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/concurrency-group
 */
@Serializable(with = ConcurrencyGroup.Serializer::class)
public class ConcurrencyGroup(
  groupMembers: List<InlineConcurrencyGroupGroupMembersItemXb97fe4d5>,
  /**
   * The name of the concurrency group.
   */
  public val groupName: String,
  /**
   * API URL for this concurrency group.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val groupUrl: String,
  public val totalCount: Int,
) {
  public val groupMembers: List<InlineConcurrencyGroupGroupMembersItemXb97fe4d5> =
      groupMembers.toList()

  public class Builder {
    private var groupMembersValue: List<InlineConcurrencyGroupGroupMembersItemXb97fe4d5>? = null

    public var groupMembers: List<InlineConcurrencyGroupGroupMembersItemXb97fe4d5>
      get() = requireNotNull(groupMembersValue) { "groupMembers is required" }.toList()
      set(`value`) {
        groupMembersValue = value.toList()
      }

    private var groupNameValue: String? = null

    public var groupName: String
      get() = requireNotNull(groupNameValue) { "groupName is required" }
      set(`value`) {
        groupNameValue = value
      }

    private var groupUrlValue: String? = null

    public var groupUrl: String
      get() = requireNotNull(groupUrlValue) { "groupUrl is required" }
      set(`value`) {
        groupUrlValue = value
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): ConcurrencyGroup {
      check(groupMembersValue != null) { "groupMembers is required" }
      check(groupNameValue != null) { "groupName is required" }
      check(groupUrlValue != null) { "groupUrl is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return ConcurrencyGroup(
        groupMembers = groupMembers,
        groupName = groupName,
        groupUrl = groupUrl,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConcurrencyGroup = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConcurrencyGroup> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConcurrencyGroup {
      val jsonDecoder = decoder.requireJsonDecoder("ConcurrencyGroup")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConcurrencyGroup must be a JSON object")
      val groupMembers = json.decodeRequired<List<InlineConcurrencyGroupGroupMembersItemXb97fe4d5>>(rawObject, "group_members")
      val groupName = json.decodeRequired<String>(rawObject, "group_name")
      val groupUrl = json.decodeRequired<String>(rawObject, "group_url")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return ConcurrencyGroup(
        groupMembers = groupMembers,
        groupName = groupName,
        groupUrl = groupUrl,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConcurrencyGroup) {
      val jsonEncoder = encoder.requireJsonEncoder("ConcurrencyGroup")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("group_members", json.encodeToJsonElement(value.groupMembers))
        put("group_name", value.groupName)
        put("group_url", value.groupUrl)
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun concurrencyGroup(block: ConcurrencyGroup.Builder.() -> Unit): ConcurrencyGroup = ConcurrencyGroup.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConcurrencyGroup is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
