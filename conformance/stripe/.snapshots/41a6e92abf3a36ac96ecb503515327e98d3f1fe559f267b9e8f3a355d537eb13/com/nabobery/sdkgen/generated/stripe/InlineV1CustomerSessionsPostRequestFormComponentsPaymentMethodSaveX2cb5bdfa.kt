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
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_save.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_save
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveX2cb5bdfa) {
      encoder.encodeString(value.value)
    }
  }
}
