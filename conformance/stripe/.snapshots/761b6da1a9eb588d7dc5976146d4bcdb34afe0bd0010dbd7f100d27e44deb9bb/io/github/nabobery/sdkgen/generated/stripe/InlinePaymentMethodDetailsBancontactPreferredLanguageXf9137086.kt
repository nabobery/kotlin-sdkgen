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
 * Preferred language of the Bancontact authorization page that the customer is redirected to.
 * Can be one of `en`, `de`, `fr`, or `nl`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_bancontact/properties/preferred_language
 */
@Serializable(with = InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086.Serializer::class)
public sealed class InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086() {
    public override val `value`: String = "nl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086 = when (value) {
      De.value -> De
      En.value -> En
      Fr.value -> Fr
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsBancontactPreferredLanguageXf9137086) {
      encoder.encodeString(value.value)
    }
  }
}
