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

public enum class InlineIntegrationInstallationRequestAccountX9999199bBranch {
  SimpleUser,
  Enterprise,
}

public sealed class InlineIntegrationInstallationRequestAccountX9999199bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIntegrationInstallationRequestAccountX9999199bNoMatchException(
  message: String,
) : InlineIntegrationInstallationRequestAccountX9999199bDecodingException(message)

internal data class InlineIntegrationInstallationRequestAccountX9999199bInspection(
  public val matchesSimpleUser: Boolean,
  public val matchesEnterprise: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSimpleUser, matchesEnterprise).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/integration-installation-request/properties/account.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/integration-installation-request/properties/account
 */
@Serializable(with = InlineIntegrationInstallationRequestAccountX9999199b.Serializer::class)
public class InlineIntegrationInstallationRequestAccountX9999199b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIntegrationInstallationRequestAccountX9999199bInspection,
) {
  public val simpleUser: SimpleUserView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSimpleUser) json.decodeFromJsonElement<SimpleUserView>(raw) else null }

  public val enterprise: EnterpriseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesEnterprise) json.decodeFromJsonElement<EnterpriseView>(raw) else null }

  public val matchedBranches: Set<InlineIntegrationInstallationRequestAccountX9999199bBranch>
    get() = buildSet {
      if (inspection.matchesSimpleUser) add(InlineIntegrationInstallationRequestAccountX9999199bBranch.SimpleUser)
      if (inspection.matchesEnterprise) add(InlineIntegrationInstallationRequestAccountX9999199bBranch.Enterprise)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIntegrationInstallationRequestAccountX9999199b {
      val inspection = inspectInlineIntegrationInstallationRequestAccountX9999199b(raw)
      if (inspection.matchCount == 0) {
        throw InlineIntegrationInstallationRequestAccountX9999199bNoMatchException("InlineIntegrationInstallationRequestAccountX9999199b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIntegrationInstallationRequestAccountX9999199b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIntegrationInstallationRequestAccountX9999199b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIntegrationInstallationRequestAccountX9999199b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIntegrationInstallationRequestAccountX9999199b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIntegrationInstallationRequestAccountX9999199b) {
      encoder.requireJsonEncoder("InlineIntegrationInstallationRequestAccountX9999199b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIntegrationInstallationRequestAccountX9999199b(element: JsonElement): InlineIntegrationInstallationRequestAccountX9999199bInspection {
  val raw = element as? JsonObject ?: return InlineIntegrationInstallationRequestAccountX9999199bInspection(
    matchesSimpleUser = false,
    matchesEnterprise = false,
    failures = listOf("SimpleUser: expected JSON object", "Enterprise: expected JSON object"),
  )
  val matchesSimpleUser = raw["avatar_url"].isString() && raw["events_url"].isString() && raw["followers_url"].isString() && raw["following_url"].isString() && raw["gists_url"].isString() && raw["gravatar_id"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["login"].isString() && raw["node_id"].isString() && raw["organizations_url"].isString() && raw["received_events_url"].isString() && raw["repos_url"].isString() && raw["site_admin"] != null && raw["starred_url"].isString() && raw["subscriptions_url"].isString() && raw["type"].isString() && raw["url"].isString()
  val matchesEnterprise = raw["avatar_url"].isString() && raw["created_at"].isString() && raw["html_url"].isString() && raw["id"] != null && raw["name"].isString() && raw["node_id"].isString() && raw["slug"].isString() && raw["updated_at"].isString()
  return InlineIntegrationInstallationRequestAccountX9999199bInspection(
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
