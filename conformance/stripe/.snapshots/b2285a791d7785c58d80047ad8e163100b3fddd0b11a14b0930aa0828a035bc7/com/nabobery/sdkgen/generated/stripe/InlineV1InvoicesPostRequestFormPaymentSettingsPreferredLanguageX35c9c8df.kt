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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0/properties/pr
 * eferred_language.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/bancontact/anyOf/0/properties/pr
 * eferred_language
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df() {
    public override val `value`: String = "nl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df = when (value) {
      De.value -> De
      En.value -> En
      Fr.value -> Fr
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPreferredLanguageX35c9c8df) {
      encoder.encodeString(value.value)
    }
  }
}
