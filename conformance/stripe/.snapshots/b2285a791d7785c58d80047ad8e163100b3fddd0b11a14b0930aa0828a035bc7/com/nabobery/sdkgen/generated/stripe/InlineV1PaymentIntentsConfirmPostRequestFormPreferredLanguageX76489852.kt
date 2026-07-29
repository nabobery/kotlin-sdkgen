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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0/properties/preferred_language.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sofort/anyOf/0/properties/preferred_language
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `es`.
   */
  public data object Es : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "es"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `it`.
   */
  public data object It : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "it"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "nl"
  }

  /**
   * Documented value. Wire value: `pl`.
   */
  public data object Pl : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852() {
    public override val `value`: String = "pl"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852 = when (value) {
      Value.value -> Value
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

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPreferredLanguageX76489852) {
      encoder.encodeString(value.value)
    }
  }
}
