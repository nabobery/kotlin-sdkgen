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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_type/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b.Serializer::class)
public sealed class InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b()

  public companion object {
    public fun fromValue(`value`: String): InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUpdateBudgetBudgetBudgetTypeOneOf1Xc9cb4a2b) {
      encoder.encodeString(value.value)
    }
  }
}
