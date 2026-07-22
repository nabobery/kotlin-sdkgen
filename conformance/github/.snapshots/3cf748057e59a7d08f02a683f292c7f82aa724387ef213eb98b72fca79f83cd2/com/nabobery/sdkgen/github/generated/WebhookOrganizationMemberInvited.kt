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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited
 */
@Serializable(with = WebhookOrganizationMemberInvited.Serializer::class)
public class WebhookOrganizationMemberInvited(
  public val action: InlineWebhookOrganizationMemberInvitedActionX082e7d5d,
  /**
   * The invitation for the user or email if the action is `member_invited`.
   */
  public val invitation: InlineWebhookOrganizationMemberInvitedInvitationX049e554f,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val repository: RepositoryWebhooks? = null,
  public val user: WebhooksUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookOrganizationMemberInvitedActionX082e7d5d? = null

    public var action: InlineWebhookOrganizationMemberInvitedActionX082e7d5d
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var invitationValue: InlineWebhookOrganizationMemberInvitedInvitationX049e554f? = null

    public var invitation: InlineWebhookOrganizationMemberInvitedInvitationX049e554f
      get() = requireNotNull(invitationValue) { "invitation is required" }
      set(`value`) {
        invitationValue = value
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var repository: RepositoryWebhooks? = null

    public var user: WebhooksUser? = null

    public fun build(): WebhookOrganizationMemberInvited {
      check(actionValue != null) { "action is required" }
      check(invitationValue != null) { "invitation is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookOrganizationMemberInvited(
        action = action,
        invitation = invitation,
        organization = organization,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        repository = repository,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookOrganizationMemberInvited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookOrganizationMemberInvited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookOrganizationMemberInvited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookOrganizationMemberInvited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookOrganizationMemberInvited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookOrganizationMemberInvitedActionX082e7d5d>(rawObject, "action")
      val invitation = json.decodeRequired<InlineWebhookOrganizationMemberInvitedInvitationX049e554f>(rawObject, "invitation")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookOrganizationMemberInvited(
        action = action,
        invitation = invitation,
        organization = organization,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookOrganizationMemberInvited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookOrganizationMemberInvited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("invitation", json.encodeToJsonElement(value.invitation))
        put("organization", json.encodeToJsonElement(value.organization))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookOrganizationMemberInvited(block: WebhookOrganizationMemberInvited.Builder.() -> Unit): WebhookOrganizationMemberInvited = WebhookOrganizationMemberInvited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookOrganizationMemberInvited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
