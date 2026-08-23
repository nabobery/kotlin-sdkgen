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
 * Describes the customer's tax exemption status, which is `none`, `exempt`, or `reverse`. When set to `reverse`,
 * invoice and receipt PDFs include the following text: **"Reverse charge"**.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/tax_exempt
 */
@Serializable(with = InlineCustomerTaxExemptX8cad7368.Serializer::class)
public sealed class InlineCustomerTaxExemptX8cad7368 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineCustomerTaxExemptX8cad7368() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCustomerTaxExemptX8cad7368() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlineCustomerTaxExemptX8cad7368() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerTaxExemptX8cad7368()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerTaxExemptX8cad7368 = when (value) {
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerTaxExemptX8cad7368> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerTaxExemptX8cad7368", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerTaxExemptX8cad7368 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerTaxExemptX8cad7368) {
      encoder.encodeString(value.value)
    }
  }
}
