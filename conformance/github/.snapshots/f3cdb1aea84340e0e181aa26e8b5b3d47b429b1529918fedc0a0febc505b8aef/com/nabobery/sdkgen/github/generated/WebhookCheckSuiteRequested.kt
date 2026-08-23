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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-requested
 */
@Serializable(with = WebhookCheckSuiteRequested.Serializer::class)
public class WebhookCheckSuiteRequested(
  public val action: InlineWebhookCheckSuiteRequestedActionXc4976f3a,
  /**
   * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
   */
  public val checkSuite: InlineWebhookCheckSuiteRequestedCheckSuiteXa8db5169,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCheckSuiteRequestedActionXc4976f3a? = null

    public var action: InlineWebhookCheckSuiteRequestedActionXc4976f3a
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var checkSuiteValue: InlineWebhookCheckSuiteRequestedCheckSuiteXa8db5169? = null

    public var checkSuite: InlineWebhookCheckSuiteRequestedCheckSuiteXa8db5169
      get() = requireNotNull(checkSuiteValue) { "checkSuite is required" }
      set(`value`) {
        checkSuiteValue = value
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookCheckSuiteRequested {
      check(actionValue != null) { "action is required" }
      check(checkSuiteValue != null) { "checkSuite is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCheckSuiteRequested(
        action = action,
        checkSuite = checkSuite,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckSuiteRequested = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckSuiteRequested> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckSuiteRequested {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckSuiteRequested")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckSuiteRequested must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCheckSuiteRequestedActionXc4976f3a>(rawObject, "action")
      val checkSuite = json.decodeRequired<InlineWebhookCheckSuiteRequestedCheckSuiteXa8db5169>(rawObject, "check_suite")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCheckSuiteRequested(
        action = action,
        checkSuite = checkSuite,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckSuiteRequested) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckSuiteRequested")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("check_suite", json.encodeToJsonElement(value.checkSuite))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckSuiteRequested(block: WebhookCheckSuiteRequested.Builder.() -> Unit): WebhookCheckSuiteRequested = WebhookCheckSuiteRequested.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckSuiteRequested is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
