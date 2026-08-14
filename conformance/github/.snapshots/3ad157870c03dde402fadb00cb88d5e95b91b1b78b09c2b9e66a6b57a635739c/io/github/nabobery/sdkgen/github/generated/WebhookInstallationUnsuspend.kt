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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-unsuspend.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-unsuspend
 */
@Serializable(with = WebhookInstallationUnsuspend.Serializer::class)
public class WebhookInstallationUnsuspend(
  public val action: InlineWebhookInstallationUnsuspendActionX7be5f70f,
  public val installation: Installation,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  repositories: List<InlineWebhooksRepositoriesItemX11f0076e>? = null,
  public val repository: RepositoryWebhooks? = null,
  public val requester: JsonElement? = null,
) {
  public val repositories: List<InlineWebhooksRepositoriesItemX11f0076e>? =
      repositories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actionValue: InlineWebhookInstallationUnsuspendActionX7be5f70f? = null

    public var action: InlineWebhookInstallationUnsuspendActionX7be5f70f
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var installationValue: Installation? = null

    public var installation: Installation
      get() = requireNotNull(installationValue) { "installation is required" }
      set(`value`) {
        installationValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var organization: OrganizationSimpleWebhooks? = null

    private var repositoriesValue: List<InlineWebhooksRepositoriesItemX11f0076e>? = null

    public var repositories: List<InlineWebhooksRepositoriesItemX11f0076e>?
      get() = repositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var repository: RepositoryWebhooks? = null

    public var requester: JsonElement? = null

    public fun build(): WebhookInstallationUnsuspend {
      check(actionValue != null) { "action is required" }
      check(installationValue != null) { "installation is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookInstallationUnsuspend(
        action = action,
        installation = installation,
        sender = sender,
        enterprise = enterprise,
        organization = organization,
        repositories = repositories,
        repository = repository,
        requester = requester,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookInstallationUnsuspend = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookInstallationUnsuspend> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookInstallationUnsuspend {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookInstallationUnsuspend")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookInstallationUnsuspend must be a JSON object")
      val action = json.decodeRequired<InlineWebhookInstallationUnsuspendActionX7be5f70f>(rawObject, "action")
      val installation = json.decodeRequired<Installation>(rawObject, "installation")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookInstallationUnsuspend(
        action = action,
        installation = installation,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<InlineWebhooksRepositoriesItemX11f0076e>>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        requester = rawObject["requester"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookInstallationUnsuspend) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookInstallationUnsuspend")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("installation", json.encodeToJsonElement(value.installation))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.requester?.let { put("requester", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookInstallationUnsuspend(block: WebhookInstallationUnsuspend.Builder.() -> Unit): WebhookInstallationUnsuspend = WebhookInstallationUnsuspend.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookInstallationUnsuspend is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
