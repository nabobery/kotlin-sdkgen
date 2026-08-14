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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-tier-change/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-tier-change/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipPendingTierChangeActionX9858f48b.Serializer::class)
public sealed class InlineWebhookSponsorshipPendingTierChangeActionX9858f48b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending_tier_change`.
   */
  public data object PendingTierChange : InlineWebhookSponsorshipPendingTierChangeActionX9858f48b() {
    public override val `value`: String = "pending_tier_change"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipPendingTierChangeActionX9858f48b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipPendingTierChangeActionX9858f48b = when (value) {
      PendingTierChange.value -> PendingTierChange
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipPendingTierChangeActionX9858f48b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipPendingTierChangeActionX9858f48b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipPendingTierChangeActionX9858f48b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipPendingTierChangeActionX9858f48b) {
      encoder.encodeString(value.value)
    }
  }
}
