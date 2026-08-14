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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/properties/verification_method
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d) {
      encoder.encodeString(value.value)
    }
  }
}
