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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-cancelled/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-personal-access-token-request-cancelled/properties/action
 */
@Serializable(with = InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0.Serializer::class)
public sealed class InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0 = when (value) {
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPersonalAccessTokenRequestCancelledActionXc08169e0) {
      encoder.encodeString(value.value)
    }
  }
}
