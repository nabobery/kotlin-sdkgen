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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-pending-change/properties/action
 */
@Serializable(with = InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19.Serializer::class)
public sealed class InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending_change`.
   */
  public data object PendingChange : InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19() {
    public override val `value`: String = "pending_change"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19 = when (value) {
      PendingChange.value -> PendingChange
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchasePendingChangeActionXfecbdc19) {
      encoder.encodeString(value.value)
    }
  }
}
