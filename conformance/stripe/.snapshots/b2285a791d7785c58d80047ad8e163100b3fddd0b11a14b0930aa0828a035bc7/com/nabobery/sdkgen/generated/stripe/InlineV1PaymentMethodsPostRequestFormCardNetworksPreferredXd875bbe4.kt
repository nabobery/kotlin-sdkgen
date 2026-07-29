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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/card/properties/networks/properties/preferred.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/card/properties/networks/properties/preferred
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4 = when (value) {
      Value.value -> Value
      CartesBancaires.value -> CartesBancaires
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCardNetworksPreferredXd875bbe4) {
      encoder.encodeString(value.value)
    }
  }
}
