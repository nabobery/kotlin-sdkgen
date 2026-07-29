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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase/properties/plan/properties/price_model.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase/properties/plan/properties/price_model
 */
@Serializable(with = InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11.Serializer::class)
public sealed class InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `FREE`.
   */
  public data object Free : InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11() {
    public override val `value`: String = "FREE"
  }

  /**
   * Documented value. Wire value: `FLAT_RATE`.
   */
  public data object FlatRate : InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11() {
    public override val `value`: String = "FLAT_RATE"
  }

  /**
   * Documented value. Wire value: `PER_UNIT`.
   */
  public data object PerUnit : InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11() {
    public override val `value`: String = "PER_UNIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11 = when (value) {
      Free.value -> Free
      FlatRate.value -> FlatRate
      PerUnit.value -> PerUnit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11) {
      encoder.encodeString(value.value)
    }
  }
}
