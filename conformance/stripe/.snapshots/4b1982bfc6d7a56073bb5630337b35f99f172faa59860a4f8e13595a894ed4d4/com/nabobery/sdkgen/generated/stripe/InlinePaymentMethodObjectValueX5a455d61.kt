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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method/properties/object
 */
@Serializable(with = InlinePaymentMethodObjectValueX5a455d61.Serializer::class)
public sealed class InlinePaymentMethodObjectValueX5a455d61 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlinePaymentMethodObjectValueX5a455d61() {
    public override val `value`: String = "payment_method"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodObjectValueX5a455d61()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodObjectValueX5a455d61 = when (value) {
      PaymentMethod.value -> PaymentMethod
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodObjectValueX5a455d61> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodObjectValueX5a455d61", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodObjectValueX5a455d61 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodObjectValueX5a455d61) {
      encoder.encodeString(value.value)
    }
  }
}
