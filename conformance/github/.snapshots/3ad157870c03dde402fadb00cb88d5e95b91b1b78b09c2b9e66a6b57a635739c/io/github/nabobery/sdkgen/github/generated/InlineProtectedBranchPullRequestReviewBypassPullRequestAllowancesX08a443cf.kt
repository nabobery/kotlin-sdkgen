package io.github.nabobery.sdkgen.github.generated

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
 * Allow specific users, teams, or apps to bypass pull request requirements.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/protected-branch-pull-request-review/properties/bypass_pull_request_
 * allowances
 */
@Serializable(with = InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf.Serializer::class)
public class InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf(
  apps: List<Integration?>? = null,
  teams: List<Team>? = null,
  users: List<SimpleUser>? = null,
) {
  /**
   * The list of apps allowed to bypass pull request requirements.
   */
  public val apps: List<Integration?>? = apps?.let { collection0 -> collection0.toList() }

  /**
   * The list of teams allowed to bypass pull request requirements.
   */
  public val teams: List<Team>? = teams?.let { collection0 -> collection0.toList() }

  /**
   * The list of users allowed to bypass pull request requirements.
   */
  public val users: List<SimpleUser>? = users?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var appsValue: List<Integration?>? = null

    /**
     * The list of apps allowed to bypass pull request requirements.
     */
    public var apps: List<Integration?>?
      get() = appsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var teamsValue: List<Team>? = null

    /**
     * The list of teams allowed to bypass pull request requirements.
     */
    public var teams: List<Team>?
      get() = teamsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        teamsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var usersValue: List<SimpleUser>? = null

    /**
     * The list of users allowed to bypass pull request requirements.
     */
    public var users: List<SimpleUser>?
      get() = usersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        usersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf = InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf(
      apps = apps,
      teams = teams,
      users = users,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf must be a JSON object")
      return InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf(
        apps = rawObject["apps"]?.let { json.decodeFromJsonElement<List<Integration?>>(it) },
        teams = rawObject["teams"]?.let { json.decodeFromJsonElement<List<Team>>(it) },
        users = rawObject["users"]?.let { json.decodeFromJsonElement<List<SimpleUser>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.apps?.let { put("apps", json.encodeToJsonElement(it)) }
        value.teams?.let { put("teams", json.encodeToJsonElement(it)) }
        value.users?.let { put("users", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf(block: InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf.Builder.() -> Unit): InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf = InlineProtectedBranchPullRequestReviewBypassPullRequestAllowancesX08a443cf.build(block)
