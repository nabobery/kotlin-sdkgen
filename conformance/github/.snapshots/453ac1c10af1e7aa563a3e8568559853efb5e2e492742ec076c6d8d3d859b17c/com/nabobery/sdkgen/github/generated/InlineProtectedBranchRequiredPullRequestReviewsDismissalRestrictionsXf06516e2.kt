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
 * /dismissal_restrictions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch/properties/required_pull_request_reviews/properties
 * /dismissal_restrictions
 */
@Serializable(with = InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2.Serializer::class)
public class InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2(
  teams: List<Team>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val teamsUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  users: List<SimpleUser>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val usersUrl: String,
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

    private var usersValue: List<SimpleUser>? = null

    public var users: List<SimpleUser>
      get() = requireNotNull(usersValue) { "users is required" }.toList()
      set(`value`) {
        usersValue = value.toList()
      }

    private var usersUrlValue: String? = null

    public var usersUrl: String
      get() = requireNotNull(usersUrlValue) { "usersUrl is required" }
      set(`value`) {
        usersUrlValue = value
      }

    private var appsValue: List<Integration?>? = null

    public var apps: List<Integration?>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 {
      check(teamsValue != null) { "teams is required" }
      check(teamsUrlValue != null) { "teamsUrl is required" }
      check(urlValue != null) { "url is required" }
      check(usersValue != null) { "users is required" }
      check(usersUrlValue != null) { "usersUrl is required" }
      return InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2(
        teams = teams,
        teamsUrl = teamsUrl,
        url = url,
        users = users,
        usersUrl = usersUrl,
        apps = apps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 must be a JSON object")
      val teams = json.decodeRequired<List<Team>>(rawObject, "teams")
      val teamsUrl = json.decodeRequired<String>(rawObject, "teams_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      val users = json.decodeRequired<List<SimpleUser>>(rawObject, "users")
      val usersUrl = json.decodeRequired<String>(rawObject, "users_url")
      return InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2(
        teams = teams,
        teamsUrl = teamsUrl,
        url = url,
        users = users,
        usersUrl = usersUrl,
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<Integration?>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("teams", json.encodeToJsonElement(value.teams))
        put("teams_url", value.teamsUrl)
        put("url", value.url)
        put("users", json.encodeToJsonElement(value.users))
        put("users_url", value.usersUrl)
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2(block: InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2.Builder.() -> Unit): InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 = InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineProtectedBranchRequiredPullRequestReviewsDismissalRestrictionsXf06516e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
