package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_type/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372.Serializer::class)
public sealed class InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372()

  public companion object {
    public fun fromValue(`value`: String): InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCreateBudgetBudgetBudgetTypeOneOf2Xe935b372) {
      encoder.encodeString(value.value)
    }
  }
}
