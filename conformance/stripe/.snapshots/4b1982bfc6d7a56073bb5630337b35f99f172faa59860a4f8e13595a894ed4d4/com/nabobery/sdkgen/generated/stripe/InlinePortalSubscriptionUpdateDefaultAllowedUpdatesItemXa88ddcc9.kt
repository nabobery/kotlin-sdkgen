package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/portal_subscription_update/properties/default_allowed_updates/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/portal_subscription_update/properties/default_allowed_updates/items
 */
@Serializable(with = InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9.Serializer::class)
public sealed class InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price`.
   */
  public data object Price : InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9() {
    public override val `value`: String = "price"
  }

  /**
   * Documented value. Wire value: `promotion_code`.
   */
  public data object PromotionCode : InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9() {
    public override val `value`: String = "promotion_code"
  }

  /**
   * Documented value. Wire value: `quantity`.
   */
  public data object Quantity : InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9() {
    public override val `value`: String = "quantity"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9 = when (value) {
      Price.value -> Price
      PromotionCode.value -> PromotionCode
      Quantity.value -> Quantity
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionUpdateDefaultAllowedUpdatesItemXa88ddcc9) {
      encoder.encodeString(value.value)
    }
  }
}
