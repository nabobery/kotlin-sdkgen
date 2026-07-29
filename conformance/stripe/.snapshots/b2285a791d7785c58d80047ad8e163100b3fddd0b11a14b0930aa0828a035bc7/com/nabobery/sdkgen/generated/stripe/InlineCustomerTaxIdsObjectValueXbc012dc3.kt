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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/tax_ids/properties/object
 */
@Serializable(with = InlineCustomerTaxIdsObjectValueXbc012dc3.Serializer::class)
public sealed class InlineCustomerTaxIdsObjectValueXbc012dc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineCustomerTaxIdsObjectValueXbc012dc3() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerTaxIdsObjectValueXbc012dc3()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerTaxIdsObjectValueXbc012dc3 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCustomerTaxIdsObjectValueXbc012dc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerTaxIdsObjectValueXbc012dc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerTaxIdsObjectValueXbc012dc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTaxIdsObjectValueXbc012dc3) {
      encoder.encodeString(value.value)
    }
  }
}
