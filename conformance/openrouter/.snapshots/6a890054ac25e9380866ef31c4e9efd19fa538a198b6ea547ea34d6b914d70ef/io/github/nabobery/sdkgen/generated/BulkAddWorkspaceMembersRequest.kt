package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/BulkAddWorkspaceMembersRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BulkAddWorkspaceMembersRequest
 */
@Serializable(with = BulkAddWorkspaceMembersRequest.Serializer::class)
public class BulkAddWorkspaceMembersRequest(
  userIds: List<String>,
) {
  /**
   * List of user IDs to add to the workspace. Members are assigned the same role they hold in the organization.
   */
  public val userIds: List<String> = userIds.toList()

  public class Builder {
    private var userIdsValue: List<String>? = null

    public var userIds: List<String>
      get() = requireNotNull(userIdsValue) { "userIds is required" }.toList()
      set(`value`) {
        userIdsValue = value.toList()
      }

    public fun build(): BulkAddWorkspaceMembersRequest {
      check(userIdsValue != null) { "userIds is required" }
      return BulkAddWorkspaceMembersRequest(
        userIds = userIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BulkAddWorkspaceMembersRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BulkAddWorkspaceMembersRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BulkAddWorkspaceMembersRequest {
      val jsonDecoder = decoder.requireJsonDecoder("BulkAddWorkspaceMembersRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BulkAddWorkspaceMembersRequest must be a JSON object")
      val userIds = json.decodeRequired<List<String>>(rawObject, "user_ids")
      return BulkAddWorkspaceMembersRequest(
        userIds = userIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BulkAddWorkspaceMembersRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("BulkAddWorkspaceMembersRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("user_ids", json.encodeToJsonElement(value.userIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bulkAddWorkspaceMembersRequest(block: BulkAddWorkspaceMembersRequest.Builder.() -> Unit): BulkAddWorkspaceMembersRequest = BulkAddWorkspaceMembersRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BulkAddWorkspaceMembersRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
