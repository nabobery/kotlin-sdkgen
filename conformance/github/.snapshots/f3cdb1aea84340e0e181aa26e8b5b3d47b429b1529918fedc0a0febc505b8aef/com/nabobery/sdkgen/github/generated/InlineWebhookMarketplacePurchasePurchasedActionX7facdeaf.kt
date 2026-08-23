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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-purchased/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-purchased/properties/action
 */
@Serializable(with = InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf.Serializer::class)
public sealed class InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `purchased`.
   */
  public data object Purchased : InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf() {
    public override val `value`: String = "purchased"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf = when (value) {
      Purchased.value -> Purchased
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchasePurchasedActionX7facdeaf) {
      encoder.encodeString(value.value)
    }
  }
}
