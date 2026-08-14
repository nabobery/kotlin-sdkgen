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
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_type/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_type/oneOf/0
 */
@Serializable(with = InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df.Serializer::class)
public sealed class InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `BundlePricing`.
   */
  public data object BundlePricing : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df() {
    public override val `value`: String = "BundlePricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df = when (value) {
      BundlePricing.value -> BundlePricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf1X99aa54df) {
      encoder.encodeString(value.value)
    }
  }
}
