package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/previous_mark
 * etplace_purchase/properties/plan/properties/price_model.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/previous_mark
 * etplace_purchase/properties/plan/properties/price_model
 */
@Serializable(with = InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32.Serializer::class)
public sealed class InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `FREE`.
   */
  public data object Free : InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32() {
    public override val `value`: String = "FREE"
  }

  /**
   * Documented value. Wire value: `FLAT_RATE`.
   */
  public data object FlatRate : InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32() {
    public override val `value`: String = "FLAT_RATE"
  }

  /**
   * Documented value. Wire value: `PER_UNIT`.
   */
  public data object PerUnit : InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32() {
    public override val `value`: String = "PER_UNIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32 = when (value) {
      Free.value -> Free
      FlatRate.value -> FlatRate
      PerUnit.value -> PerUnit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePuf05ePreviousMarketplaceP9633PlanPriceModelX2be13b32) {
      encoder.encodeString(value.value)
    }
  }
}
