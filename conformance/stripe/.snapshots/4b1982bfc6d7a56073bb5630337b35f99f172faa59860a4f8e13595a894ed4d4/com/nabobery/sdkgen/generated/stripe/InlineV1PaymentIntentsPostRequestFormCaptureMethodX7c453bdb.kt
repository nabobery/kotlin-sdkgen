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
 * Controls when the funds will be captured from the customer's account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/capture_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `automatic_async`.
   */
  public data object AutomaticAsync : InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb() {
    public override val `value`: String = "automatic_async"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb = when (value) {
      Automatic.value -> Automatic
      AutomaticAsync.value -> AutomaticAsync
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormCaptureMethodX7c453bdb) {
      encoder.encodeString(value.value)
    }
  }
}
