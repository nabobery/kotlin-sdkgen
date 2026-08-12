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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-created
 */
@Serializable(with = WebhookCheckRunCreated.Serializer::class)
public class WebhookCheckRunCreated(
  public val checkRun: CheckRunWithSimpleCheckSuite,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val action: InlineWebhookCheckRunCreatedActionXf5b121b7? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var checkRunValue: CheckRunWithSimpleCheckSuite? = null

    public var checkRun: CheckRunWithSimpleCheckSuite
      get() = requireNotNull(checkRunValue) { "checkRun is required" }
      set(`value`) {
        checkRunValue = value
      }

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

    public var action: InlineWebhookCheckRunCreatedActionXf5b121b7? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookCheckRunCreated {
      check(checkRunValue != null) { "checkRun is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCheckRunCreated(
        checkRun = checkRun,
        repository = repository,
        sender = sender,
        action = action,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckRunCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckRunCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckRunCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckRunCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckRunCreated must be a JSON object")
      val checkRun = json.decodeRequired<CheckRunWithSimpleCheckSuite>(rawObject, "check_run")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCheckRunCreated(
        checkRun = checkRun,
        repository = repository,
        sender = sender,
        action = rawObject["action"]?.let { json.decodeFromJsonElement<InlineWebhookCheckRunCreatedActionXf5b121b7>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckRunCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckRunCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_run", json.encodeToJsonElement(value.checkRun))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckRunCreated(block: WebhookCheckRunCreated.Builder.() -> Unit): WebhookCheckRunCreated = WebhookCheckRunCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckRunCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
