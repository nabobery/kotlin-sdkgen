package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Preferred language of the SOFORT authorization page that the customer is redirected to.
 * Can be one of `de`, `en`, `es`, `fr`, `it`, `nl`, or `pl`
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_sofort/properties/preferred_language
 */
@Serializable(with = InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254.Serializer::class)
public sealed class InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `es`.
   */
  public data object Es : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "es"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `it`.
   */
  public data object It : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "it"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "nl"
  }

  /**
   * Documented value. Wire value: `pl`.
   */
  public data object Pl : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254() {
    public override val `value`: String = "pl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254 = when (value) {
      De.value -> De
      En.value -> En
      Es.value -> Es
      Fr.value -> Fr
      It.value -> It
      Nl.value -> Nl
      Pl.value -> Pl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsSofortPreferredLanguageX6c742254) {
      encoder.encodeString(value.value)
    }
  }
}
