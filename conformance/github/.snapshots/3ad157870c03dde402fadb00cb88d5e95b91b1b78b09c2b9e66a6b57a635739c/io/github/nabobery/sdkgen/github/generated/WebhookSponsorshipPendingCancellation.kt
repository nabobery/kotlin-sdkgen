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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-cancellation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-cancellation
 */
@Serializable(with = WebhookSponsorshipPendingCancellation.Serializer::class)
public class WebhookSponsorshipPendingCancellation(
  public val action: InlineWebhookSponsorshipPendingCancellationActionXcc585d0a,
  public val sender: SimpleUser,
  public val sponsorship: WebhooksSponsorship,
  public val effectiveDate: String? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSponsorshipPendingCancellationActionXcc585d0a? = null

    public var action: InlineWebhookSponsorshipPendingCancellationActionXcc585d0a
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

    public var effectiveDate: String? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookSponsorshipPendingCancellation {
      check(actionValue != null) { "action is required" }
      check(senderValue != null) { "sender is required" }
      check(sponsorshipValue != null) { "sponsorship is required" }
      return WebhookSponsorshipPendingCancellation(
        action = action,
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
    public fun build(block: Builder.() -> Unit): WebhookSponsorshipPendingCancellation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSponsorshipPendingCancellation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSponsorshipPendingCancellation {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSponsorshipPendingCancellation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSponsorshipPendingCancellation must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSponsorshipPendingCancellationActionXcc585d0a>(rawObject, "action")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val sponsorship = json.decodeRequired<WebhooksSponsorship>(rawObject, "sponsorship")
      return WebhookSponsorshipPendingCancellation(
        action = action,
        sender = sender,
        sponsorship = sponsorship,
        effectiveDate = rawObject["effective_date"]?.let { json.decodeFromJsonElement<String>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSponsorshipPendingCancellation) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSponsorshipPendingCancellation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
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

public fun webhookSponsorshipPendingCancellation(block: WebhookSponsorshipPendingCancellation.Builder.() -> Unit): WebhookSponsorshipPendingCancellation = WebhookSponsorshipPendingCancellation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSponsorshipPendingCancellation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
