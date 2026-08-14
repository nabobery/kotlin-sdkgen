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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change-cancelled/properties/act
 * ion.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change-cancelled/properties/act
 * ion
 */
@Serializable(with = InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08.Serializer::class)
public sealed class InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending_change_cancelled`.
   */
  public data object PendingChangeCancelled : InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08() {
    public override val `value`: String = "pending_change_cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08 = when (value) {
      PendingChangeCancelled.value -> PendingChangeCancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchasePendingChangeCancelledActionX5cf6dc08) {
      encoder.encodeString(value.value)
    }
  }
}
