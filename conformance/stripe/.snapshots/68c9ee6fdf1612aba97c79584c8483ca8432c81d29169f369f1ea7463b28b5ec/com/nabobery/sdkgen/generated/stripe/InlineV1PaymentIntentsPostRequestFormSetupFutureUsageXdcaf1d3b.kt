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
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/setup_future_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/setup_future_usage
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b = when (value) {
      Value.value -> Value
      None.value -> None
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXdcaf1d3b) {
      encoder.encodeString(value.value)
    }
  }
}
