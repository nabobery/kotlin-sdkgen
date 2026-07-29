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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_present/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575.Serializer::class)
public sealed class InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `manual_preferred`.
   */
  public data object ManualPreferred : InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575() {
    public override val `value`: String = "manual_preferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575 = when (value) {
      Manual.value -> Manual
      ManualPreferred.value -> ManualPreferred
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsCardPresentCaptureMethodXd1871575) {
      encoder.encodeString(value.value)
    }
  }
}
