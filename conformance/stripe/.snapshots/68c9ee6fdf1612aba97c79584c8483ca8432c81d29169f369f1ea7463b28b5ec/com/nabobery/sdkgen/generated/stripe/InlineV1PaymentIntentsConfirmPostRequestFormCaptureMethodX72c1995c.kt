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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/capture_metho
 * d.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/capture_metho
 * d
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `manual_preferred`.
   */
  public data object ManualPreferred : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c() {
    public override val `value`: String = "manual_preferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c = when (value) {
      Manual.value -> Manual
      ManualPreferred.value -> ManualPreferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX72c1995c) {
      encoder.encodeString(value.value)
    }
  }
}
