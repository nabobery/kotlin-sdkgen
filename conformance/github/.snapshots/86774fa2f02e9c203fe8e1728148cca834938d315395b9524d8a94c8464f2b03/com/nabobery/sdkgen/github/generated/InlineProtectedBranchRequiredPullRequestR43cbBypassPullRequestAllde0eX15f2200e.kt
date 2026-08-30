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
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_pull_request_reviews/properties
 * /bypass_pull_request_allowances.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_pull_request_reviews/properties
 * /bypass_pull_request_allowances
 */
@Serializable(with = InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e.Serializer::class)
public class InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e(
  teams: List<Team>,
  users: List<SimpleUser>,
  apps: List<Integration?>? = null,
) {
  public val teams: List<Team> = teams.toList()

  public val users: List<SimpleUser> = users.toList()

  public val apps: List<Integration?>? = apps?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var teamsValue: List<Team>? = null

    public var teams: List<Team>
      get() = requireNotNull(teamsValue) { "teams is required" }.toList()
      set(`value`) {
        teamsValue = value.toList()
      }

    private var usersValue: List<SimpleUser>? = null

    public var users: List<SimpleUser>
      get() = requireNotNull(usersValue) { "users is required" }.toList()
      set(`value`) {
        usersValue = value.toList()
      }

    private var appsValue: List<Integration?>? = null

    public var apps: List<Integration?>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e {
      check(teamsValue != null) { "teams is required" }
      check(usersValue != null) { "users is required" }
      return InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e(
        teams = teams,
        users = users,
        apps = apps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e must be a JSON object")
      val teams = json.decodeRequired<List<Team>>(rawObject, "teams")
      val users = json.decodeRequired<List<SimpleUser>>(rawObject, "users")
      return InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e(
        teams = teams,
        users = users,
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<Integration?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
        put("users", json.encodeToJsonElement(value.users))
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e(block: InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e.Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e = InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestR43cbBypassPullRequestAllde0eX15f2200e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
