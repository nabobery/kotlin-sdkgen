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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-approved.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-approved
 */
@Serializable(with = WebhookPersonalAccessTokenRequestApproved.Serializer::class)
public class WebhookPersonalAccessTokenRequestApproved(
  public val action: InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c,
  public val installation: SimpleInstallation,
  public val organization: OrganizationSimpleWebhooks,
  public val personalAccessTokenRequest: PersonalAccessTokenRequest,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c? = null

    public var action: InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var installationValue: SimpleInstallation? = null

    public var installation: SimpleInstallation
      get() = requireNotNull(installationValue) { "installation is required" }
      set(`value`) {
        installationValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var personalAccessTokenRequestValue: PersonalAccessTokenRequest? = null

    public var personalAccessTokenRequest: PersonalAccessTokenRequest
      get() = requireNotNull(personalAccessTokenRequestValue) { "personalAccessTokenRequest is required" }
      set(`value`) {
        personalAccessTokenRequestValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public fun build(): WebhookPersonalAccessTokenRequestApproved {
      check(actionValue != null) { "action is required" }
      check(installationValue != null) { "installation is required" }
      check(organizationValue != null) { "organization is required" }
      check(personalAccessTokenRequestValue != null) { "personalAccessTokenRequest is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPersonalAccessTokenRequestApproved(
        action = action,
        installation = installation,
        organization = organization,
        personalAccessTokenRequest = personalAccessTokenRequest,
        sender = sender,
        enterprise = enterprise,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPersonalAccessTokenRequestApproved = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPersonalAccessTokenRequestApproved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPersonalAccessTokenRequestApproved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPersonalAccessTokenRequestApproved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPersonalAccessTokenRequestApproved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPersonalAccessTokenRequestApprovedActionX180e816c>(rawObject, "action")
      val installation = json.decodeRequired<SimpleInstallation>(rawObject, "installation")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val personalAccessTokenRequest = json.decodeRequired<PersonalAccessTokenRequest>(rawObject, "personal_access_token_request")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPersonalAccessTokenRequestApproved(
        action = action,
        installation = installation,
        organization = organization,
        personalAccessTokenRequest = personalAccessTokenRequest,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPersonalAccessTokenRequestApproved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPersonalAccessTokenRequestApproved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("installation", json.encodeToJsonElement(value.installation))
        put("organization", json.encodeToJsonElement(value.organization))
        put("personal_access_token_request", json.encodeToJsonElement(value.personalAccessTokenRequest))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPersonalAccessTokenRequestApproved(block: WebhookPersonalAccessTokenRequestApproved.Builder.() -> Unit): WebhookPersonalAccessTokenRequestApproved = WebhookPersonalAccessTokenRequestApproved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPersonalAccessTokenRequestApproved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
