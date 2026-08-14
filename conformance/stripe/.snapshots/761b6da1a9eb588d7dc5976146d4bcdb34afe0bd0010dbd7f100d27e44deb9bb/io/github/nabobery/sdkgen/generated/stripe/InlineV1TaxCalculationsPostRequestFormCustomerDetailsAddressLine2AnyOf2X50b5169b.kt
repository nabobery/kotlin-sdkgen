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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line2/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/line2/anyOf/1
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressLine2AnyOf2X50b5169b) {
      encoder.encodeString(value.value)
    }
  }
}
