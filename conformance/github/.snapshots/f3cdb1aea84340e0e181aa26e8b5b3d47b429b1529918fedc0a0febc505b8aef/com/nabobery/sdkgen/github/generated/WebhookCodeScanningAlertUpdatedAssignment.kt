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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-updated-assignment
 */
@Serializable(with = WebhookCodeScanningAlertUpdatedAssignment.Serializer::class)
public class WebhookCodeScanningAlertUpdatedAssignment(
  public val action: InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883,
  /**
   * The code scanning alert involved in the event.
   */
  public val alert: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertXd143de79,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883? = null

    public var action: InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var alertValue: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertXd143de79? = null

    public var alert: InlineWebhookCodeScanningAlertUpdatedAssignmentAlertXd143de79
      get() = requireNotNull(alertValue) { "alert is required" }
      set(`value`) {
        alertValue = value
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

    public fun build(): WebhookCodeScanningAlertUpdatedAssignment {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCodeScanningAlertUpdatedAssignment(
        action = action,
        alert = alert,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCodeScanningAlertUpdatedAssignment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCodeScanningAlertUpdatedAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCodeScanningAlertUpdatedAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCodeScanningAlertUpdatedAssignment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCodeScanningAlertUpdatedAssignment must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCodeScanningAlertUpdatedAssignmentActionX574b8883>(rawObject, "action")
      val alert = json.decodeRequired<InlineWebhookCodeScanningAlertUpdatedAssignmentAlertXd143de79>(rawObject, "alert")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCodeScanningAlertUpdatedAssignment(
        action = action,
        alert = alert,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCodeScanningAlertUpdatedAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCodeScanningAlertUpdatedAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
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

public fun webhookCodeScanningAlertUpdatedAssignment(block: WebhookCodeScanningAlertUpdatedAssignment.Builder.() -> Unit): WebhookCodeScanningAlertUpdatedAssignment = WebhookCodeScanningAlertUpdatedAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCodeScanningAlertUpdatedAssignment is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
