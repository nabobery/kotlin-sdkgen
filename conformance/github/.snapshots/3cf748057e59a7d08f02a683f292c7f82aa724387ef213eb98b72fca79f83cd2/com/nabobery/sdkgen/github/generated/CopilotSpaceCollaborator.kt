package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912View(
  @SerialName("actor_type")
  public val actorType: InlineCopilotSpaceCollaboratorAnyOf1AllOf2ActorTypeXeaf570b4,
  @SerialName("avatar_url")
  public val avatarUrl: String,
  public val email: String? = null,
  @SerialName("events_url")
  public val eventsUrl: String,
  @SerialName("followers_url")
  public val followersUrl: String,
  @SerialName("following_url")
  public val followingUrl: String,
  @SerialName("gists_url")
  public val gistsUrl: String,
  @SerialName("gravatar_id")
  public val gravatarId: String?,
  @SerialName("html_url")
  public val htmlUrl: String,
  public val id: Long,
  public val login: String,
  public val name: String? = null,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("organizations_url")
  public val organizationsUrl: String,
  @SerialName("received_events_url")
  public val receivedEventsUrl: String,
  @SerialName("repos_url")
  public val reposUrl: String,
  public val role: InlineCopilotSpaceCollaboratorAnyOf1AllOf2RoleXcf063803,
  @SerialName("site_admin")
  public val siteAdmin: Boolean,
  @SerialName("starred_at")
  public val starredAt: String? = null,
  @SerialName("starred_url")
  public val starredUrl: String,
  @SerialName("subscriptions_url")
  public val subscriptionsUrl: String,
  public val type: String,
  public val url: String,
  @SerialName("user_view_type")
  public val userViewType: String? = null,
)

@Serializable
public data class CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf2X1c163379View(
  @SerialName("actor_type")
  public val actorType: InlineCopilotSpaceCollaboratorAnyOf2ActorTypeX3cd0d154,
  public val description: String? = null,
  @SerialName("html_url")
  public val htmlUrl: String? = null,
  public val id: Int,
  @SerialName("members_url")
  public val membersUrl: String? = null,
  public val name: String,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("notification_setting")
  public val notificationSetting: String? = null,
  @SerialName("organization_id")
  public val organizationId: Int? = null,
  public val parent: JsonElement? = null,
  public val privacy: String? = null,
  @SerialName("repositories_url")
  public val repositoriesUrl: String? = null,
  public val role: InlineCopilotSpaceCollaboratorAnyOf2RoleX003417f8,
  public val slug: String,
  public val type: InlineCopilotSpaceCollaboratorAnyOf2TypeXd9a33de8,
  public val url: String? = null,
)

public enum class CopilotSpaceCollaboratorBranch {
  InlineCopilotSpaceCollaboratorAnyOf1Xec8d9912,
  InlineCopilotSpaceCollaboratorAnyOf2X1c163379,
}

public sealed class CopilotSpaceCollaboratorDecodingException(
  message: String,
) : SerializationException(message)

public class CopilotSpaceCollaboratorNoMatchException(
  message: String,
) : CopilotSpaceCollaboratorDecodingException(message)

internal data class CopilotSpaceCollaboratorInspection(
  public val matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912: Boolean,
  public val matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912, matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379).count { it }
}

/**
 * A collaborator (user or team) of a Copilot Space
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space-collaborator
 */
@Serializable(with = CopilotSpaceCollaborator.Serializer::class)
public class CopilotSpaceCollaborator internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: CopilotSpaceCollaboratorInspection,
) {
  public val inlineCopilotSpaceCollaboratorAnyOf1Xec8d9912:
      CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912) json.decodeFromJsonElement<CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912View>(raw) else null }

  public val inlineCopilotSpaceCollaboratorAnyOf2X1c163379:
      CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf2X1c163379View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379) json.decodeFromJsonElement<CopilotSpaceCollaboratorInlineCopilotSpaceCollaboratorAnyOf2X1c163379View>(raw) else null }

  public val matchedBranches: Set<CopilotSpaceCollaboratorBranch>
    get() = buildSet {
      if (inspection.matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912) add(CopilotSpaceCollaboratorBranch.InlineCopilotSpaceCollaboratorAnyOf1Xec8d9912)
      if (inspection.matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379) add(CopilotSpaceCollaboratorBranch.InlineCopilotSpaceCollaboratorAnyOf2X1c163379)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): CopilotSpaceCollaborator {
      val inspection = inspectCopilotSpaceCollaborator(raw)
      if (inspection.matchCount == 0) {
        throw CopilotSpaceCollaboratorNoMatchException("CopilotSpaceCollaborator matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return CopilotSpaceCollaborator(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<CopilotSpaceCollaborator> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotSpaceCollaborator {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotSpaceCollaborator")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: CopilotSpaceCollaborator) {
      encoder.requireJsonEncoder("CopilotSpaceCollaborator").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectCopilotSpaceCollaborator(element: JsonElement): CopilotSpaceCollaboratorInspection {
  val raw = element as? JsonObject ?: return CopilotSpaceCollaboratorInspection(
    matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912 = false,
    matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379 = false,
    failures = listOf("InlineCopilotSpaceCollaboratorAnyOf1Xec8d9912: expected JSON object", "InlineCopilotSpaceCollaboratorAnyOf2X1c163379: expected JSON object"),
  )
  val matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912 = raw["actor_type"] != null && raw["avatar_url"].isString() && raw["events_url"].isString() && raw["followers_url"].isString() && raw["following_url"].isString() && raw["gists_url"].isString() && raw["gravatar_id"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["login"].isString() && raw["node_id"].isString() && raw["organizations_url"].isString() && raw["received_events_url"].isString() && raw["repos_url"].isString() && raw["role"] != null && raw["site_admin"] != null && raw["starred_url"].isString() && raw["subscriptions_url"].isString() && raw["type"].isString() && raw["url"].isString()
  val matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379 = raw["actor_type"] != null && raw["id"] != null && raw["name"].isString() && raw["node_id"].isString() && raw["role"] != null && raw["slug"].isString() && raw["type"] != null
  return CopilotSpaceCollaboratorInspection(
    matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912 = matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912,
    matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379 = matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379,
    failures = buildList {
      if (!matchesInlineCopilotSpaceCollaboratorAnyOf1Xec8d9912) add("InlineCopilotSpaceCollaboratorAnyOf1Xec8d9912: required properties 'actor_type', 'avatar_url', 'events_url', 'followers_url', 'following_url', 'gists_url', 'gravatar_id', 'html_url', 'id', 'login', 'node_id', 'organizations_url', 'received_events_url', 'repos_url', 'role', 'site_admin', 'starred_url', 'subscriptions_url', 'type', 'url' do not match their declared types")
      if (!matchesInlineCopilotSpaceCollaboratorAnyOf2X1c163379) add("InlineCopilotSpaceCollaboratorAnyOf2X1c163379: required properties 'actor_type', 'id', 'name', 'node_id', 'role', 'slug', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
