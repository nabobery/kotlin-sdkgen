package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAssignMembersRequest.
 */
@Serializable(with = BulkAssignMembersRequest.Serializer::class)
public class BulkAssignMembersRequest(
  memberUserIds: List<String>,
) {
  /**
   * Array of member user IDs to assign to the guardrail
   */
  public val memberUserIds: List<String> = memberUserIds.toList()

  public class Builder {
    private var memberUserIdsValue: List<String>? = null

    public var memberUserIds: List<String>
      get() = requireNotNull(memberUserIdsValue) { "memberUserIds is required" }
      set(`value`) {
        memberUserIdsValue = value
      }

    public fun build(): BulkAssignMembersRequest {
      check(memberUserIdsValue != null) { "memberUserIds is required" }
      return BulkAssignMembersRequest(
        memberUserIds = memberUserIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAssignMembersRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BulkAssignMembersRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAssignMembersRequest {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAssignMembersRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BulkAssignMembersRequest must be a JSON object")
      val memberUserIds = json.decodeRequired<List<String>>(raw, "member_user_ids")
      return BulkAssignMembersRequest(
        memberUserIds = memberUserIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAssignMembersRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAssignMembersRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("member_user_ids", json.encodeToJsonElement(value.memberUserIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAssignMembersRequest(block: BulkAssignMembersRequest.Builder.() -> Unit): BulkAssignMembersRequest =
  BulkAssignMembersRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkAssignMembersRequest is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
