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
 * cation~1json/schema/properties/budget_type/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_type/oneOf/1
 */
@Serializable(with = InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae.Serializer::class)
public sealed class InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ProductPricing`.
   */
  public data object ProductPricing : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae() {
    public override val `value`: String = "ProductPricing"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae()

  public companion object {
    public fun fromValue(`value`: String): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae = when (value) {
      ProductPricing.value -> ProductPricing
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSetting197aPostRequestJsonBudgetTypeOneOf2X8697f6ae) {
      encoder.encodeString(value.value)
    }
  }
}
