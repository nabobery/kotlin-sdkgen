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
 * If set to `auto`, enables the collection of customer consent for promotional communications.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_links_resource_consent_collection/properties/promotions
 */
@Serializable(with = InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65.Serializer::class)
public sealed class InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65 = when (value) {
      Auto.value -> Auto
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceConsentCollectionPromotionsXcf01fe65) {
      encoder.encodeString(value.value)
    }
  }
}
