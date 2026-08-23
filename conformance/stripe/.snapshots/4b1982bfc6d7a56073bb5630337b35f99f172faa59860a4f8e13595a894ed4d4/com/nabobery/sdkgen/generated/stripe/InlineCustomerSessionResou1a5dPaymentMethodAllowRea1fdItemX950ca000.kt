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
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_customer_sheet_resourc
 * e_features/properties/payment_method_allow_redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_session_resource_components_resource_customer_sheet_resourc
 * e_features/properties/payment_method_allow_redisplay_filters/items
 */
@Serializable(with = InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000.Serializer::class)
public sealed class InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerSessionResou1a5dPaymentMethodAllowRea1fdItemX950ca000) {
      encoder.encodeString(value.value)
    }
  }
}
