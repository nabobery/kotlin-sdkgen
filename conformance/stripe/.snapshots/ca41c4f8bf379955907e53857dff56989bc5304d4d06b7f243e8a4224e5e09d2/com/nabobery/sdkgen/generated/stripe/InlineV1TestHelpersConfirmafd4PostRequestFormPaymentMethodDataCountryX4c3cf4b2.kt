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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/sofort/properties/country.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/sofort/properties/country
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `AT`.
   */
  public data object At : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "AT"
  }

  /**
   * Documented value. Wire value: `BE`.
   */
  public data object Be : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "BE"
  }

  /**
   * Documented value. Wire value: `DE`.
   */
  public data object De : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "DE"
  }

  /**
   * Documented value. Wire value: `ES`.
   */
  public data object Es : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "ES"
  }

  /**
   * Documented value. Wire value: `IT`.
   */
  public data object It : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "IT"
  }

  /**
   * Documented value. Wire value: `NL`.
   */
  public data object Nl : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2() {
    public override val `value`: String = "NL"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2 = when (value) {
      At.value -> At
      Be.value -> Be
      De.value -> De
      Es.value -> Es
      It.value -> It
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataCountryX4c3cf4b2) {
      encoder.encodeString(value.value)
    }
  }
}
