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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sofort/properties/country.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/sofort/properties/country
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `AT`.
   */
  public data object At : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "AT"
  }

  /**
   * Documented value. Wire value: `BE`.
   */
  public data object Be : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "BE"
  }

  /**
   * Documented value. Wire value: `DE`.
   */
  public data object De : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "DE"
  }

  /**
   * Documented value. Wire value: `ES`.
   */
  public data object Es : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "ES"
  }

  /**
   * Documented value. Wire value: `IT`.
   */
  public data object It : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "IT"
  }

  /**
   * Documented value. Wire value: `NL`.
   */
  public data object Nl : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc() {
    public override val `value`: String = "NL"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc = when (value) {
      At.value -> At
      Be.value -> Be
      De.value -> De
      Es.value -> Es
      It.value -> It
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortCountryX89d7b2bc) {
      encoder.encodeString(value.value)
    }
  }
}
