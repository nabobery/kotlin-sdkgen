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
 * Preferred language of the SOFORT authorization page that the customer is redirected to. Can be one of `de`, `en`,
 * `es`, `fr`, `it`, `nl`, or `pl`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_sofort/properties/preferred_la
 * nguage
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7.Serializer::class)
public sealed class InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `es`.
   */
  public data object Es : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "es"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `it`.
   */
  public data object It : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "it"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "nl"
  }

  /**
   * Documented value. Wire value: `pl`.
   */
  public data object Pl : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7() {
    public override val `value`: String = "pl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7 = when (value) {
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

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordSofortPreferredLanguageXb5e07cc7) {
      encoder.encodeString(value.value)
    }
  }
}
