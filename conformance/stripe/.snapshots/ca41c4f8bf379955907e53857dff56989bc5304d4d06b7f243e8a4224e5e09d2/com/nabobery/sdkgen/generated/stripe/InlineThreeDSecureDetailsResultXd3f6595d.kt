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
 * Indicates the outcome of 3D Secure authentication.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details/properties/result
 */
@Serializable(with = InlineThreeDSecureDetailsResultXd3f6595d.Serializer::class)
public sealed class InlineThreeDSecureDetailsResultXd3f6595d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `attempt_acknowledged`.
   */
  public data object AttemptAcknowledged : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "attempt_acknowledged"
  }

  /**
   * Documented value. Wire value: `authenticated`.
   */
  public data object Authenticated : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "authenticated"
  }

  /**
   * Documented value. Wire value: `exempted`.
   */
  public data object Exempted : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "exempted"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `not_supported`.
   */
  public data object NotSupported : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "not_supported"
  }

  /**
   * Documented value. Wire value: `processing_error`.
   */
  public data object ProcessingError : InlineThreeDSecureDetailsResultXd3f6595d() {
    public override val `value`: String = "processing_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsResultXd3f6595d()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsResultXd3f6595d = when (value) {
      AttemptAcknowledged.value -> AttemptAcknowledged
      Authenticated.value -> Authenticated
      Exempted.value -> Exempted
      Failed.value -> Failed
      NotSupported.value -> NotSupported
      ProcessingError.value -> ProcessingError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsResultXd3f6595d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsResultXd3f6595d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsResultXd3f6595d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsResultXd3f6595d) {
      encoder.encodeString(value.value)
    }
  }
}
