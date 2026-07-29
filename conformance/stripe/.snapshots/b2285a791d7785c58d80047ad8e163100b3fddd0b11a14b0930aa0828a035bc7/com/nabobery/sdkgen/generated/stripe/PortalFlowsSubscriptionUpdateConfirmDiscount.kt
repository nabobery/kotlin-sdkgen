package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_subscription_update_confirm_discount
 */
@Serializable(with = PortalFlowsSubscriptionUpdateConfirmDiscount.Serializer::class)
public class PortalFlowsSubscriptionUpdateConfirmDiscount(
  /**
   * The ID of the coupon to apply to this subscription update.
   */
  public val coupon: String? = null,
  /**
   * The ID of a promotion code to apply to this subscription update.
   */
  public val promotionCode: String? = null,
) {
  public class Builder {
    /**
     * The ID of the coupon to apply to this subscription update.
     */
    public var coupon: String? = null

    /**
     * The ID of a promotion code to apply to this subscription update.
     */
    public var promotionCode: String? = null

    public fun build(): PortalFlowsSubscriptionUpdateConfirmDiscount = PortalFlowsSubscriptionUpdateConfirmDiscount(
      coupon = coupon,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsSubscriptionUpdateConfirmDiscount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalFlowsSubscriptionUpdateConfirmDiscount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsSubscriptionUpdateConfirmDiscount {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsSubscriptionUpdateConfirmDiscount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsSubscriptionUpdateConfirmDiscount must be a JSON object")
      return PortalFlowsSubscriptionUpdateConfirmDiscount(
        coupon = rawObject["coupon"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        promotionCode = rawObject["promotion_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsSubscriptionUpdateConfirmDiscount) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsSubscriptionUpdateConfirmDiscount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.coupon?.let { put("coupon", it) }
        value.promotionCode?.let { put("promotion_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsSubscriptionUpdateConfirmDiscount(block: PortalFlowsSubscriptionUpdateConfirmDiscount.Builder.() -> Unit): PortalFlowsSubscriptionUpdateConfirmDiscount = PortalFlowsSubscriptionUpdateConfirmDiscount.build(block)
