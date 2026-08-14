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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-cancelled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-cancelled/properties/action
 */
@Serializable(with = InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d.Serializer::class)
public sealed class InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d = when (value) {
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchaseCancelledActionX18de8d7d) {
      encoder.encodeString(value.value)
    }
  }
}
