package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-added-to-repository
 */
@Serializable(with = WebhookTeamAddedToRepository.Serializer::class)
public class WebhookTeamAddedToRepository(
  public val action: InlineWebhookTeamAddedToRepositoryActionX4309a3ed,
  public val organization: OrganizationSimpleWebhooks,
  public val team: WebhooksTeam1,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  /**
   * A git repository
   */
  public val repository: InlineWebhookTeamAddedToRepositoryRepositoryX09d4a5f9? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookTeamAddedToRepositoryActionX4309a3ed? = null

    public var action: InlineWebhookTeamAddedToRepositoryActionX4309a3ed
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var teamValue: WebhooksTeam1? = null

    public var team: WebhooksTeam1
      get() = requireNotNull(teamValue) { "team is required" }
      set(`value`) {
        teamValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    /**
     * A git repository
     */
    public var repository: InlineWebhookTeamAddedToRepositoryRepositoryX09d4a5f9? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookTeamAddedToRepository {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(teamValue != null) { "team is required" }
      return WebhookTeamAddedToRepository(
        action = action,
        organization = organization,
        team = team,
        enterprise = enterprise,
        installation = installation,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookTeamAddedToRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookTeamAddedToRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookTeamAddedToRepository {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookTeamAddedToRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookTeamAddedToRepository must be a JSON object")
      val action = json.decodeRequired<InlineWebhookTeamAddedToRepositoryActionX4309a3ed>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val team = json.decodeRequired<WebhooksTeam1>(rawObject, "team")
      return WebhookTeamAddedToRepository(
        action = action,
        organization = organization,
        team = team,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineWebhookTeamAddedToRepositoryRepositoryX09d4a5f9>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookTeamAddedToRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookTeamAddedToRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("team", json.encodeToJsonElement(value.team))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookTeamAddedToRepository(block: WebhookTeamAddedToRepository.Builder.() -> Unit): WebhookTeamAddedToRepository = WebhookTeamAddedToRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookTeamAddedToRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
