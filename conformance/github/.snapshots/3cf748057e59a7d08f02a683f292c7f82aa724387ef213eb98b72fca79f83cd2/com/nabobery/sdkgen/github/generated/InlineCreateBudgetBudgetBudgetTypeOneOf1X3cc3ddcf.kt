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
 * sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_type/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf.Serializer::class)
public sealed class InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf()

  public companion object {
    public fun fromValue(`value`: String): InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreateBudgetBudgetBudgetTypeOneOf1X3cc3ddcf) {
      encoder.encodeString(value.value)
    }
  }
}
