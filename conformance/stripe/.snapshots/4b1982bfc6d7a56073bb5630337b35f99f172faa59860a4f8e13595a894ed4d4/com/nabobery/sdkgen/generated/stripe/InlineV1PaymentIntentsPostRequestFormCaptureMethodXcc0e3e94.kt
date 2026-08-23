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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/capture_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `automatic_async`.
   */
  public data object AutomaticAsync : InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94() {
    public override val `value`: String = "automatic_async"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94 = when (value) {
      Automatic.value -> Automatic
      AutomaticAsync.value -> AutomaticAsync
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormCaptureMethodXcc0e3e94) {
      encoder.encodeString(value.value)
    }
  }
}
