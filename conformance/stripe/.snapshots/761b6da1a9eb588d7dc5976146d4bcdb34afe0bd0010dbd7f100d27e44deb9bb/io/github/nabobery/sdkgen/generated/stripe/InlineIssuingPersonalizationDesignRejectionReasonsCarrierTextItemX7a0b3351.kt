package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_rejection_reasons/properties/carrier_
 * text/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_rejection_reasons/properties/carrier_
 * text/items
 */
@Serializable(with = InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351.Serializer::class)
public sealed class InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `geographic_location`.
   */
  public data object GeographicLocation : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "geographic_location"
  }

  /**
   * Documented value. Wire value: `inappropriate`.
   */
  public data object Inappropriate : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "inappropriate"
  }

  /**
   * Documented value. Wire value: `network_name`.
   */
  public data object NetworkName : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "network_name"
  }

  /**
   * Documented value. Wire value: `non_fiat_currency`.
   */
  public data object NonFiatCurrency : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "non_fiat_currency"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `other_entity`.
   */
  public data object OtherEntity : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "other_entity"
  }

  /**
   * Documented value. Wire value: `promotional_material`.
   */
  public data object PromotionalMaterial : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351() {
    public override val `value`: String = "promotional_material"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351 = when (value) {
      GeographicLocation.value -> GeographicLocation
      Inappropriate.value -> Inappropriate
      NetworkName.value -> NetworkName
      NonFiatCurrency.value -> NonFiatCurrency
      Other.value -> Other
      OtherEntity.value -> OtherEntity
      PromotionalMaterial.value -> PromotionalMaterial
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignRejectionReasonsCarrierTextItemX7a0b3351) {
      encoder.encodeString(value.value)
    }
  }
}
