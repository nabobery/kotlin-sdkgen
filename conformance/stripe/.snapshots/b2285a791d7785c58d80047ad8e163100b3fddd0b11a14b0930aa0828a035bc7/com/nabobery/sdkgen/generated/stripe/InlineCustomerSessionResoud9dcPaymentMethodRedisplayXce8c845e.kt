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
 * Controls whether or not the Payment Element shows saved payment methods. This parameter defaults to `disabled`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_redisplay
 */
@Serializable(with = InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e.Serializer::class)
public sealed class InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResoud9dcPaymentMethodRedisplayXce8c845e) {
      encoder.encodeString(value.value)
    }
  }
}
