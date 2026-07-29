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
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_allow_redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_payment_element_resour
 * ce_features/properties/payment_method_allow_redisplay_filters/items
 */
@Serializable(with = InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf.Serializer::class)
public sealed class InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResoud9dcPaymentMethodAllowRea1fdItemXc4071aaf) {
      encoder.encodeString(value.value)
    }
  }
}
