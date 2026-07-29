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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase/properties/plan/properties/price_model
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase/properties/plan/properties/price_model
 */
@Serializable(with = InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690.Serializer::class)
public sealed class InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `FREE`.
   */
  public data object Free : InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690() {
    public override val `value`: String = "FREE"
  }

  /**
   * Documented value. Wire value: `FLAT_RATE`.
   */
  public data object FlatRate : InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690() {
    public override val `value`: String = "FLAT_RATE"
  }

  /**
   * Documented value. Wire value: `PER_UNIT`.
   */
  public data object PerUnit : InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690() {
    public override val `value`: String = "PER_UNIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690 = when (value) {
      Free.value -> Free
      FlatRate.value -> FlatRate
      PerUnit.value -> PerUnit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690) {
      encoder.encodeString(value.value)
    }
  }
}
