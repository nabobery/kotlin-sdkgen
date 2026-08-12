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
 * ww-form-urlencoded/schema/properties/billing_details/properties/email/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/email/anyOf/1
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsEmailAnyOf2Xc48d18dd) {
      encoder.encodeString(value.value)
    }
  }
}
