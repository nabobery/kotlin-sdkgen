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
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_type/oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_type/oneOf/2
 */
@Serializable(with = InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59.Serializer::class)
public sealed class InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `SkuPricing`.
   */
  public data object SkuPricing : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59() {
    public override val `value`: String = "SkuPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59 = when (value) {
      SkuPricing.value -> SkuPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf3X005b0a59) {
      encoder.encodeString(value.value)
    }
  }
}
