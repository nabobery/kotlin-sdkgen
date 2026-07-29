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
 * ed/schema/properties/customer_details/properties/address/properties/line1/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line1/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine1AnyOf2X7d268456) {
      encoder.encodeString(value.value)
    }
  }
}
