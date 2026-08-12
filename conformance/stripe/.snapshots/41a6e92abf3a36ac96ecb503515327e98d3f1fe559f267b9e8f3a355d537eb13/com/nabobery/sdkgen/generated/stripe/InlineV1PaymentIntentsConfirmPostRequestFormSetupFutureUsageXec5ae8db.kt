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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/kr_card/anyOf/0/properties/setup_future_usage
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/kr_card/anyOf/0/properties/setup_future_usage
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db() {
    public override val `value`: String = "off_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db = when (value) {
      Value.value -> Value
      None.value -> None
      OffSession.value -> OffSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXec5ae8db) {
      encoder.encodeString(value.value)
    }
  }
}
