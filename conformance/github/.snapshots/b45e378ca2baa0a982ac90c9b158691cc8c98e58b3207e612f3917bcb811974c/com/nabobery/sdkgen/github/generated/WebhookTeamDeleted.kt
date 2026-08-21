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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted
 */
@Serializable(with = WebhookTeamDeleted.Serializer::class)
public class WebhookTeamDeleted(
  public val action: InlineWebhookTeamDeletedActionXc9d12554,
  public val organization: OrganizationSimpleWebhooks,
  public val team: WebhooksTeam1,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  /**
   * A git repository
   */
  public val repository: InlineWebhookTeamDeletedRepositoryXf1446d6e? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookTeamDeletedActionXc9d12554? = null

    public var action: InlineWebhookTeamDeletedActionXc9d12554
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
    public var repository: InlineWebhookTeamDeletedRepositoryXf1446d6e? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookTeamDeleted {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(teamValue != null) { "team is required" }
      return WebhookTeamDeleted(
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
    public fun build(block: Builder.() -> Unit): WebhookTeamDeleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookTeamDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookTeamDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookTeamDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookTeamDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookTeamDeletedActionXc9d12554>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val team = json.decodeRequired<WebhooksTeam1>(rawObject, "team")
      return WebhookTeamDeleted(
        action = action,
        organization = organization,
        team = team,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineWebhookTeamDeletedRepositoryXf1446d6e>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookTeamDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookTeamDeleted")
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

public fun webhookTeamDeleted(block: WebhookTeamDeleted.Builder.() -> Unit): WebhookTeamDeleted = WebhookTeamDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookTeamDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
