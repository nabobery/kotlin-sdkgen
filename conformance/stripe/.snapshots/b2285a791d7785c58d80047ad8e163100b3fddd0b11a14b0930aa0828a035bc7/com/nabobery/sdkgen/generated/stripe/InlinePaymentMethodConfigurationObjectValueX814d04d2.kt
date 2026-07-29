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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_configuration/properties/object
 */
@Serializable(with = InlinePaymentMethodConfigurationObjectValueX814d04d2.Serializer::class)
public sealed class InlinePaymentMethodConfigurationObjectValueX814d04d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `payment_method_configuration`.
   */
  public data object PaymentMethodConfiguration : InlinePaymentMethodConfigurationObjectValueX814d04d2() {
    public override val `value`: String = "payment_method_configuration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodConfigurationObjectValueX814d04d2()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodConfigurationObjectValueX814d04d2 = when (value) {
      PaymentMethodConfiguration.value -> PaymentMethodConfiguration
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodConfigurationObjectValueX814d04d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodConfigurationObjectValueX814d04d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodConfigurationObjectValueX814d04d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodConfigurationObjectValueX814d04d2) {
      encoder.encodeString(value.value)
    }
  }
}
