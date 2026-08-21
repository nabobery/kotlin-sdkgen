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
 * www-form-urlencoded/schema/properties/off_session/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/off_session/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_off`.
   */
  public data object OneOff : InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2() {
    public override val `value`: String = "one_off"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2() {
    public override val `value`: String = "recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2 = when (value) {
      OneOff.value -> OneOff
      Recurring.value -> Recurring
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2) {
      encoder.encodeString(value.value)
    }
  }
}
