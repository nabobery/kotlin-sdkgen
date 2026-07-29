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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/ares_trans_status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/three_d_secure/proper
 * ties/ares_trans_status
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `A`.
   */
  public data object A : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "A"
  }

  /**
   * Documented value. Wire value: `C`.
   */
  public data object C : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "C"
  }

  /**
   * Documented value. Wire value: `I`.
   */
  public data object I : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "I"
  }

  /**
   * Documented value. Wire value: `N`.
   */
  public data object N : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "N"
  }

  /**
   * Documented value. Wire value: `R`.
   */
  public data object R : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "R"
  }

  /**
   * Documented value. Wire value: `U`.
   */
  public data object U : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "U"
  }

  /**
   * Documented value. Wire value: `Y`.
   */
  public data object Y : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d() {
    public override val `value`: String = "Y"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d = when (value) {
      A.value -> A
      C.value -> C
      I.value -> I
      N.value -> N
      R.value -> R
      U.value -> U
      Y.value -> Y
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAresTransStatusX84aa416d) {
      encoder.encodeString(value.value)
    }
  }
}
