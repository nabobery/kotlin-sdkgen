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
 * sdkgen://source/openapi.yaml#/components/schemas/get-budget/properties/budget_type/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get-budget/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineGetBudgetBudgetTypeOneOf1X2fba8757.Serializer::class)
public sealed class InlineGetBudgetBudgetTypeOneOf1X2fba8757 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineGetBudgetBudgetTypeOneOf1X2fba8757() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGetBudgetBudgetTypeOneOf1X2fba8757()

  public companion object {
    public fun fromValue(`value`: String): InlineGetBudgetBudgetTypeOneOf1X2fba8757 = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGetBudgetBudgetTypeOneOf1X2fba8757> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGetBudgetBudgetTypeOneOf1X2fba8757", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGetBudgetBudgetTypeOneOf1X2fba8757 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGetBudgetBudgetTypeOneOf1X2fba8757) {
      encoder.encodeString(value.value)
    }
  }
}
