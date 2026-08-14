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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-closed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-closed
 */
@Serializable(with = WebhookMilestoneClosed.Serializer::class)
public class WebhookMilestoneClosed(
  public val action: InlineWebhookMilestoneClosedActionX3f6f6582,
  public val milestone: WebhooksMilestone,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookMilestoneClosedActionX3f6f6582? = null

    public var action: InlineWebhookMilestoneClosedActionX3f6f6582
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var milestoneValue: WebhooksMilestone? = null

    public var milestone: WebhooksMilestone
      get() = requireNotNull(milestoneValue) { "milestone is required" }
      set(`value`) {
        milestoneValue = value
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

    public fun build(): WebhookMilestoneClosed {
      check(actionValue != null) { "action is required" }
      check(milestoneValue != null) { "milestone is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookMilestoneClosed(
        action = action,
        milestone = milestone,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMilestoneClosed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMilestoneClosed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMilestoneClosed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMilestoneClosed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMilestoneClosed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMilestoneClosedActionX3f6f6582>(rawObject, "action")
      val milestone = json.decodeRequired<WebhooksMilestone>(rawObject, "milestone")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookMilestoneClosed(
        action = action,
        milestone = milestone,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMilestoneClosed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMilestoneClosed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("milestone", json.encodeToJsonElement(value.milestone))
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

public fun webhookMilestoneClosed(block: WebhookMilestoneClosed.Builder.() -> Unit): WebhookMilestoneClosed = WebhookMilestoneClosed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMilestoneClosed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
