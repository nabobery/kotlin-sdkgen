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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_save_
 * allow_redisplay_override.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_save_
 * allow_redisplay_override
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormPaymentMethodSaveAll7d2cX55662ce5) {
      encoder.encodeString(value.value)
    }
  }
}
