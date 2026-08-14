package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested
 */
@Serializable(with = WebhookCheckSuiteRerequested.Serializer::class)
public class WebhookCheckSuiteRerequested(
  public val action: InlineWebhookCheckSuiteRerequestedActionXd2a42208,
  /**
   * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
   */
  public val checkSuite: InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCheckSuiteRerequestedActionXd2a42208? = null

    public var action: InlineWebhookCheckSuiteRerequestedActionXd2a42208
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var checkSuiteValue: InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697? = null

    public var checkSuite: InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697
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

    public fun build(): WebhookCheckSuiteRerequested {
      check(actionValue != null) { "action is required" }
      check(checkSuiteValue != null) { "checkSuite is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCheckSuiteRerequested(
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
    public fun build(block: Builder.() -> Unit): WebhookCheckSuiteRerequested = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckSuiteRerequested> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckSuiteRerequested {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckSuiteRerequested")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckSuiteRerequested must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCheckSuiteRerequestedActionXd2a42208>(rawObject, "action")
      val checkSuite = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697>(rawObject, "check_suite")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCheckSuiteRerequested(
        action = action,
        checkSuite = checkSuite,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckSuiteRerequested) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckSuiteRerequested")
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

public fun webhookCheckSuiteRerequested(block: WebhookCheckSuiteRerequested.Builder.() -> Unit): WebhookCheckSuiteRerequested = WebhookCheckSuiteRerequested.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckSuiteRerequested is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
