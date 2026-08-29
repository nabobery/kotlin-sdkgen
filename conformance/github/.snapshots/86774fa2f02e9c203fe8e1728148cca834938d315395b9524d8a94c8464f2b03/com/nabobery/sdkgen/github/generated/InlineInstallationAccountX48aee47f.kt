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

public enum class InlineInstallationAccountX48aee47fBranch {
  SimpleUser,
  Enterprise,
}

public sealed class InlineInstallationAccountX48aee47fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInstallationAccountX48aee47fNoMatchException(
  message: String,
) : InlineInstallationAccountX48aee47fDecodingException(message)

internal data class InlineInstallationAccountX48aee47fInspection(
  public val matchesSimpleUser: Boolean,
  public val matchesEnterprise: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSimpleUser, matchesEnterprise).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/installation/properties/account.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/installation/properties/account
 */
@Serializable(with = InlineInstallationAccountX48aee47f.Serializer::class)
public class InlineInstallationAccountX48aee47f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInstallationAccountX48aee47fInspection,
) {
  public val simpleUser: SimpleUserView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSimpleUser) json.decodeFromJsonElement<SimpleUserView>(raw) else null }

  public val enterprise: EnterpriseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesEnterprise) json.decodeFromJsonElement<EnterpriseView>(raw) else null }

  public val matchedBranches: Set<InlineInstallationAccountX48aee47fBranch>
    get() = buildSet {
      if (inspection.matchesSimpleUser) add(InlineInstallationAccountX48aee47fBranch.SimpleUser)
      if (inspection.matchesEnterprise) add(InlineInstallationAccountX48aee47fBranch.Enterprise)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInstallationAccountX48aee47f {
      val inspection = inspectInlineInstallationAccountX48aee47f(raw)
      if (inspection.matchCount == 0) {
        throw InlineInstallationAccountX48aee47fNoMatchException("InlineInstallationAccountX48aee47f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInstallationAccountX48aee47f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInstallationAccountX48aee47f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInstallationAccountX48aee47f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInstallationAccountX48aee47f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInstallationAccountX48aee47f) {
      encoder.requireJsonEncoder("InlineInstallationAccountX48aee47f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInstallationAccountX48aee47f(element: JsonElement): InlineInstallationAccountX48aee47fInspection {
  val raw = element as? JsonObject ?: return InlineInstallationAccountX48aee47fInspection(
    matchesSimpleUser = false,
    matchesEnterprise = false,
    failures = listOf("SimpleUser: expected JSON object", "Enterprise: expected JSON object"),
  )
  val matchesSimpleUser = raw["avatar_url"].isString() && raw["events_url"].isString() && raw["followers_url"].isString() && raw["following_url"].isString() && raw["gists_url"].isString() && raw["gravatar_id"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["login"].isString() && raw["node_id"].isString() && raw["organizations_url"].isString() && raw["received_events_url"].isString() && raw["repos_url"].isString() && raw["site_admin"] != null && raw["starred_url"].isString() && raw["subscriptions_url"].isString() && raw["type"].isString() && raw["url"].isString()
  val matchesEnterprise = raw["avatar_url"].isString() && raw["created_at"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["name"].isString() && raw["node_id"].isString() && raw["slug"].isString() && raw["updated_at"].isString()
  return InlineInstallationAccountX48aee47fInspection(
    matchesSimpleUser = matchesSimpleUser,
    matchesEnterprise = matchesEnterprise,
    failures = buildList {
      if (!matchesSimpleUser) add("SimpleUser: required properties 'avatar_url', 'events_url', 'followers_url', 'following_url', 'gists_url', 'gravatar_id', 'html_url', 'id', 'login', 'node_id', 'organizations_url', 'received_events_url', 'repos_url', 'site_admin', 'starred_url', 'subscriptions_url', 'type', 'url' do not match their declared types")
      if (!matchesEnterprise) add("Enterprise: required properties 'avatar_url', 'created_at', 'html_url', 'id', 'name', 'node_id', 'slug', 'updated_at' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
