package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items
 */
@Serializable(with = InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612.Serializer::class)
public class InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612(
  groupMembers: List<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909>,
  /**
   * The name of the concurrency group.
   */
  public val groupName: String,
  /**
   * API URL for this concurrency group. May return 404 if the group
   * has no active items at the time it is requested, since the
   * get-by-name endpoint reports the live repo-wide state of a group
   * while this endpoint lists groups associated with a run by
   * configuration.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val groupUrl: String,
) {
  /**
   * Items belonging to this workflow run that are either currently holding or
   * waiting for the concurrency group lease. May be empty if the run no
   * longer has any active or queued items in this group.
   */
  public val groupMembers:
      List<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909> =
      groupMembers.toList()

  public class Builder {
    private var groupMembersValue:
        List<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909>? = null

    public var groupMembers:
        List<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909>
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

    public fun build(): InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 {
      check(groupMembersValue != null) { "groupMembers is required" }
      check(groupNameValue != null) { "groupName is required" }
      check(groupUrlValue != null) { "groupUrl is required" }
      return InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612(
        groupMembers = groupMembers,
        groupName = groupName,
        groupUrl = groupUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 must be a JSON object")
      val groupMembers = json.decodeRequired<List<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909>>(rawObject, "group_members")
      val groupName = json.decodeRequired<String>(rawObject, "group_name")
      val groupUrl = json.decodeRequired<String>(rawObject, "group_url")
      return InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612(
        groupMembers = groupMembers,
        groupName = groupName,
        groupUrl = groupUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("group_members", json.encodeToJsonElement(value.groupMembers))
        put("group_name", value.groupName)
        put("group_url", value.groupUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612(block: InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612.Builder.() -> Unit): InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 = InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemX396ea612 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
