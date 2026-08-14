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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1personalization_designs~1{personalization_design}~1r
 * eject/post/requestBody/content/application~1x-www-form-urlencoded/schema/properties/rejection_reasons/properties/card
 * _logo/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1personalization_designs~1{personalization_design}~1r
 * eject/post/requestBody/content/application~1x-www-form-urlencoded/schema/properties/rejection_reasons/properties/card
 * _logo/items
 */
@Serializable(with = InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300.Serializer::class)
public sealed class InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `geographic_location`.
   */
  public data object GeographicLocation : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "geographic_location"
  }

  /**
   * Documented value. Wire value: `inappropriate`.
   */
  public data object Inappropriate : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "inappropriate"
  }

  /**
   * Documented value. Wire value: `network_name`.
   */
  public data object NetworkName : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "network_name"
  }

  /**
   * Documented value. Wire value: `non_binary_image`.
   */
  public data object NonBinaryImage : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "non_binary_image"
  }

  /**
   * Documented value. Wire value: `non_fiat_currency`.
   */
  public data object NonFiatCurrency : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "non_fiat_currency"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `other_entity`.
   */
  public data object OtherEntity : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "other_entity"
  }

  /**
   * Documented value. Wire value: `promotional_material`.
   */
  public data object PromotionalMaterial : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300() {
    public override val `value`: String = "promotional_material"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300 = when (value) {
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

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsItemXd1d24300) {
      encoder.encodeString(value.value)
    }
  }
}
