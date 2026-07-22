package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/team-role-assignment/properties/permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-role-assignment/properties/permissions
 */
@Serializable(with = InlineTeamRoleAssignmentPermissionsX9f9d0d2a.Serializer::class)
public class InlineTeamRoleAssignmentPermissionsX9f9d0d2a(
  public val admin: Boolean,
  public val maintain: Boolean,
  public val pull: Boolean,
  public val push: Boolean,
  public val triage: Boolean,
) {
  public class Builder {
    private var adminValue: Boolean? = null

    public var admin: Boolean
      get() = requireNotNull(adminValue) { "admin is required" }
      set(`value`) {
        adminValue = value
      }

    private var maintainValue: Boolean? = null

    public var maintain: Boolean
      get() = requireNotNull(maintainValue) { "maintain is required" }
      set(`value`) {
        maintainValue = value
      }

    private var pullValue: Boolean? = null

    public var pull: Boolean
      get() = requireNotNull(pullValue) { "pull is required" }
      set(`value`) {
        pullValue = value
      }

    private var pushValue: Boolean? = null

    public var push: Boolean
      get() = requireNotNull(pushValue) { "push is required" }
      set(`value`) {
        pushValue = value
      }

    private var triageValue: Boolean? = null

    public var triage: Boolean
      get() = requireNotNull(triageValue) { "triage is required" }
      set(`value`) {
        triageValue = value
      }

    public fun build(): InlineTeamRoleAssignmentPermissionsX9f9d0d2a {
      check(adminValue != null) { "admin is required" }
      check(maintainValue != null) { "maintain is required" }
      check(pullValue != null) { "pull is required" }
      check(pushValue != null) { "push is required" }
      check(triageValue != null) { "triage is required" }
      return InlineTeamRoleAssignmentPermissionsX9f9d0d2a(
        admin = admin,
        maintain = maintain,
        pull = pull,
        push = push,
        triage = triage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamRoleAssignmentPermissionsX9f9d0d2a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineTeamRoleAssignmentPermissionsX9f9d0d2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamRoleAssignmentPermissionsX9f9d0d2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamRoleAssignmentPermissionsX9f9d0d2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamRoleAssignmentPermissionsX9f9d0d2a must be a JSON object")
      val admin = json.decodeRequired<Boolean>(rawObject, "admin")
      val maintain = json.decodeRequired<Boolean>(rawObject, "maintain")
      val pull = json.decodeRequired<Boolean>(rawObject, "pull")
      val push = json.decodeRequired<Boolean>(rawObject, "push")
      val triage = json.decodeRequired<Boolean>(rawObject, "triage")
      return InlineTeamRoleAssignmentPermissionsX9f9d0d2a(
        admin = admin,
        maintain = maintain,
        pull = pull,
        push = push,
        triage = triage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamRoleAssignmentPermissionsX9f9d0d2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamRoleAssignmentPermissionsX9f9d0d2a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("admin", json.encodeToJsonElement(value.admin))
        put("maintain", json.encodeToJsonElement(value.maintain))
        put("pull", json.encodeToJsonElement(value.pull))
        put("push", json.encodeToJsonElement(value.push))
        put("triage", json.encodeToJsonElement(value.triage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamRoleAssignmentPermissionsX9f9d0d2a(block: InlineTeamRoleAssignmentPermissionsX9f9d0d2a.Builder.() -> Unit): InlineTeamRoleAssignmentPermissionsX9f9d0d2a = InlineTeamRoleAssignmentPermissionsX9f9d0d2a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTeamRoleAssignmentPermissionsX9f9d0d2a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
