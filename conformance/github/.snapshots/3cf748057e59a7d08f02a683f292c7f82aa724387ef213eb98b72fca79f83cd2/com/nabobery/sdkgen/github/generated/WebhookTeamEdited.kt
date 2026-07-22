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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited
 */
@Serializable(with = WebhookTeamEdited.Serializer::class)
public class WebhookTeamEdited(
  public val action: InlineWebhookTeamEditedActionXb8760449,
  /**
   * The changes to the team if the action was `edited`.
   */
  public val changes: InlineWebhookTeamEditedChangesXf9198eb0,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
  public val team: WebhooksTeam1,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  /**
   * A git repository
   */
  public val repository: InlineWebhookTeamEditedRepositoryX5cdb77da? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookTeamEditedActionXb8760449? = null

    public var action: InlineWebhookTeamEditedActionXb8760449
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookTeamEditedChangesXf9198eb0? = null

    public var changes: InlineWebhookTeamEditedChangesXf9198eb0
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
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
    public var repository: InlineWebhookTeamEditedRepositoryX5cdb77da? = null

    public fun build(): WebhookTeamEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      check(teamValue != null) { "team is required" }
      return WebhookTeamEdited(
        action = action,
        changes = changes,
        organization = organization,
        sender = sender,
        team = team,
        enterprise = enterprise,
        installation = installation,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookTeamEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookTeamEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookTeamEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookTeamEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookTeamEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookTeamEditedActionXb8760449>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookTeamEditedChangesXf9198eb0>(rawObject, "changes")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val team = json.decodeRequired<WebhooksTeam1>(rawObject, "team")
      return WebhookTeamEdited(
        action = action,
        changes = changes,
        organization = organization,
        sender = sender,
        team = team,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<InlineWebhookTeamEditedRepositoryX5cdb77da>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookTeamEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookTeamEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("organization", json.encodeToJsonElement(value.organization))
        put("sender", json.encodeToJsonElement(value.sender))
        put("team", json.encodeToJsonElement(value.team))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookTeamEdited(block: WebhookTeamEdited.Builder.() -> Unit): WebhookTeamEdited = WebhookTeamEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookTeamEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
