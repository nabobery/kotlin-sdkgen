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
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_allow_redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_mobile_payment_element
 * _resource_features/properties/payment_method_allow_redisplay_filters/items
 */
@Serializable(with = InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f.Serializer::class)
public sealed class InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou7afdPaymentMethodAllowRea1fdItemX59f3e40f) {
      encoder.encodeString(value.value)
    }
  }
}
