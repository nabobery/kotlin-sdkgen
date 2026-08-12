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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-add.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-add
 */
@Serializable(with = WebhookTeamAdd.Serializer::class)
public class WebhookTeamAdd(
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val team: WebhooksTeam1,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
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

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookTeamAdd {
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(teamValue != null) { "team is required" }
      return WebhookTeamAdd(
        repository = repository,
        sender = sender,
        team = team,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookTeamAdd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookTeamAdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookTeamAdd {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookTeamAdd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookTeamAdd must be a JSON object")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val team = json.decodeRequired<WebhooksTeam1>(rawObject, "team")
      return WebhookTeamAdd(
        repository = repository,
        sender = sender,
        team = team,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookTeamAdd) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookTeamAdd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        put("team", json.encodeToJsonElement(value.team))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookTeamAdd(block: WebhookTeamAdd.Builder.() -> Unit): WebhookTeamAdd = WebhookTeamAdd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookTeamAdd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
