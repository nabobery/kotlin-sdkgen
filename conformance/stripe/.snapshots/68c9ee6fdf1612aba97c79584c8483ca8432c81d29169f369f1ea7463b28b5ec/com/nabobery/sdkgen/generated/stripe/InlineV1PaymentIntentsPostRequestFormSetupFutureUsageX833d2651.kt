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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto/anyOf/0/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/boleto/anyOf/0/properties/setup_future_usage
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651 = when (value) {
      Value.value -> Value
      None.value -> None
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX833d2651) {
      encoder.encodeString(value.value)
    }
  }
}
