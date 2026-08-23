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
 * sdkgen://source/openapi.yaml#/components/schemas/get-budget/properties/budget_type/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/get-budget/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineGetBudgetBudgetTypeOneOf2X0248c100.Serializer::class)
public sealed class InlineGetBudgetBudgetTypeOneOf2X0248c100 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineGetBudgetBudgetTypeOneOf2X0248c100() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGetBudgetBudgetTypeOneOf2X0248c100()

  public companion object {
    public fun fromValue(`value`: String): InlineGetBudgetBudgetTypeOneOf2X0248c100 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGetBudgetBudgetTypeOneOf2X0248c100> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGetBudgetBudgetTypeOneOf2X0248c100", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGetBudgetBudgetTypeOneOf2X0248c100 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGetBudgetBudgetTypeOneOf2X0248c100) {
      encoder.encodeString(value.value)
    }
  }
}
