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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased
 */
@Serializable(with = WebhookReleasePrereleased.Serializer::class)
public class WebhookReleasePrereleased(
  public val action: InlineWebhookReleasePrereleasedActionXae82b327,
  /**
   * The [release](https://docs.github.com/rest/releases/releases/#get-a-release) object.
   */
  public val release: InlineWebhookReleasePrereleasedReleaseXf745846e,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookReleasePrereleasedActionXae82b327? = null

    public var action: InlineWebhookReleasePrereleasedActionXae82b327
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var releaseValue: InlineWebhookReleasePrereleasedReleaseXf745846e? = null

    public var release: InlineWebhookReleasePrereleasedReleaseXf745846e
      get() = requireNotNull(releaseValue) { "release is required" }
      set(`value`) {
        releaseValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookReleasePrereleased {
      check(actionValue != null) { "action is required" }
      check(releaseValue != null) { "release is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookReleasePrereleased(
        action = action,
        release = release,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookReleasePrereleased = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookReleasePrereleased> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookReleasePrereleased {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookReleasePrereleased")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookReleasePrereleased must be a JSON object")
      val action = json.decodeRequired<InlineWebhookReleasePrereleasedActionXae82b327>(rawObject, "action")
      val release = json.decodeRequired<InlineWebhookReleasePrereleasedReleaseXf745846e>(rawObject, "release")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookReleasePrereleased(
        action = action,
        release = release,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookReleasePrereleased) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookReleasePrereleased")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("release", json.encodeToJsonElement(value.release))
        put("repository", json.encodeToJsonElement(value.repository))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookReleasePrereleased(block: WebhookReleasePrereleased.Builder.() -> Unit): WebhookReleasePrereleased = WebhookReleasePrereleased.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookReleasePrereleased is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
