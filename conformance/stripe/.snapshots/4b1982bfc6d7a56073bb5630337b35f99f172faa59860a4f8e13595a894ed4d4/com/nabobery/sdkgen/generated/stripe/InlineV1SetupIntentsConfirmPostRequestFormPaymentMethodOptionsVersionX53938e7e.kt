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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/versi
 * on.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/card/properties/three_d_secure/properties/versi
 * on
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1.0.2`.
   */
  public data object _102 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e() {
    public override val `value`: String = "1.0.2"
  }

  /**
   * Documented value. Wire value: `2.1.0`.
   */
  public data object _210 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e() {
    public override val `value`: String = "2.1.0"
  }

  /**
   * Documented value. Wire value: `2.2.0`.
   */
  public data object _220 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e() {
    public override val `value`: String = "2.2.0"
  }

  /**
   * Documented value. Wire value: `2.3.0`.
   */
  public data object _230 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e() {
    public override val `value`: String = "2.3.0"
  }

  /**
   * Documented value. Wire value: `2.3.1`.
   */
  public data object _231 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e() {
    public override val `value`: String = "2.3.1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e = when (value) {
      _102.value -> _102
      _210.value -> _210
      _220.value -> _220
      _230.value -> _230
      _231.value -> _231
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsVersionX53938e7e) {
      encoder.encodeString(value.value)
    }
  }
}
