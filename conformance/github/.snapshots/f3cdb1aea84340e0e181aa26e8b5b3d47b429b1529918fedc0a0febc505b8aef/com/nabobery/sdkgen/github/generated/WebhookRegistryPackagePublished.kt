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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published
 */
@Serializable(with = WebhookRegistryPackagePublished.Serializer::class)
public class WebhookRegistryPackagePublished(
  public val action: InlineWebhookRegistryPackagePublishedActionX900d4644,
  public val registryPackage: InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookRegistryPackagePublishedActionX900d4644? = null

    public var action: InlineWebhookRegistryPackagePublishedActionX900d4644
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var registryPackageValue: InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c?
        = null

    public var registryPackage: InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c
      get() = requireNotNull(registryPackageValue) { "registryPackage is required" }
      set(`value`) {
        registryPackageValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookRegistryPackagePublished {
      check(actionValue != null) { "action is required" }
      check(registryPackageValue != null) { "registryPackage is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookRegistryPackagePublished(
        action = action,
        registryPackage = registryPackage,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRegistryPackagePublished = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookRegistryPackagePublished> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRegistryPackagePublished {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRegistryPackagePublished")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRegistryPackagePublished must be a JSON object")
      val action = json.decodeRequired<InlineWebhookRegistryPackagePublishedActionX900d4644>(rawObject, "action")
      val registryPackage = json.decodeRequired<InlineWebhookRegistryPackagePublishedRegistryPackageX32f1587c>(rawObject, "registry_package")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookRegistryPackagePublished(
        action = action,
        registryPackage = registryPackage,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRegistryPackagePublished) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRegistryPackagePublished")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("registry_package", json.encodeToJsonElement(value.registryPackage))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRegistryPackagePublished(block: WebhookRegistryPackagePublished.Builder.() -> Unit): WebhookRegistryPackagePublished = WebhookRegistryPackagePublished.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRegistryPackagePublished is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
