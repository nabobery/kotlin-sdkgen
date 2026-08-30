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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-run-requested-action
 */
@Serializable(with = WebhookCheckRunRequestedAction.Serializer::class)
public class WebhookCheckRunRequestedAction(
  public val action: InlineWebhookCheckRunRequestedActionActionX6856acab,
  public val checkRun: CheckRunWithSimpleCheckSuite,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  /**
   * The action requested by the user.
   */
  public val requestedAction: InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCheckRunRequestedActionActionX6856acab? = null

    public var action: InlineWebhookCheckRunRequestedActionActionX6856acab
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    /**
     * The action requested by the user.
     */
    public var requestedAction: InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9? = null

    public fun build(): WebhookCheckRunRequestedAction {
      check(actionValue != null) { "action is required" }
      check(checkRunValue != null) { "checkRun is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCheckRunRequestedAction(
        action = action,
        checkRun = checkRun,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        requestedAction = requestedAction,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCheckRunRequestedAction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCheckRunRequestedAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCheckRunRequestedAction {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCheckRunRequestedAction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCheckRunRequestedAction must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCheckRunRequestedActionActionX6856acab>(rawObject, "action")
      val checkRun = json.decodeRequired<CheckRunWithSimpleCheckSuite>(rawObject, "check_run")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCheckRunRequestedAction(
        action = action,
        checkRun = checkRun,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        requestedAction = rawObject["requested_action"]?.let { json.decodeFromJsonElement<InlineWebhookCheckRunRequestedActionRequestedActionX4e2614d9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCheckRunRequestedAction) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCheckRunRequestedAction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("check_run", json.encodeToJsonElement(value.checkRun))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.requestedAction?.let { put("requested_action", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookCheckRunRequestedAction(block: WebhookCheckRunRequestedAction.Builder.() -> Unit): WebhookCheckRunRequestedAction = WebhookCheckRunRequestedAction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCheckRunRequestedAction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
