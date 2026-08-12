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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_type/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineBudgetBudgetTypeOneOf1X3e6c7951.Serializer::class)
public sealed class InlineBudgetBudgetTypeOneOf1X3e6c7951 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineBudgetBudgetTypeOneOf1X3e6c7951() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBudgetBudgetTypeOneOf1X3e6c7951()

  public companion object {
    public fun fromValue(`value`: String): InlineBudgetBudgetTypeOneOf1X3e6c7951 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBudgetBudgetTypeOneOf1X3e6c7951> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineBudgetBudgetTypeOneOf1X3e6c7951", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBudgetBudgetTypeOneOf1X3e6c7951 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBudgetBudgetTypeOneOf1X3e6c7951) {
      encoder.encodeString(value.value)
    }
  }
}
