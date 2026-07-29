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
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_type/oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_type/oneOf/2
 */
@Serializable(with = InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563.Serializer::class)
public sealed class InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf3Xd78c3563) {
      encoder.encodeString(value.value)
    }
  }
}
