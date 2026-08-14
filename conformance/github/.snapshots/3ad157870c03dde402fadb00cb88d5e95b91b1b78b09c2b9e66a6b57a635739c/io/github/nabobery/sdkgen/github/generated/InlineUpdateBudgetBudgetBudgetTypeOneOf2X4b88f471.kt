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
 * sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_type/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471.Serializer::class)
public sealed class InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471()

  public companion object {
    public fun fromValue(`value`: String): InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUpdateBudgetBudgetBudgetTypeOneOf2X4b88f471) {
      encoder.encodeString(value.value)
    }
  }
}
