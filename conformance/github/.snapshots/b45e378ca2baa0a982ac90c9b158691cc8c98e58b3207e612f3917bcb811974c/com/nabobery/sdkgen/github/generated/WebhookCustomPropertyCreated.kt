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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-created
 */
@Serializable(with = WebhookCustomPropertyCreated.Serializer::class)
public class WebhookCustomPropertyCreated(
  public val action: InlineWebhookCustomPropertyCreatedActionX924d1b96,
  public val definition: CustomProperty,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCustomPropertyCreatedActionX924d1b96? = null

    public var action: InlineWebhookCustomPropertyCreatedActionX924d1b96
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

    public fun build(): WebhookCustomPropertyCreated {
      check(actionValue != null) { "action is required" }
      check(definitionValue != null) { "definition is required" }
      return WebhookCustomPropertyCreated(
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
    public fun build(block: Builder.() -> Unit): WebhookCustomPropertyCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCustomPropertyCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCustomPropertyCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCustomPropertyCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCustomPropertyCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCustomPropertyCreatedActionX924d1b96>(rawObject, "action")
      val definition = json.decodeRequired<CustomProperty>(rawObject, "definition")
      return WebhookCustomPropertyCreated(
        action = action,
        definition = definition,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCustomPropertyCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCustomPropertyCreated")
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

public fun webhookCustomPropertyCreated(block: WebhookCustomPropertyCreated.Builder.() -> Unit): WebhookCustomPropertyCreated = WebhookCustomPropertyCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCustomPropertyCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
