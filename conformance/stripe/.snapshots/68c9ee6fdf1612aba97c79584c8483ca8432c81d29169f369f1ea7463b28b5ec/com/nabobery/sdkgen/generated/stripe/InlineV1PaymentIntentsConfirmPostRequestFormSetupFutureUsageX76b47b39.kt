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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bancontact/anyOf/0/properties/setup_future_us
 * age.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/bancontact/anyOf/0/properties/setup_future_us
 * age
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39() {
    public override val `value`: String = "off_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39 = when (value) {
      Value.value -> Value
      None.value -> None
      OffSession.value -> OffSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX76b47b39) {
      encoder.encodeString(value.value)
    }
  }
}
