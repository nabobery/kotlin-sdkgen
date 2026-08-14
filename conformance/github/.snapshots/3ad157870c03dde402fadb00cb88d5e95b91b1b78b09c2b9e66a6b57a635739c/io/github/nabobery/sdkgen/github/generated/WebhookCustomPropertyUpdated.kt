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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-updated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-updated
 */
@Serializable(with = WebhookCustomPropertyUpdated.Serializer::class)
public class WebhookCustomPropertyUpdated(
  public val action: InlineWebhookCustomPropertyUpdatedActionXde166874,
  public val definition: CustomProperty,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCustomPropertyUpdatedActionXde166874? = null

    public var action: InlineWebhookCustomPropertyUpdatedActionXde166874
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

    public fun build(): WebhookCustomPropertyUpdated {
      check(actionValue != null) { "action is required" }
      check(definitionValue != null) { "definition is required" }
      return WebhookCustomPropertyUpdated(
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
    public fun build(block: Builder.() -> Unit): WebhookCustomPropertyUpdated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCustomPropertyUpdated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCustomPropertyUpdated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCustomPropertyUpdated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCustomPropertyUpdated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCustomPropertyUpdatedActionXde166874>(rawObject, "action")
      val definition = json.decodeRequired<CustomProperty>(rawObject, "definition")
      return WebhookCustomPropertyUpdated(
        action = action,
        definition = definition,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCustomPropertyUpdated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCustomPropertyUpdated")
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

public fun webhookCustomPropertyUpdated(block: WebhookCustomPropertyUpdated.Builder.() -> Unit): WebhookCustomPropertyUpdated = WebhookCustomPropertyUpdated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCustomPropertyUpdated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
