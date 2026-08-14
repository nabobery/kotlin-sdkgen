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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/action
 */
@Serializable(with = InlineWebhookMarketplacePurchaseChangedActionXfcaf0055.Serializer::class)
public sealed class InlineWebhookMarketplacePurchaseChangedActionXfcaf0055 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `changed`.
   */
  public data object Changed : InlineWebhookMarketplacePurchaseChangedActionXfcaf0055() {
    public override val `value`: String = "changed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMarketplacePurchaseChangedActionXfcaf0055()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMarketplacePurchaseChangedActionXfcaf0055 = when (value) {
      Changed.value -> Changed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMarketplacePurchaseChangedActionXfcaf0055> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMarketplacePurchaseChangedActionXfcaf0055", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchaseChangedActionXfcaf0055 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchaseChangedActionXfcaf0055) {
      encoder.encodeString(value.value)
    }
  }
}
