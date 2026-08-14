package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates that you intend to make future payments with this ConfirmationToken's payment method.
 *
 * The presence of this property will [attach the payment method](https://docs.stripe.com/payments/save-during-payment)
 * to the PaymentIntent's Customer, if present, after the PaymentIntent is confirmed and any required actions from the
 * user are complete.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/setup_future_usage
 */
@Serializable(with = InlineConfirmationTokenSetupFutureUsageX759e7354.Serializer::class)
public sealed class InlineConfirmationTokenSetupFutureUsageX759e7354 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineConfirmationTokenSetupFutureUsageX759e7354() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineConfirmationTokenSetupFutureUsageX759e7354() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConfirmationTokenSetupFutureUsageX759e7354()

  public companion object {
    public fun fromValue(`value`: String): InlineConfirmationTokenSetupFutureUsageX759e7354 = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineConfirmationTokenSetupFutureUsageX759e7354> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineConfirmationTokenSetupFutureUsageX759e7354", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConfirmationTokenSetupFutureUsageX759e7354 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokenSetupFutureUsageX759e7354) {
      encoder.encodeString(value.value)
    }
  }
}
