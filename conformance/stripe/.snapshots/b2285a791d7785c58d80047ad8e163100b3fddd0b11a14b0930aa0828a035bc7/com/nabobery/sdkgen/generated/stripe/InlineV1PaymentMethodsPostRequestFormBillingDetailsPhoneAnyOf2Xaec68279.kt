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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/phone/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/phone/anyOf/1
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279) {
      encoder.encodeString(value.value)
    }
  }
}
