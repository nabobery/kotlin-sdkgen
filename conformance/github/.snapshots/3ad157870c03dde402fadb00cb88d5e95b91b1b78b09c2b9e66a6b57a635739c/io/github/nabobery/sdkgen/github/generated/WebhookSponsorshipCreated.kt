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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-created
 */
@Serializable(with = WebhookSponsorshipCreated.Serializer::class)
public class WebhookSponsorshipCreated(
  public val action: InlineWebhookSponsorshipCreatedActionX9aa25be3,
  public val sender: SimpleUser,
  public val sponsorship: WebhooksSponsorship,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSponsorshipCreatedActionX9aa25be3? = null

    public var action: InlineWebhookSponsorshipCreatedActionX9aa25be3
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    private var sponsorshipValue: WebhooksSponsorship? = null

    public var sponsorship: WebhooksSponsorship
      get() = requireNotNull(sponsorshipValue) { "sponsorship is required" }
      set(`value`) {
        sponsorshipValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookSponsorshipCreated {
      check(actionValue != null) { "action is required" }
      check(senderValue != null) { "sender is required" }
      check(sponsorshipValue != null) { "sponsorship is required" }
      return WebhookSponsorshipCreated(
        action = action,
        sender = sender,
        sponsorship = sponsorship,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSponsorshipCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSponsorshipCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSponsorshipCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSponsorshipCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSponsorshipCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSponsorshipCreatedActionX9aa25be3>(rawObject, "action")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val sponsorship = json.decodeRequired<WebhooksSponsorship>(rawObject, "sponsorship")
      return WebhookSponsorshipCreated(
        action = action,
        sender = sender,
        sponsorship = sponsorship,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSponsorshipCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSponsorshipCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("sender", json.encodeToJsonElement(value.sender))
        put("sponsorship", json.encodeToJsonElement(value.sponsorship))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSponsorshipCreated(block: WebhookSponsorshipCreated.Builder.() -> Unit): WebhookSponsorshipCreated = WebhookSponsorshipCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSponsorshipCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
