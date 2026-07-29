package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_type/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineBudgetBudgetTypeOneOf2X66a1f7a5.Serializer::class)
public sealed class InlineBudgetBudgetTypeOneOf2X66a1f7a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineBudgetBudgetTypeOneOf2X66a1f7a5() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBudgetBudgetTypeOneOf2X66a1f7a5()

  public companion object {
    public fun fromValue(`value`: String): InlineBudgetBudgetTypeOneOf2X66a1f7a5 = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBudgetBudgetTypeOneOf2X66a1f7a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineBudgetBudgetTypeOneOf2X66a1f7a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBudgetBudgetTypeOneOf2X66a1f7a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBudgetBudgetTypeOneOf2X66a1f7a5) {
      encoder.encodeString(value.value)
    }
  }
}
