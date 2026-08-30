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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-cancellation/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-pending-cancellation/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipPendingCancellationActionXcc585d0a.Serializer::class)
public sealed class InlineWebhookSponsorshipPendingCancellationActionXcc585d0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending_cancellation`.
   */
  public data object PendingCancellation : InlineWebhookSponsorshipPendingCancellationActionXcc585d0a() {
    public override val `value`: String = "pending_cancellation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipPendingCancellationActionXcc585d0a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipPendingCancellationActionXcc585d0a = when (value) {
      PendingCancellation.value -> PendingCancellation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipPendingCancellationActionXcc585d0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipPendingCancellationActionXcc585d0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipPendingCancellationActionXcc585d0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipPendingCancellationActionXcc585d0a) {
      encoder.encodeString(value.value)
    }
  }
}
