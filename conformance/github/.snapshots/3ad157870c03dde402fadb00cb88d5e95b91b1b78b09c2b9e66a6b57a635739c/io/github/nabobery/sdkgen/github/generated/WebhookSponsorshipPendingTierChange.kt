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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-tier-change.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-tier-change
 */
@Serializable(with = WebhookSponsorshipPendingTierChange.Serializer::class)
public class WebhookSponsorshipPendingTierChange(
  public val action: InlineWebhookSponsorshipPendingTierChangeActionX9858f48b,
  public val changes: WebhooksChanges8,
  public val sender: SimpleUser,
  public val sponsorship: WebhooksSponsorship,
  public val effectiveDate: String? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSponsorshipPendingTierChangeActionX9858f48b? = null

    public var action: InlineWebhookSponsorshipPendingTierChangeActionX9858f48b
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: WebhooksChanges8? = null

    public var changes: WebhooksChanges8
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
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

    public var effectiveDate: String? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookSponsorshipPendingTierChange {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(senderValue != null) { "sender is required" }
      check(sponsorshipValue != null) { "sponsorship is required" }
      return WebhookSponsorshipPendingTierChange(
        action = action,
        changes = changes,
        sender = sender,
        sponsorship = sponsorship,
        effectiveDate = effectiveDate,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSponsorshipPendingTierChange = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSponsorshipPendingTierChange> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSponsorshipPendingTierChange {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSponsorshipPendingTierChange")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSponsorshipPendingTierChange must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSponsorshipPendingTierChangeActionX9858f48b>(rawObject, "action")
      val changes = json.decodeRequired<WebhooksChanges8>(rawObject, "changes")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val sponsorship = json.decodeRequired<WebhooksSponsorship>(rawObject, "sponsorship")
      return WebhookSponsorshipPendingTierChange(
        action = action,
        changes = changes,
        sender = sender,
        sponsorship = sponsorship,
        effectiveDate = rawObject["effective_date"]?.let { json.decodeFromJsonElement<String>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSponsorshipPendingTierChange) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSponsorshipPendingTierChange")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("sender", json.encodeToJsonElement(value.sender))
        put("sponsorship", json.encodeToJsonElement(value.sponsorship))
        value.effectiveDate?.let { put("effective_date", it) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSponsorshipPendingTierChange(block: WebhookSponsorshipPendingTierChange.Builder.() -> Unit): WebhookSponsorshipPendingTierChange = WebhookSponsorshipPendingTierChange.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSponsorshipPendingTierChange is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
