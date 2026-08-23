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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published
 */
@Serializable(with = WebhookPackagePublished.Serializer::class)
public class WebhookPackagePublished(
  public val action: InlineWebhookPackagePublishedActionX5c0b8dc5,
  /**
   * Information about the package.
   */
  public val packageValue: InlineWebhookPackagePublishedPackageValueX97c0427a,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPackagePublishedActionX5c0b8dc5? = null

    public var action: InlineWebhookPackagePublishedActionX5c0b8dc5
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var packageValueValue: InlineWebhookPackagePublishedPackageValueX97c0427a? = null

    public var packageValue: InlineWebhookPackagePublishedPackageValueX97c0427a
      get() = requireNotNull(packageValueValue) { "packageValue is required" }
      set(`value`) {
        packageValueValue = value
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

    public fun build(): WebhookPackagePublished {
      check(actionValue != null) { "action is required" }
      check(packageValueValue != null) { "packageValue is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPackagePublished(
        action = action,
        packageValue = packageValue,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPackagePublished = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPackagePublished> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPackagePublished {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPackagePublished")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPackagePublished must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPackagePublishedActionX5c0b8dc5>(rawObject, "action")
      val packageValue = json.decodeRequired<InlineWebhookPackagePublishedPackageValueX97c0427a>(rawObject, "package")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPackagePublished(
        action = action,
        packageValue = packageValue,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPackagePublished) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPackagePublished")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("package", json.encodeToJsonElement(value.packageValue))
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

public fun webhookPackagePublished(block: WebhookPackagePublished.Builder.() -> Unit): WebhookPackagePublished = WebhookPackagePublished.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPackagePublished is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
