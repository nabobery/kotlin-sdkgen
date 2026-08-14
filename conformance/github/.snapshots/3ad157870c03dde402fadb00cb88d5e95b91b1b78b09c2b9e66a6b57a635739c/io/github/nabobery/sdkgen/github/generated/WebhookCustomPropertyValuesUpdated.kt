package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-values-updated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-custom-property-values-updated
 */
@Serializable(with = WebhookCustomPropertyValuesUpdated.Serializer::class)
public class WebhookCustomPropertyValuesUpdated(
  public val action: InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828,
  newPropertyValues: List<CustomPropertyValue>,
  oldPropertyValues: List<CustomPropertyValue>,
  public val organization: OrganizationSimpleWebhooks,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val sender: SimpleUser? = null,
) {
  /**
   * The new custom property values for the repository.
   */
  public val newPropertyValues: List<CustomPropertyValue> = newPropertyValues.toList()

  /**
   * The old custom property values for the repository.
   */
  public val oldPropertyValues: List<CustomPropertyValue> = oldPropertyValues.toList()

  public class Builder {
    private var actionValue: InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828? = null

    public var action: InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var newPropertyValuesValue: List<CustomPropertyValue>? = null

    public var newPropertyValues: List<CustomPropertyValue>
      get() = requireNotNull(newPropertyValuesValue) { "newPropertyValues is required" }.toList()
      set(`value`) {
        newPropertyValuesValue = value.toList()
      }

    private var oldPropertyValuesValue: List<CustomPropertyValue>? = null

    public var oldPropertyValues: List<CustomPropertyValue>
      get() = requireNotNull(oldPropertyValuesValue) { "oldPropertyValues is required" }.toList()
      set(`value`) {
        oldPropertyValuesValue = value.toList()
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookCustomPropertyValuesUpdated {
      check(actionValue != null) { "action is required" }
      check(newPropertyValuesValue != null) { "newPropertyValues is required" }
      check(oldPropertyValuesValue != null) { "oldPropertyValues is required" }
      check(organizationValue != null) { "organization is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookCustomPropertyValuesUpdated(
        action = action,
        newPropertyValues = newPropertyValues,
        oldPropertyValues = oldPropertyValues,
        organization = organization,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCustomPropertyValuesUpdated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCustomPropertyValuesUpdated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCustomPropertyValuesUpdated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCustomPropertyValuesUpdated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCustomPropertyValuesUpdated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCustomPropertyValuesUpdatedActionXef9b1828>(rawObject, "action")
      val newPropertyValues = json.decodeRequired<List<CustomPropertyValue>>(rawObject, "new_property_values")
      val oldPropertyValues = json.decodeRequired<List<CustomPropertyValue>>(rawObject, "old_property_values")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookCustomPropertyValuesUpdated(
        action = action,
        newPropertyValues = newPropertyValues,
        oldPropertyValues = oldPropertyValues,
        organization = organization,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCustomPropertyValuesUpdated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCustomPropertyValuesUpdated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("new_property_values", json.encodeToJsonElement(value.newPropertyValues))
        put("old_property_values", json.encodeToJsonElement(value.oldPropertyValues))
        put("organization", json.encodeToJsonElement(value.organization))
        put("repository", json.encodeToJsonElement(value.repository))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCustomPropertyValuesUpdated(block: WebhookCustomPropertyValuesUpdated.Builder.() -> Unit): WebhookCustomPropertyValuesUpdated = WebhookCustomPropertyValuesUpdated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCustomPropertyValuesUpdated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
