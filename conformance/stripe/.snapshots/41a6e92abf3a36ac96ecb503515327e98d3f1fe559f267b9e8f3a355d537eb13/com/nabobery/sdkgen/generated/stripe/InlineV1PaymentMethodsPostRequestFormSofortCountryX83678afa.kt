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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/sofort/properties/country.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/sofort/properties/country
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `AT`.
   */
  public data object At : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "AT"
  }

  /**
   * Documented value. Wire value: `BE`.
   */
  public data object Be : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "BE"
  }

  /**
   * Documented value. Wire value: `DE`.
   */
  public data object De : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "DE"
  }

  /**
   * Documented value. Wire value: `ES`.
   */
  public data object Es : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "ES"
  }

  /**
   * Documented value. Wire value: `IT`.
   */
  public data object It : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "IT"
  }

  /**
   * Documented value. Wire value: `NL`.
   */
  public data object Nl : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa() {
    public override val `value`: String = "NL"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa = when (value) {
      At.value -> At
      Be.value -> Be
      De.value -> De
      Es.value -> Es
      It.value -> It
      Nl.value -> Nl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormSofortCountryX83678afa) {
      encoder.encodeString(value.value)
    }
  }
}
