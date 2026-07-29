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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address_source.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address_source
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `billing`.
   */
  public data object Billing : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2() {
    public override val `value`: String = "billing"
  }

  /**
   * Documented value. Wire value: `shipping`.
   */
  public data object Shipping : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2() {
    public override val `value`: String = "shipping"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2 = when (value) {
      Billing.value -> Billing
      Shipping.value -> Shipping
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressSourceX43e24cf2) {
      encoder.encodeString(value.value)
    }
  }
}
