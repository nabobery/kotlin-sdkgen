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
 * The data source used to infer the customer's location.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_tax_location/properties/source
 */
@Serializable(with = InlineCustomerTaxLocationSourceX6bb00e15.Serializer::class)
public sealed class InlineCustomerTaxLocationSourceX6bb00e15 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing_address`.
   */
  public data object BillingAddress : InlineCustomerTaxLocationSourceX6bb00e15() {
    public override val `value`: String = "billing_address"
  }

  /**
   * Documented value. Wire value: `ip_address`.
   */
  public data object IpAddress : InlineCustomerTaxLocationSourceX6bb00e15() {
    public override val `value`: String = "ip_address"
  }

  /**
   * Documented value. Wire value: `payment_method`.
   */
  public data object PaymentMethod : InlineCustomerTaxLocationSourceX6bb00e15() {
    public override val `value`: String = "payment_method"
  }

  /**
   * Documented value. Wire value: `shipping_destination`.
   */
  public data object ShippingDestination : InlineCustomerTaxLocationSourceX6bb00e15() {
    public override val `value`: String = "shipping_destination"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerTaxLocationSourceX6bb00e15()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerTaxLocationSourceX6bb00e15 = when (value) {
      BillingAddress.value -> BillingAddress
      IpAddress.value -> IpAddress
      PaymentMethod.value -> PaymentMethod
      ShippingDestination.value -> ShippingDestination
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerTaxLocationSourceX6bb00e15> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerTaxLocationSourceX6bb00e15", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerTaxLocationSourceX6bb00e15 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTaxLocationSourceX6bb00e15) {
      encoder.encodeString(value.value)
    }
  }
}
