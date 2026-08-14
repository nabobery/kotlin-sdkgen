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
 * Indicates the outcome of 3D Secure authentication.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/result
 */
@Serializable(with = InlineThreeDSecureDetailsChargeResultX2295bf98.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeResultX2295bf98 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attempt_acknowledged`.
   */
  public data object AttemptAcknowledged : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "attempt_acknowledged"
  }

  /**
   * Documented value. Wire value: `authenticated`.
   */
  public data object Authenticated : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "authenticated"
  }

  /**
   * Documented value. Wire value: `exempted`.
   */
  public data object Exempted : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "exempted"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `not_supported`.
   */
  public data object NotSupported : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "not_supported"
  }

  /**
   * Documented value. Wire value: `processing_error`.
   */
  public data object ProcessingError : InlineThreeDSecureDetailsChargeResultX2295bf98() {
    public override val `value`: String = "processing_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsChargeResultX2295bf98()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeResultX2295bf98 = when (value) {
      AttemptAcknowledged.value -> AttemptAcknowledged
      Authenticated.value -> Authenticated
      Exempted.value -> Exempted
      Failed.value -> Failed
      NotSupported.value -> NotSupported
      ProcessingError.value -> ProcessingError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsChargeResultX2295bf98> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeResultX2295bf98", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsChargeResultX2295bf98 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsChargeResultX2295bf98) {
      encoder.encodeString(value.value)
    }
  }
}
