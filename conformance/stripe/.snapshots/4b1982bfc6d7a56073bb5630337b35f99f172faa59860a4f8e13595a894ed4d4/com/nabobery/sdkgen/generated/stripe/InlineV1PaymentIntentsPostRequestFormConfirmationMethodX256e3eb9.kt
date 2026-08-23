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
 * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm the
 * payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/confirmation_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9 = when (value) {
      Automatic.value -> Automatic
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormConfirmationMethodX256e3eb9) {
      encoder.encodeString(value.value)
    }
  }
}
