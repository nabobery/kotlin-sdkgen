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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-release-published.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-published
 */
@Serializable(with = WebhookReleasePublished.Serializer::class)
public class WebhookReleasePublished(
  public val action: InlineWebhookReleasePublishedActionX976b530c,
  public val release: WebhooksRelease1,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookReleasePublishedActionX976b530c? = null

    public var action: InlineWebhookReleasePublishedActionX976b530c
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var releaseValue: WebhooksRelease1? = null

    public var release: WebhooksRelease1
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

    public fun build(): WebhookReleasePublished {
      check(actionValue != null) { "action is required" }
      check(releaseValue != null) { "release is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookReleasePublished(
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
    public fun build(block: Builder.() -> Unit): WebhookReleasePublished = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookReleasePublished> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookReleasePublished {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookReleasePublished")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookReleasePublished must be a JSON object")
      val action = json.decodeRequired<InlineWebhookReleasePublishedActionX976b530c>(rawObject, "action")
      val release = json.decodeRequired<WebhooksRelease1>(rawObject, "release")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookReleasePublished(
        action = action,
        release = release,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookReleasePublished) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookReleasePublished")
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

public fun webhookReleasePublished(block: WebhookReleasePublished.Builder.() -> Unit): WebhookReleasePublished = WebhookReleasePublished.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookReleasePublished is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
