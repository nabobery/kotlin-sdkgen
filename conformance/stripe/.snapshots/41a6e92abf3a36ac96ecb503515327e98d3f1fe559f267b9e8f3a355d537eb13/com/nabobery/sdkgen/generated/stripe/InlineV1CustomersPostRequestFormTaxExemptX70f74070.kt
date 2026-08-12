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
 * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/tax_exempt
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxExemptX70f74070.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormTaxExemptX70f74070 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormTaxExemptX70f74070() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineV1CustomersPostRequestFormTaxExemptX70f74070() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1CustomersPostRequestFormTaxExemptX70f74070() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlineV1CustomersPostRequestFormTaxExemptX70f74070() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormTaxExemptX70f74070()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormTaxExemptX70f74070 = when (value) {
      Value.value -> Value
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxExemptX70f74070> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormTaxExemptX70f74070", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxExemptX70f74070 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormTaxExemptX70f74070) {
      encoder.encodeString(value.value)
    }
  }
}
