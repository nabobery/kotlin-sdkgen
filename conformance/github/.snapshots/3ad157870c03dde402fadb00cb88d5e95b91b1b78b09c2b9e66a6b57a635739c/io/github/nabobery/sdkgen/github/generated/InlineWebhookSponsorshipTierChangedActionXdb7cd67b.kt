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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-tier-changed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-tier-changed/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipTierChangedActionXdb7cd67b.Serializer::class)
public sealed class InlineWebhookSponsorshipTierChangedActionXdb7cd67b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tier_changed`.
   */
  public data object TierChanged : InlineWebhookSponsorshipTierChangedActionXdb7cd67b() {
    public override val `value`: String = "tier_changed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipTierChangedActionXdb7cd67b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipTierChangedActionXdb7cd67b = when (value) {
      TierChanged.value -> TierChanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipTierChangedActionXdb7cd67b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipTierChangedActionXdb7cd67b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipTierChangedActionXdb7cd67b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipTierChangedActionXdb7cd67b) {
      encoder.encodeString(value.value)
    }
  }
}
