package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-removed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-removed
 */
@Serializable(with = WebhookOrganizationMemberRemoved.Serializer::class)
public class WebhookOrganizationMemberRemoved(
  public val action: InlineWebhookOrganizationMemberRemovedActionX76941923,
  public val membership: WebhooksMembership,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookOrganizationMemberRemovedActionX76941923? = null

    public var action: InlineWebhookOrganizationMemberRemovedActionX76941923
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var membershipValue: WebhooksMembership? = null

    public var membership: WebhooksMembership
      get() = requireNotNull(membershipValue) { "membership is required" }
      set(`value`) {
        membershipValue = value
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

    public fun build(): WebhookOrganizationMemberRemoved {
      check(actionValue != null) { "action is required" }
      check(membershipValue != null) { "membership is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookOrganizationMemberRemoved(
        action = action,
        membership = membership,
        organization = organization,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookOrganizationMemberRemoved = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookOrganizationMemberRemoved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookOrganizationMemberRemoved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookOrganizationMemberRemoved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookOrganizationMemberRemoved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookOrganizationMemberRemovedActionX76941923>(rawObject, "action")
      val membership = json.decodeRequired<WebhooksMembership>(rawObject, "membership")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookOrganizationMemberRemoved(
        action = action,
        membership = membership,
        organization = organization,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookOrganizationMemberRemoved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookOrganizationMemberRemoved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("membership", json.encodeToJsonElement(value.membership))
        put("organization", json.encodeToJsonElement(value.organization))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookOrganizationMemberRemoved(block: WebhookOrganizationMemberRemoved.Builder.() -> Unit): WebhookOrganizationMemberRemoved = WebhookOrganizationMemberRemoved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookOrganizationMemberRemoved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
