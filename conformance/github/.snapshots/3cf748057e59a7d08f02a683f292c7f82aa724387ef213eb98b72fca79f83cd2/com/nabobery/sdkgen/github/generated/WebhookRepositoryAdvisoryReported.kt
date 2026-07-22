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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-reported.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-reported
 */
@Serializable(with = WebhookRepositoryAdvisoryReported.Serializer::class)
public class WebhookRepositoryAdvisoryReported(
  public val action: InlineWebhookRepositoryAdvisoryReportedActionXacf344eb,
  public val repository: RepositoryWebhooks,
  public val repositoryAdvisory: RepositoryAdvisory,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookRepositoryAdvisoryReportedActionXacf344eb? = null

    public var action: InlineWebhookRepositoryAdvisoryReportedActionXacf344eb
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var repositoryAdvisoryValue: RepositoryAdvisory? = null

    public var repositoryAdvisory: RepositoryAdvisory
      get() = requireNotNull(repositoryAdvisoryValue) { "repositoryAdvisory is required" }
      set(`value`) {
        repositoryAdvisoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookRepositoryAdvisoryReported {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(repositoryAdvisoryValue != null) { "repositoryAdvisory is required" }
      return WebhookRepositoryAdvisoryReported(
        action = action,
        repository = repository,
        repositoryAdvisory = repositoryAdvisory,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRepositoryAdvisoryReported = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookRepositoryAdvisoryReported> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRepositoryAdvisoryReported {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRepositoryAdvisoryReported")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRepositoryAdvisoryReported must be a JSON object")
      val action = json.decodeRequired<InlineWebhookRepositoryAdvisoryReportedActionXacf344eb>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val repositoryAdvisory = json.decodeRequired<RepositoryAdvisory>(rawObject, "repository_advisory")
      return WebhookRepositoryAdvisoryReported(
        action = action,
        repository = repository,
        repositoryAdvisory = repositoryAdvisory,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRepositoryAdvisoryReported) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRepositoryAdvisoryReported")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository", json.encodeToJsonElement(value.repository))
        put("repository_advisory", json.encodeToJsonElement(value.repositoryAdvisory))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRepositoryAdvisoryReported(block: WebhookRepositoryAdvisoryReported.Builder.() -> Unit): WebhookRepositoryAdvisoryReported = WebhookRepositoryAdvisoryReported.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRepositoryAdvisoryReported is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
