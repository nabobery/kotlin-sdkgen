package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase/properties/plan/properties/pr
 * ice_model.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase/properties/plan/properties/pr
 * ice_model
 */
@Serializable(with = InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d.Serializer::class)
public sealed class InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `FREE`.
   */
  public data object Free : InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d() {
    public override val `value`: String = "FREE"
  }

  /**
   * Documented value. Wire value: `FLAT_RATE`.
   */
  public data object FlatRate : InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d() {
    public override val `value`: String = "FLAT_RATE"
  }

  /**
   * Documented value. Wire value: `PER_UNIT`.
   */
  public data object PerUnit : InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d() {
    public override val `value`: String = "PER_UNIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d = when (value) {
      Free.value -> Free
      FlatRate.value -> FlatRate
      PerUnit.value -> PerUnit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPreviousMarketplacePurchasePlanPriceModelX8d9d376d) {
      encoder.encodeString(value.value)
    }
  }
}
