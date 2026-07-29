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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_klarna/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a.Serializer::class)
public sealed class InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsKlarnaCaptureMethodX1694c60a) {
      encoder.encodeString(value.value)
    }
  }
}
