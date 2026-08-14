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
 * The customer's tax exemption. One of `none`, `exempt`, or `reverse`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/tax_exempt
 */
@Serializable(with = InlineV1CustomersPostRequestFormTaxExemptX72a48ffa.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormTaxExemptX72a48ffa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersPostRequestFormTaxExemptX72a48ffa() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlineV1CustomersPostRequestFormTaxExemptX72a48ffa() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1CustomersPostRequestFormTaxExemptX72a48ffa() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlineV1CustomersPostRequestFormTaxExemptX72a48ffa() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormTaxExemptX72a48ffa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormTaxExemptX72a48ffa = when (value) {
      Value.value -> Value
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormTaxExemptX72a48ffa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormTaxExemptX72a48ffa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormTaxExemptX72a48ffa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormTaxExemptX72a48ffa) {
      encoder.encodeString(value.value)
    }
  }
}
