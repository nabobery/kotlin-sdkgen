package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/verification_method
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3 = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormVerificationMethodX8e8b6da3) {
      encoder.encodeString(value.value)
    }
  }
}
