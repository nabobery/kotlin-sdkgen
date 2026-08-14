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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/type
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed_amount`.
   */
  public data object FixedAmount : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2() {
    public override val `value`: String = "fixed_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2 = when (value) {
      FixedAmount.value -> FixedAmount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2) {
      encoder.encodeString(value.value)
    }
  }
}
