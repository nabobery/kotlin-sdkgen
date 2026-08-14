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
 * /content/application~1json/schema/properties/budget_type/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7.Serializer::class)
public sealed class InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7 = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPatchRequestJsonBudgetTypeOneOf2Xa5ba15d7) {
      encoder.encodeString(value.value)
    }
  }
}
