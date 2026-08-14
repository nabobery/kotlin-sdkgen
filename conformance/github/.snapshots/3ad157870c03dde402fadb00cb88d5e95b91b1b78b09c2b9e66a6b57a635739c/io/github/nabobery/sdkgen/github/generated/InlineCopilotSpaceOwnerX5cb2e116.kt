package io.github.nabobery.sdkgen.github.generated

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

public enum class InlineCopilotSpaceOwnerX5cb2e116Branch {
  SimpleUser,
  OrganizationSimple,
}

public sealed class InlineCopilotSpaceOwnerX5cb2e116DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCopilotSpaceOwnerX5cb2e116NoMatchException(
  message: String,
) : InlineCopilotSpaceOwnerX5cb2e116DecodingException(message)

internal data class InlineCopilotSpaceOwnerX5cb2e116Inspection(
  public val matchesSimpleUser: Boolean,
  public val matchesOrganizationSimple: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSimpleUser, matchesOrganizationSimple).count { it }
}

/**
 * The user or organization that owns this space.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-space/properties/owner
 */
@Serializable(with = InlineCopilotSpaceOwnerX5cb2e116.Serializer::class)
public class InlineCopilotSpaceOwnerX5cb2e116 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCopilotSpaceOwnerX5cb2e116Inspection,
) {
  public val simpleUser: SimpleUserView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSimpleUser) json.decodeFromJsonElement<SimpleUserView>(raw) else null }

  public val organizationSimple: OrganizationSimpleView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesOrganizationSimple) json.decodeFromJsonElement<OrganizationSimpleView>(raw) else null }

  public val matchedBranches: Set<InlineCopilotSpaceOwnerX5cb2e116Branch>
    get() = buildSet {
      if (inspection.matchesSimpleUser) add(InlineCopilotSpaceOwnerX5cb2e116Branch.SimpleUser)
      if (inspection.matchesOrganizationSimple) add(InlineCopilotSpaceOwnerX5cb2e116Branch.OrganizationSimple)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCopilotSpaceOwnerX5cb2e116 {
      val inspection = inspectInlineCopilotSpaceOwnerX5cb2e116(raw)
      if (inspection.matchCount == 0) {
        throw InlineCopilotSpaceOwnerX5cb2e116NoMatchException("InlineCopilotSpaceOwnerX5cb2e116 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCopilotSpaceOwnerX5cb2e116(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCopilotSpaceOwnerX5cb2e116> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCopilotSpaceOwnerX5cb2e116 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCopilotSpaceOwnerX5cb2e116")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCopilotSpaceOwnerX5cb2e116) {
      encoder.requireJsonEncoder("InlineCopilotSpaceOwnerX5cb2e116").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCopilotSpaceOwnerX5cb2e116(element: JsonElement): InlineCopilotSpaceOwnerX5cb2e116Inspection {
  val raw = element as? JsonObject ?: return InlineCopilotSpaceOwnerX5cb2e116Inspection(
    matchesSimpleUser = false,
    matchesOrganizationSimple = false,
    failures = listOf("SimpleUser: expected JSON object", "OrganizationSimple: expected JSON object"),
  )
  val matchesSimpleUser = raw["avatar_url"].isString() && raw["events_url"].isString() && raw["followers_url"].isString() && raw["following_url"].isString() && raw["gists_url"].isString() && raw["gravatar_id"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["login"].isString() && raw["node_id"].isString() && raw["organizations_url"].isString() && raw["received_events_url"].isString() && raw["repos_url"].isString() && raw["site_admin"] != null && raw["starred_url"].isString() && raw["subscriptions_url"].isString() && raw["type"].isString() && raw["url"].isString()
  val matchesOrganizationSimple = raw["avatar_url"].isString() && raw["description"].isString() && raw["events_url"].isString() && raw["hooks_url"].isString() && raw["id"] != null && raw["issues_url"].isString() && raw["login"].isString() && raw["members_url"].isString() && raw["node_id"].isString() && raw["public_members_url"].isString() && raw["repos_url"].isString() && raw["url"].isString()
  return InlineCopilotSpaceOwnerX5cb2e116Inspection(
    matchesSimpleUser = matchesSimpleUser,
    matchesOrganizationSimple = matchesOrganizationSimple,
    failures = buildList {
      if (!matchesSimpleUser) add("SimpleUser: required properties 'avatar_url', 'events_url', 'followers_url', 'following_url', 'gists_url', 'gravatar_id', 'html_url', 'id', 'login', 'node_id', 'organizations_url', 'received_events_url', 'repos_url', 'site_admin', 'starred_url', 'subscriptions_url', 'type', 'url' do not match their declared types")
      if (!matchesOrganizationSimple) add("OrganizationSimple: required properties 'avatar_url', 'description', 'events_url', 'hooks_url', 'id', 'issues_url', 'login', 'members_url', 'node_id', 'public_members_url', 'repos_url', 'url' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
