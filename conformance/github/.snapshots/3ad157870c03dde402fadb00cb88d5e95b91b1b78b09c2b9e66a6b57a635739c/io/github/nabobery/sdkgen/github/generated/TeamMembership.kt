package io.github.nabobery.sdkgen.github.generated

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
 * Team Membership
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-membership
 */
@Serializable(with = TeamMembership.Serializer::class)
public class TeamMembership(
  /**
   * The role of the user in the team.
   */
  public val role: InlineTeamMembershipRoleX5a37b681,
  /**
   * The state of the user's membership in the team.
   */
  public val state: InlineTeamMembershipStateX640c764d,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var roleValue: InlineTeamMembershipRoleX5a37b681? = null

    public var role: InlineTeamMembershipRoleX5a37b681
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var stateValue: InlineTeamMembershipStateX640c764d? = null

    public var state: InlineTeamMembershipStateX640c764d
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): TeamMembership {
      check(roleValue != null) { "role is required" }
      check(stateValue != null) { "state is required" }
      check(urlValue != null) { "url is required" }
      return TeamMembership(
        role = role,
        state = state,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TeamMembership = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TeamMembership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TeamMembership {
      val jsonDecoder = decoder.requireJsonDecoder("TeamMembership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TeamMembership must be a JSON object")
      val role = json.decodeRequired<InlineTeamMembershipRoleX5a37b681>(rawObject, "role")
      val state = json.decodeRequired<InlineTeamMembershipStateX640c764d>(rawObject, "state")
      val url = json.decodeRequired<String>(rawObject, "url")
      return TeamMembership(
        role = role,
        state = state,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TeamMembership) {
      val jsonEncoder = encoder.requireJsonEncoder("TeamMembership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("role", json.encodeToJsonElement(value.role))
        put("state", json.encodeToJsonElement(value.state))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun teamMembership(block: TeamMembership.Builder.() -> Unit): TeamMembership = TeamMembership.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TeamMembership is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
