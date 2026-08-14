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
 * sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_rejection_reasons/properties/card_log
 * o/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_rejection_reasons/properties/card_log
 * o/items
 */
@Serializable(with = InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81.Serializer::class)
public sealed class InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `geographic_location`.
   */
  public data object GeographicLocation : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "geographic_location"
  }

  /**
   * Documented value. Wire value: `inappropriate`.
   */
  public data object Inappropriate : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "inappropriate"
  }

  /**
   * Documented value. Wire value: `network_name`.
   */
  public data object NetworkName : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "network_name"
  }

  /**
   * Documented value. Wire value: `non_binary_image`.
   */
  public data object NonBinaryImage : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "non_binary_image"
  }

  /**
   * Documented value. Wire value: `non_fiat_currency`.
   */
  public data object NonFiatCurrency : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "non_fiat_currency"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `other_entity`.
   */
  public data object OtherEntity : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "other_entity"
  }

  /**
   * Documented value. Wire value: `promotional_material`.
   */
  public data object PromotionalMaterial : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81() {
    public override val `value`: String = "promotional_material"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81 = when (value) {
      GeographicLocation.value -> GeographicLocation
      Inappropriate.value -> Inappropriate
      NetworkName.value -> NetworkName
      NonBinaryImage.value -> NonBinaryImage
      NonFiatCurrency.value -> NonFiatCurrency
      Other.value -> Other
      OtherEntity.value -> OtherEntity
      PromotionalMaterial.value -> PromotionalMaterial
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignRejectionReasonsCardLogoItemX079b6a81) {
      encoder.encodeString(value.value)
    }
  }
}
