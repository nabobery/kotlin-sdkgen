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
 * Status of this VerificationSession. [Learn more about the lifecycle of
 * sessions](https://docs.stripe.com/identity/how-sessions-work).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/status
 */
@Serializable(with = InlineIdentityVerificationSessionStatusX3fc36178.Serializer::class)
public sealed class InlineIdentityVerificationSessionStatusX3fc36178 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineIdentityVerificationSessionStatusX3fc36178() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineIdentityVerificationSessionStatusX3fc36178() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `requires_input`.
   */
  public data object RequiresInput : InlineIdentityVerificationSessionStatusX3fc36178() {
    public override val `value`: String = "requires_input"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineIdentityVerificationSessionStatusX3fc36178() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIdentityVerificationSessionStatusX3fc36178()

  public companion object {
    public fun fromValue(`value`: String): InlineIdentityVerificationSessionStatusX3fc36178 = when (value) {
      Canceled.value -> Canceled
      Processing.value -> Processing
      RequiresInput.value -> RequiresInput
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionStatusX3fc36178> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIdentityVerificationSessionStatusX3fc36178", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionStatusX3fc36178 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionStatusX3fc36178) {
      encoder.encodeString(value.value)
    }
  }
}
