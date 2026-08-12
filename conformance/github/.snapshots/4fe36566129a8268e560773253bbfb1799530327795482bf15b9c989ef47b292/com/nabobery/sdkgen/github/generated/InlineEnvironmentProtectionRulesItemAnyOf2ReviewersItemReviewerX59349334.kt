package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
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

public enum class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Branch {
  SimpleUser,
  Team,
}

public sealed class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334DecodingException(
  message: String,
) : SerializationException(message)

public class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334NoMatchException(
  message: String,
) : InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334DecodingException(message)

internal data class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Inspection(
  public val matchesSimpleUser: Boolean,
  public val matchesTeam: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSimpleUser, matchesTeam).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1/properties/rev
 * iewers/items/properties/reviewer.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/environment/properties/protection_rules/items/anyOf/1/properties/rev
 * iewers/items/properties/reviewer
 */
@Serializable(with = InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334.Serializer::class)
public class InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Inspection,
) {
  public val simpleUser: SimpleUserView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSimpleUser) json.decodeFromJsonElement<SimpleUserView>(raw) else null }

  public val team: TeamView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTeam) json.decodeFromJsonElement<TeamView>(raw) else null }

  public val matchedBranches:
      Set<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Branch>
    get() = buildSet {
      if (inspection.matchesSimpleUser) add(InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Branch.SimpleUser)
      if (inspection.matchesTeam) add(InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Branch.Team)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334 {
      val inspection = inspectInlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334(raw)
      if (inspection.matchCount == 0) {
        throw InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334NoMatchException("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334) {
      encoder.requireJsonEncoder("InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334(element: JsonElement): InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Inspection {
  val raw = element as? JsonObject ?: return InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Inspection(
    matchesSimpleUser = false,
    matchesTeam = false,
    failures = listOf("SimpleUser: expected JSON object", "Team: expected JSON object"),
  )
  val matchesSimpleUser = raw["avatar_url"].isString() && raw["events_url"].isString() && raw["followers_url"].isString() && raw["following_url"].isString() && raw["gists_url"].isString() && raw["gravatar_id"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["login"].isString() && raw["node_id"].isString() && raw["organizations_url"].isString() && raw["received_events_url"].isString() && raw["repos_url"].isString() && raw["site_admin"] != null && raw["starred_url"].isString() && raw["subscriptions_url"].isString() && raw["type"].isString() && raw["url"].isString()
  val matchesTeam = raw["description"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["members_url"].isString() && raw["name"].isString() && raw["node_id"].isString() && raw["parent"] != null && raw["permission"].isString() && raw["repositories_url"].isString() && raw["slug"].isString() && raw["type"] != null && raw["url"].isString()
  return InlineEnvironmentProtectionRulesItemAnyOf2ReviewersItemReviewerX59349334Inspection(
    matchesSimpleUser = matchesSimpleUser,
    matchesTeam = matchesTeam,
    failures = buildList {
      if (!matchesSimpleUser) add("SimpleUser: required properties 'avatar_url', 'events_url', 'followers_url', 'following_url', 'gists_url', 'gravatar_id', 'html_url', 'id', 'login', 'node_id', 'organizations_url', 'received_events_url', 'repos_url', 'site_admin', 'starred_url', 'subscriptions_url', 'type', 'url' do not match their declared types")
      if (!matchesTeam) add("Team: required properties 'description', 'html_url', 'id', 'members_url', 'name', 'node_id', 'parent', 'permission', 'repositories_url', 'slug', 'type', 'url' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
