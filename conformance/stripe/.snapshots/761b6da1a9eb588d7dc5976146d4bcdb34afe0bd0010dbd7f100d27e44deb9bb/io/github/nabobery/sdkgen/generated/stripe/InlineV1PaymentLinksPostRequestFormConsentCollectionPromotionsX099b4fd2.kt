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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/promotions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/consent_collection/properties/promotions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2 = when (value) {
      Auto.value -> Auto
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormConsentCollectionPromotionsX099b4fd2) {
      encoder.encodeString(value.value)
    }
  }
}
