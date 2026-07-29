package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/marketplace-purchase/properties/marketplace_purchase.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/marketplace-purchase/properties/marketplace_purchase
 */
@Serializable(with = InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2.Serializer::class)
public class InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2(
  public val billingCycle: String? = null,
  public val freeTrialEndsOn: String? = null,
  public val isInstalled: Boolean? = null,
  public val nextBillingDate: String? = null,
  public val onFreeTrial: Boolean? = null,
  public val plan: MarketplaceListingPlan? = null,
  public val unitCount: Int? = null,
  public val updatedAt: String? = null,
) {
  public class Builder {
    public var billingCycle: String? = null

    public var freeTrialEndsOn: String? = null

    public var isInstalled: Boolean? = null

    public var nextBillingDate: String? = null

    public var onFreeTrial: Boolean? = null

    public var plan: MarketplaceListingPlan? = null

    public var unitCount: Int? = null

    public var updatedAt: String? = null

    public fun build(): InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2 = InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2(
      billingCycle = billingCycle,
      freeTrialEndsOn = freeTrialEndsOn,
      isInstalled = isInstalled,
      nextBillingDate = nextBillingDate,
      onFreeTrial = onFreeTrial,
      plan = plan,
      unitCount = unitCount,
      updatedAt = updatedAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2 must be a JSON object")
      return InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2(
        billingCycle = rawObject["billing_cycle"]?.let { json.decodeFromJsonElement<String>(it) },
        freeTrialEndsOn = rawObject["free_trial_ends_on"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        isInstalled = rawObject["is_installed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        nextBillingDate = rawObject["next_billing_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        onFreeTrial = rawObject["on_free_trial"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<MarketplaceListingPlan>(it) },
        unitCount = rawObject["unit_count"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingCycle?.let { put("billing_cycle", it) }
        value.freeTrialEndsOn?.let { put("free_trial_ends_on", it) }
        value.isInstalled?.let { put("is_installed", json.encodeToJsonElement(it)) }
        value.nextBillingDate?.let { put("next_billing_date", it) }
        value.onFreeTrial?.let { put("on_free_trial", json.encodeToJsonElement(it)) }
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
        value.unitCount?.let { put("unit_count", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMarketplacePurchaseMarketplacePurchaseX0db35ce2(block: InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2.Builder.() -> Unit): InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2 = InlineMarketplacePurchaseMarketplacePurchaseX0db35ce2.build(block)
