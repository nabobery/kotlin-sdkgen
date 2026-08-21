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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-advisory-withdrawn
 */
@Serializable(with = WebhookSecurityAdvisoryWithdrawn.Serializer::class)
public class WebhookSecurityAdvisoryWithdrawn(
  public val action: InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7,
  /**
   * The details of the security advisory, including summary, description, and severity.
   */
  public val securityAdvisory: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7? = null

    public var action: InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var securityAdvisoryValue:
        InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13? = null

    public var securityAdvisory: InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13
      get() = requireNotNull(securityAdvisoryValue) { "securityAdvisory is required" }
      set(`value`) {
        securityAdvisoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookSecurityAdvisoryWithdrawn {
      check(actionValue != null) { "action is required" }
      check(securityAdvisoryValue != null) { "securityAdvisory is required" }
      return WebhookSecurityAdvisoryWithdrawn(
        action = action,
        securityAdvisory = securityAdvisory,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecurityAdvisoryWithdrawn = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecurityAdvisoryWithdrawn> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecurityAdvisoryWithdrawn {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecurityAdvisoryWithdrawn")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecurityAdvisoryWithdrawn must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSecurityAdvisoryWithdrawnActionX938043a7>(rawObject, "action")
      val securityAdvisory = json.decodeRequired<InlineWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryX74b7ca13>(rawObject, "security_advisory")
      return WebhookSecurityAdvisoryWithdrawn(
        action = action,
        securityAdvisory = securityAdvisory,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecurityAdvisoryWithdrawn) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecurityAdvisoryWithdrawn")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("security_advisory", json.encodeToJsonElement(value.securityAdvisory))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecurityAdvisoryWithdrawn(block: WebhookSecurityAdvisoryWithdrawn.Builder.() -> Unit): WebhookSecurityAdvisoryWithdrawn = WebhookSecurityAdvisoryWithdrawn.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecurityAdvisoryWithdrawn is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
