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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/version.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/properties/version
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1.0.2`.
   */
  public data object _102 : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6() {
    public override val `value`: String = "1.0.2"
  }

  /**
   * Documented value. Wire value: `2.1.0`.
   */
  public data object _210 : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6() {
    public override val `value`: String = "2.1.0"
  }

  /**
   * Documented value. Wire value: `2.2.0`.
   */
  public data object _220 : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6() {
    public override val `value`: String = "2.2.0"
  }

  /**
   * Documented value. Wire value: `2.3.0`.
   */
  public data object _230 : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6() {
    public override val `value`: String = "2.3.0"
  }

  /**
   * Documented value. Wire value: `2.3.1`.
   */
  public data object _231 : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6() {
    public override val `value`: String = "2.3.1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6 = when (value) {
      _102.value -> _102
      _210.value -> _210
      _220.value -> _220
      _230.value -> _230
      _231.value -> _231
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardVersionXffec19d6) {
      encoder.encodeString(value.value)
    }
  }
}
