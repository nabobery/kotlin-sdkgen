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
 * ed/schema/properties/shipping_cost/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/shipping_cost/properties/tax_behavior
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6.Serializer::class)
public sealed class InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6() {
    public override val `value`: String = "inclusive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShippingCostTaxBehaviorX0846c4d6) {
      encoder.encodeString(value.value)
    }
  }
}
