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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-added.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-added
 */
@Serializable(with = WebhookOrganizationMemberAdded.Serializer::class)
public class WebhookOrganizationMemberAdded(
  public val action: InlineWebhookOrganizationMemberAddedActionX515a55af,
  public val membership: WebhooksMembership,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookOrganizationMemberAddedActionX515a55af? = null

    public var action: InlineWebhookOrganizationMemberAddedActionX515a55af
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

    public fun build(): WebhookOrganizationMemberAdded {
      check(actionValue != null) { "action is required" }
      check(membershipValue != null) { "membership is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookOrganizationMemberAdded(
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
    public fun build(block: Builder.() -> Unit): WebhookOrganizationMemberAdded = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookOrganizationMemberAdded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookOrganizationMemberAdded {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookOrganizationMemberAdded")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookOrganizationMemberAdded must be a JSON object")
      val action = json.decodeRequired<InlineWebhookOrganizationMemberAddedActionX515a55af>(rawObject, "action")
      val membership = json.decodeRequired<WebhooksMembership>(rawObject, "membership")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookOrganizationMemberAdded(
        action = action,
        membership = membership,
        organization = organization,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookOrganizationMemberAdded) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookOrganizationMemberAdded")
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

public fun webhookOrganizationMemberAdded(block: WebhookOrganizationMemberAdded.Builder.() -> Unit): WebhookOrganizationMemberAdded = WebhookOrganizationMemberAdded.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookOrganizationMemberAdded is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
