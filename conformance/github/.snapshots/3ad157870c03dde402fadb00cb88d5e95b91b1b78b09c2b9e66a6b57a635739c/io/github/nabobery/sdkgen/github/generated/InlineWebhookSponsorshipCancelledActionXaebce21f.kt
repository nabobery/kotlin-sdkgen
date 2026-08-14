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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-cancelled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-cancelled/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipCancelledActionXaebce21f.Serializer::class)
public sealed class InlineWebhookSponsorshipCancelledActionXaebce21f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookSponsorshipCancelledActionXaebce21f() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipCancelledActionXaebce21f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipCancelledActionXaebce21f = when (value) {
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipCancelledActionXaebce21f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipCancelledActionXaebce21f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipCancelledActionXaebce21f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipCancelledActionXaebce21f) {
      encoder.encodeString(value.value)
    }
  }
}
