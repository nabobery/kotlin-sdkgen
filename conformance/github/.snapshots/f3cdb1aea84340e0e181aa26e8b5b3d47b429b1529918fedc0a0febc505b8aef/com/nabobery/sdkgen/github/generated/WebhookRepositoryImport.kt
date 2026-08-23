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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-import.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-import
 */
@Serializable(with = WebhookRepositoryImport.Serializer::class)
public class WebhookRepositoryImport(
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val status: InlineWebhookRepositoryImportStatusXa0b730d2,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    private var statusValue: InlineWebhookRepositoryImportStatusXa0b730d2? = null

    public var status: InlineWebhookRepositoryImportStatusXa0b730d2
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookRepositoryImport {
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(statusValue != null) { "status is required" }
      return WebhookRepositoryImport(
        repository = repository,
        sender = sender,
        status = status,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRepositoryImport = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookRepositoryImport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRepositoryImport {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRepositoryImport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRepositoryImport must be a JSON object")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val status = json.decodeRequired<InlineWebhookRepositoryImportStatusXa0b730d2>(rawObject, "status")
      return WebhookRepositoryImport(
        repository = repository,
        sender = sender,
        status = status,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRepositoryImport) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRepositoryImport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        put("status", json.encodeToJsonElement(value.status))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRepositoryImport(block: WebhookRepositoryImport.Builder.() -> Unit): WebhookRepositoryImport = WebhookRepositoryImport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRepositoryImport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
