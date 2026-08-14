package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch-pull-request-review/properties/dismissal_restrictio
 * ns.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch-pull-request-review/properties/dismissal_restrictio
 * ns
 */
@Serializable(with = InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492.Serializer::class)
public class InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492(
  apps: List<Integration?>? = null,
  teams: List<Team>? = null,
  public val teamsUrl: String? = null,
  public val url: String? = null,
  users: List<SimpleUser>? = null,
  public val usersUrl: String? = null,
) {
  /**
   * The list of apps with review dismissal access.
   */
  public val apps: List<Integration?>? = apps?.let { collection0 -> collection0.toList() }

  /**
   * The list of teams with review dismissal access.
   */
  public val teams: List<Team>? = teams?.let { collection0 -> collection0.toList() }

  /**
   * The list of users with review dismissal access.
   */
  public val users: List<SimpleUser>? = users?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var appsValue: List<Integration?>? = null

    /**
     * The list of apps with review dismissal access.
     */
    public var apps: List<Integration?>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var teamsValue: List<Team>? = null

    /**
     * The list of teams with review dismissal access.
     */
    public var teams: List<Team>?
      get() = teamsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        teamsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var teamsUrl: String? = null

    public var url: String? = null

    private var usersValue: List<SimpleUser>? = null

    /**
     * The list of users with review dismissal access.
     */
    public var users: List<SimpleUser>?
      get() = usersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        usersValue = value?.let { collection0 -> collection0.toList() }
      }

    public var usersUrl: String? = null

    public fun build(): InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492 = InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492(
      apps = apps,
      teams = teams,
      teamsUrl = teamsUrl,
      url = url,
      users = users,
      usersUrl = usersUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492 must be a JSON object")
      return InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492(
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<Integration?>>(it) },
        teams = rawObject["teams"]?.let { json.decodeFromJsonElement<List<Team>>(it) },
        teamsUrl = rawObject["teams_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        users = rawObject["users"]?.let { json.decodeFromJsonElement<List<SimpleUser>>(it) },
        usersUrl = rawObject["users_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
        value.teams?.let { put("teams", json.encodeToJsonElement(it)) }
        value.teamsUrl?.let { put("teams_url", it) }
        value.url?.let { put("url", it) }
        value.users?.let { put("users", json.encodeToJsonElement(it)) }
        value.usersUrl?.let { put("users_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492(block: InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492.Builder.() -> Unit): InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492 = InlineProtectedBranchPullRequestReviewDismissalRestrictionsXb8173492.build(block)
