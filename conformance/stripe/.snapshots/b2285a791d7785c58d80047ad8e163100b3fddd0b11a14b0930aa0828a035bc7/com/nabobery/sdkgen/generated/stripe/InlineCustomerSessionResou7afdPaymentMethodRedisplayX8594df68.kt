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
 * Controls whether or not the mobile payment element shows saved payment methods.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_redisplay
 */
@Serializable(with = InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68.Serializer::class)
public sealed class InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou7afdPaymentMethodRedisplayX8594df68) {
      encoder.encodeString(value.value)
    }
  }
}
