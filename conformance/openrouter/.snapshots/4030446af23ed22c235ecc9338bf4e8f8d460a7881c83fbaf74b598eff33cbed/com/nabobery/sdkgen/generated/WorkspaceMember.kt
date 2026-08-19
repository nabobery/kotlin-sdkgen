package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/WorkspaceMember.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WorkspaceMember
 */
@Serializable(with = WorkspaceMember.Serializer::class)
public class WorkspaceMember(
  /**
   * ISO 8601 timestamp of when the membership was created
   */
  public val createdAt: String,
  /**
   * Unique identifier for the workspace membership
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val id: String,
  /**
   * Role of the member in the workspace
   */
  public val role: InlineWorkspaceMemberRoleX04c35674,
  /**
   * Clerk user ID of the member
   */
  public val userId: String,
  /**
   * ID of the workspace
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workspaceId: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var roleValue: InlineWorkspaceMemberRoleX04c35674? = null

    public var role: InlineWorkspaceMemberRoleX04c35674
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var userIdValue: String? = null

    public var userId: String
      get() = requireNotNull(userIdValue) { "userId is required" }
      set(`value`) {
        userIdValue = value
      }

    private var workspaceIdValue: String? = null

    public var workspaceId: String
      get() = requireNotNull(workspaceIdValue) { "workspaceId is required" }
      set(`value`) {
        workspaceIdValue = value
      }

    public fun build(): WorkspaceMember {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(roleValue != null) { "role is required" }
      check(userIdValue != null) { "userId is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      return WorkspaceMember(
        createdAt = createdAt,
        id = id,
        role = role,
        userId = userId,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WorkspaceMember = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WorkspaceMember> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WorkspaceMember {
      val jsonDecoder = decoder.requireJsonDecoder("WorkspaceMember")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WorkspaceMember must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<String>(rawObject, "id")
      val role = json.decodeRequired<InlineWorkspaceMemberRoleX04c35674>(rawObject, "role")
      val userId = json.decodeRequired<String>(rawObject, "user_id")
      val workspaceId = json.decodeRequired<String>(rawObject, "workspace_id")
      return WorkspaceMember(
        createdAt = createdAt,
        id = id,
        role = role,
        userId = userId,
        workspaceId = workspaceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: WorkspaceMember) {
      val jsonEncoder = encoder.requireJsonEncoder("WorkspaceMember")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", value.id)
        put("role", json.encodeToJsonElement(value.role))
        put("user_id", value.userId)
        put("workspace_id", value.workspaceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun workspaceMember(block: WorkspaceMember.Builder.() -> Unit): WorkspaceMember = WorkspaceMember.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WorkspaceMember is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
