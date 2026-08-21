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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-fixed
 */
@Serializable(with = WebhookCodeScanningAlertFixed.Serializer::class)
public class WebhookCodeScanningAlertFixed(
  public val action: InlineWebhookCodeScanningAlertFixedActionX04fcb933,
  /**
   * The code scanning alert involved in the event.
   */
  public val alert: InlineWebhookCodeScanningAlertFixedAlertXf311aea8,
  public val commitOid: String,
  public val ref: String,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookCodeScanningAlertFixedActionX04fcb933? = null

    public var action: InlineWebhookCodeScanningAlertFixedActionX04fcb933
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var alertValue: InlineWebhookCodeScanningAlertFixedAlertXf311aea8? = null

    public var alert: InlineWebhookCodeScanningAlertFixedAlertXf311aea8
      get() = requireNotNull(alertValue) { "alert is required" }
      set(`value`) {
        alertValue = value
      }

    private var commitOidValue: String? = null

    public var commitOid: String
      get() = requireNotNull(commitOidValue) { "commitOid is required" }
      set(`value`) {
        commitOidValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
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

    public fun build(): WebhookCodeScanningAlertFixed {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(commitOidValue != null) { "commitOid is required" }
      check(refValue != null) { "ref is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookCodeScanningAlertFixed(
        action = action,
        alert = alert,
        commitOid = commitOid,
        ref = ref,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCodeScanningAlertFixed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookCodeScanningAlertFixed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCodeScanningAlertFixed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCodeScanningAlertFixed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCodeScanningAlertFixed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCodeScanningAlertFixedActionX04fcb933>(rawObject, "action")
      val alert = json.decodeRequired<InlineWebhookCodeScanningAlertFixedAlertXf311aea8>(rawObject, "alert")
      val commitOid = json.decodeRequired<String>(rawObject, "commit_oid")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookCodeScanningAlertFixed(
        action = action,
        alert = alert,
        commitOid = commitOid,
        ref = ref,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCodeScanningAlertFixed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCodeScanningAlertFixed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
        put("commit_oid", value.commitOid)
        put("ref", value.ref)
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

public fun webhookCodeScanningAlertFixed(block: WebhookCodeScanningAlertFixed.Builder.() -> Unit): WebhookCodeScanningAlertFixed = WebhookCodeScanningAlertFixed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCodeScanningAlertFixed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
