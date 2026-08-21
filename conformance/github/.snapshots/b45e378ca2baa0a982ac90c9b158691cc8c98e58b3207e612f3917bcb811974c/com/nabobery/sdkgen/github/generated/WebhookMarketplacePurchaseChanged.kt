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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed
 */
@Serializable(with = WebhookMarketplacePurchaseChanged.Serializer::class)
public class WebhookMarketplacePurchaseChanged(
  public val action: InlineWebhookMarketplacePurchaseChangedActionXfcaf0055,
  public val effectiveDate: String,
  public val marketplacePurchase: WebhooksMarketplacePurchase,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val previousMarketplacePurchase:
      InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookMarketplacePurchaseChangedActionXfcaf0055? = null

    public var action: InlineWebhookMarketplacePurchaseChangedActionXfcaf0055
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var effectiveDateValue: String? = null

    public var effectiveDate: String
      get() = requireNotNull(effectiveDateValue) { "effectiveDate is required" }
      set(`value`) {
        effectiveDateValue = value
      }

    private var marketplacePurchaseValue: WebhooksMarketplacePurchase? = null

    public var marketplacePurchase: WebhooksMarketplacePurchase
      get() = requireNotNull(marketplacePurchaseValue) { "marketplacePurchase is required" }
      set(`value`) {
        marketplacePurchaseValue = value
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

    public var previousMarketplacePurchase:
        InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookMarketplacePurchaseChanged {
      check(actionValue != null) { "action is required" }
      check(effectiveDateValue != null) { "effectiveDate is required" }
      check(marketplacePurchaseValue != null) { "marketplacePurchase is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookMarketplacePurchaseChanged(
        action = action,
        effectiveDate = effectiveDate,
        marketplacePurchase = marketplacePurchase,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        previousMarketplacePurchase = previousMarketplacePurchase,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMarketplacePurchaseChanged = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMarketplacePurchaseChanged> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMarketplacePurchaseChanged {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMarketplacePurchaseChanged")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMarketplacePurchaseChanged must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMarketplacePurchaseChangedActionXfcaf0055>(rawObject, "action")
      val effectiveDate = json.decodeRequired<String>(rawObject, "effective_date")
      val marketplacePurchase = json.decodeRequired<WebhooksMarketplacePurchase>(rawObject, "marketplace_purchase")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookMarketplacePurchaseChanged(
        action = action,
        effectiveDate = effectiveDate,
        marketplacePurchase = marketplacePurchase,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        previousMarketplacePurchase = rawObject["previous_marketplace_purchase"]?.let { json.decodeFromJsonElement<InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchaseXd3bed6c1>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMarketplacePurchaseChanged) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMarketplacePurchaseChanged")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("effective_date", value.effectiveDate)
        put("marketplace_purchase", json.encodeToJsonElement(value.marketplacePurchase))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.previousMarketplacePurchase?.let { put("previous_marketplace_purchase", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMarketplacePurchaseChanged(block: WebhookMarketplacePurchaseChanged.Builder.() -> Unit): WebhookMarketplacePurchaseChanged = WebhookMarketplacePurchaseChanged.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMarketplacePurchaseChanged is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
