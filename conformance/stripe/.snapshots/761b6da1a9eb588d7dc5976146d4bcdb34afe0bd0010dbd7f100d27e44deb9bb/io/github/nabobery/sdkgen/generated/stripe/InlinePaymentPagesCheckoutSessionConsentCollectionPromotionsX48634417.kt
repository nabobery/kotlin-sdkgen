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
 * If set to `auto`, enables the collection of customer consent for promotional communications. The Checkout
 * Session will determine whether to display an option to opt into promotional communication
 * from the merchant depending on the customer's locale. Only available to US merchants and US customers.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_consent_collection/properties/promoti
 * ons
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417 = when (value) {
      Auto.value -> Auto
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionConsentCollectionPromotionsX48634417) {
      encoder.encodeString(value.value)
    }
  }
}
