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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-tier-changed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-tier-changed
 */
@Serializable(with = WebhookSponsorshipTierChanged.Serializer::class)
public class WebhookSponsorshipTierChanged(
  public val action: InlineWebhookSponsorshipTierChangedActionXdb7cd67b,
  public val changes: WebhooksChanges8,
  public val sender: SimpleUser,
  public val sponsorship: WebhooksSponsorship,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSponsorshipTierChangedActionXdb7cd67b? = null

    public var action: InlineWebhookSponsorshipTierChangedActionXdb7cd67b
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookSponsorshipTierChanged {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(senderValue != null) { "sender is required" }
      check(sponsorshipValue != null) { "sponsorship is required" }
      return WebhookSponsorshipTierChanged(
        action = action,
        changes = changes,
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
    public fun build(block: Builder.() -> Unit): WebhookSponsorshipTierChanged = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSponsorshipTierChanged> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSponsorshipTierChanged {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSponsorshipTierChanged")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSponsorshipTierChanged must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSponsorshipTierChangedActionXdb7cd67b>(rawObject, "action")
      val changes = json.decodeRequired<WebhooksChanges8>(rawObject, "changes")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val sponsorship = json.decodeRequired<WebhooksSponsorship>(rawObject, "sponsorship")
      return WebhookSponsorshipTierChanged(
        action = action,
        changes = changes,
        sender = sender,
        sponsorship = sponsorship,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSponsorshipTierChanged) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSponsorshipTierChanged")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
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

public fun webhookSponsorshipTierChanged(block: WebhookSponsorshipTierChanged.Builder.() -> Unit): WebhookSponsorshipTierChanged = WebhookSponsorshipTierChanged.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSponsorshipTierChanged is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
