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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-created
 */
@Serializable(with = WebhookPersonalAccessTokenRequestCreated.Serializer::class)
public class WebhookPersonalAccessTokenRequestCreated(
  public val action: InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e,
  public val organization: OrganizationSimpleWebhooks,
  public val personalAccessTokenRequest: PersonalAccessTokenRequest,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e? = null

    public var action: InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e
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

    public var installation: SimpleInstallation? = null

    public fun build(): WebhookPersonalAccessTokenRequestCreated {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(personalAccessTokenRequestValue != null) { "personalAccessTokenRequest is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPersonalAccessTokenRequestCreated(
        action = action,
        organization = organization,
        personalAccessTokenRequest = personalAccessTokenRequest,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPersonalAccessTokenRequestCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPersonalAccessTokenRequestCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPersonalAccessTokenRequestCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPersonalAccessTokenRequestCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPersonalAccessTokenRequestCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPersonalAccessTokenRequestCreatedActionXf151e32e>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val personalAccessTokenRequest = json.decodeRequired<PersonalAccessTokenRequest>(rawObject, "personal_access_token_request")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPersonalAccessTokenRequestCreated(
        action = action,
        organization = organization,
        personalAccessTokenRequest = personalAccessTokenRequest,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPersonalAccessTokenRequestCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPersonalAccessTokenRequestCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("personal_access_token_request", json.encodeToJsonElement(value.personalAccessTokenRequest))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPersonalAccessTokenRequestCreated(block: WebhookPersonalAccessTokenRequestCreated.Builder.() -> Unit): WebhookPersonalAccessTokenRequestCreated = WebhookPersonalAccessTokenRequestCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPersonalAccessTokenRequestCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
