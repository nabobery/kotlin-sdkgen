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
 * ed/schema/properties/customer_details/properties/address/properties/postal_code/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/postal_code/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressAnyOf2Xa380610c) {
      encoder.encodeString(value.value)
    }
  }
}
