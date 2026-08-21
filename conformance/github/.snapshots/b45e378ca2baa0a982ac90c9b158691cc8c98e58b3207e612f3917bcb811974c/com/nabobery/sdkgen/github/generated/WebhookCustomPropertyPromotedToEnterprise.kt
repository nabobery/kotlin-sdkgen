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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-promoted-to-enterprise.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-promoted-to-enterprise
 */
@Serializable(with = WebhookCustomPropertyPromotedToEnterprise.Serializer::class)
public class WebhookCustomPropertyPromotedToEnterprise(
  public val action: InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2,
  public val definition: CustomProperty,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2? = null

    public var action: InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var definitionValue: CustomProperty? = null

    public var definition: CustomProperty
      get() = requireNotNull(definitionValue) { "definition is required" }
      set(`value`) {
        definitionValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookCustomPropertyPromotedToEnterprise {
      check(actionValue != null) { "action is required" }
      check(definitionValue != null) { "definition is required" }
      return WebhookCustomPropertyPromotedToEnterprise(
        action = action,
        definition = definition,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCustomPropertyPromotedToEnterprise = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCustomPropertyPromotedToEnterprise> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCustomPropertyPromotedToEnterprise {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCustomPropertyPromotedToEnterprise")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCustomPropertyPromotedToEnterprise must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCustomPropertyPromotedToEnterpriseActionXc3c3b4d2>(rawObject, "action")
      val definition = json.decodeRequired<CustomProperty>(rawObject, "definition")
      return WebhookCustomPropertyPromotedToEnterprise(
        action = action,
        definition = definition,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCustomPropertyPromotedToEnterprise) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCustomPropertyPromotedToEnterprise")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("definition", json.encodeToJsonElement(value.definition))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCustomPropertyPromotedToEnterprise(block: WebhookCustomPropertyPromotedToEnterprise.Builder.() -> Unit): WebhookCustomPropertyPromotedToEnterprise = WebhookCustomPropertyPromotedToEnterprise.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCustomPropertyPromotedToEnterprise is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
