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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkRemoveWorkspaceMembersRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkRemoveWorkspaceMembersRequest
 */
@Serializable(with = BulkRemoveWorkspaceMembersRequest.Serializer::class)
public class BulkRemoveWorkspaceMembersRequest(
  userIds: List<String>,
) {
  /**
   * List of user IDs to remove from the workspace
   */
  public val userIds: List<String> = userIds.toList()

  public class Builder {
    private var userIdsValue: List<String>? = null

    public var userIds: List<String>
      get() = requireNotNull(userIdsValue) { "userIds is required" }.toList()
      set(`value`) {
        userIdsValue = value.toList()
      }

    public fun build(): BulkRemoveWorkspaceMembersRequest {
      check(userIdsValue != null) { "userIds is required" }
      return BulkRemoveWorkspaceMembersRequest(
        userIds = userIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkRemoveWorkspaceMembersRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkRemoveWorkspaceMembersRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkRemoveWorkspaceMembersRequest {
      val jsonDecoder = decoder.requireJsonDecoder("BulkRemoveWorkspaceMembersRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkRemoveWorkspaceMembersRequest must be a JSON object")
      val userIds = json.decodeRequired<List<String>>(rawObject, "user_ids")
      return BulkRemoveWorkspaceMembersRequest(
        userIds = userIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkRemoveWorkspaceMembersRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkRemoveWorkspaceMembersRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("user_ids", json.encodeToJsonElement(value.userIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkRemoveWorkspaceMembersRequest(block: BulkRemoveWorkspaceMembersRequest.Builder.() -> Unit): BulkRemoveWorkspaceMembersRequest = BulkRemoveWorkspaceMembersRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkRemoveWorkspaceMembersRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
