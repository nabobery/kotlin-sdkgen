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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/au_becs_debit/anyOf/0/properties/setup_future
 * _usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/au_becs_debit/anyOf/0/properties/setup_future
 * _usage
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1 = when (value) {
      Value.value -> Value
      None.value -> None
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX798a46d1) {
      encoder.encodeString(value.value)
    }
  }
}
