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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/acss_debit/properties/verification_method
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormVerificationMethodX2b15ef69) {
      encoder.encodeString(value.value)
    }
  }
}
