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
 * Branch Restriction Policy
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy
 */
@Serializable(with = BranchRestrictionPolicy.Serializer::class)
public class BranchRestrictionPolicy(
  apps: List<InlineBranchRestrictionPolicyAppsItemXd05e85b0>,
  public val appsUrl: String,
  teams: List<Team>,
  public val teamsUrl: String,
  public val url: String,
  users: List<InlineBranchRestrictionPolicyUsersItemX02f62a17>,
  public val usersUrl: String,
) {
  public val apps: List<InlineBranchRestrictionPolicyAppsItemXd05e85b0> = apps.toList()

  public val teams: List<Team> = teams.toList()

  public val users: List<InlineBranchRestrictionPolicyUsersItemX02f62a17> = users.toList()

  public class Builder {
    private var appsValue: List<InlineBranchRestrictionPolicyAppsItemXd05e85b0>? = null

    public var apps: List<InlineBranchRestrictionPolicyAppsItemXd05e85b0>
      get() = requireNotNull(appsValue) { "apps is required" }
      set(`value`) {
        appsValue = value
      }

    private var appsUrlValue: String? = null

    public var appsUrl: String
      get() = requireNotNull(appsUrlValue) { "appsUrl is required" }
      set(`value`) {
        appsUrlValue = value
      }

    private var teamsValue: List<Team>? = null

    public var teams: List<Team>
      get() = requireNotNull(teamsValue) { "teams is required" }
      set(`value`) {
        teamsValue = value
      }

    private var teamsUrlValue: String? = null

    public var teamsUrl: String
      get() = requireNotNull(teamsUrlValue) { "teamsUrl is required" }
      set(`value`) {
        teamsUrlValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var usersValue: List<InlineBranchRestrictionPolicyUsersItemX02f62a17>? = null

    public var users: List<InlineBranchRestrictionPolicyUsersItemX02f62a17>
      get() = requireNotNull(usersValue) { "users is required" }
      set(`value`) {
        usersValue = value
      }

    private var usersUrlValue: String? = null

    public var usersUrl: String
      get() = requireNotNull(usersUrlValue) { "usersUrl is required" }
      set(`value`) {
        usersUrlValue = value
      }

    public fun build(): BranchRestrictionPolicy {
      check(appsValue != null) { "apps is required" }
      check(appsUrlValue != null) { "appsUrl is required" }
      check(teamsValue != null) { "teams is required" }
      check(teamsUrlValue != null) { "teamsUrl is required" }
      check(urlValue != null) { "url is required" }
      check(usersValue != null) { "users is required" }
      check(usersUrlValue != null) { "usersUrl is required" }
      return BranchRestrictionPolicy(
        apps = apps,
        appsUrl = appsUrl,
        teams = teams,
        teamsUrl = teamsUrl,
        url = url,
        users = users,
        usersUrl = usersUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BranchRestrictionPolicy = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BranchRestrictionPolicy> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BranchRestrictionPolicy {
      val jsonDecoder = decoder.requireJsonDecoder("BranchRestrictionPolicy")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BranchRestrictionPolicy must be a JSON object")
      val apps = json.decodeRequired<List<InlineBranchRestrictionPolicyAppsItemXd05e85b0>>(rawObject, "apps")
      val appsUrl = json.decodeRequired<String>(rawObject, "apps_url")
      val teams = json.decodeRequired<List<Team>>(rawObject, "teams")
      val teamsUrl = json.decodeRequired<String>(rawObject, "teams_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      val users = json.decodeRequired<List<InlineBranchRestrictionPolicyUsersItemX02f62a17>>(rawObject, "users")
      val usersUrl = json.decodeRequired<String>(rawObject, "users_url")
      return BranchRestrictionPolicy(
        apps = apps,
        appsUrl = appsUrl,
        teams = teams,
        teamsUrl = teamsUrl,
        url = url,
        users = users,
        usersUrl = usersUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BranchRestrictionPolicy) {
      val jsonEncoder = encoder.requireJsonEncoder("BranchRestrictionPolicy")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apps", json.encodeToJsonElement(value.apps))
        put("apps_url", value.appsUrl)
        put("teams", json.encodeToJsonElement(value.teams))
        put("teams_url", value.teamsUrl)
        put("url", value.url)
        put("users", json.encodeToJsonElement(value.users))
        put("users_url", value.usersUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun branchRestrictionPolicy(block: BranchRestrictionPolicy.Builder.() -> Unit): BranchRestrictionPolicy = BranchRestrictionPolicy.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BranchRestrictionPolicy is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
