package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Controls when the funds will be captured from the customer's account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/capture_method
 */
@Serializable(with = InlinePaymentIntentCaptureMethodX7c24a00f.Serializer::class)
public sealed class InlinePaymentIntentCaptureMethodX7c24a00f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlinePaymentIntentCaptureMethodX7c24a00f() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `automatic_async`.
   */
  public data object AutomaticAsync : InlinePaymentIntentCaptureMethodX7c24a00f() {
    public override val `value`: String = "automatic_async"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentIntentCaptureMethodX7c24a00f() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentCaptureMethodX7c24a00f()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentCaptureMethodX7c24a00f = when (value) {
      Automatic.value -> Automatic
      AutomaticAsync.value -> AutomaticAsync
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentCaptureMethodX7c24a00f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentCaptureMethodX7c24a00f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentCaptureMethodX7c24a00f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentCaptureMethodX7c24a00f) {
      encoder.encodeString(value.value)
    }
  }
}
