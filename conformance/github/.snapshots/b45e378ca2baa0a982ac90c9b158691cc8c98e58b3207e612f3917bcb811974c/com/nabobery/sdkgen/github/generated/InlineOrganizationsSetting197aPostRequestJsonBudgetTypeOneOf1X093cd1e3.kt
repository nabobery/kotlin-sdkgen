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
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_type/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3.Serializer::class)
public sealed class InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `BundlePricing`.
   */
  public data object BundlePricing : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3() {
    public override val `value`: String = "BundlePricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3 = when (value) {
      BundlePricing.value -> BundlePricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf1X093cd1e3) {
      encoder.encodeString(value.value)
    }
  }
}
