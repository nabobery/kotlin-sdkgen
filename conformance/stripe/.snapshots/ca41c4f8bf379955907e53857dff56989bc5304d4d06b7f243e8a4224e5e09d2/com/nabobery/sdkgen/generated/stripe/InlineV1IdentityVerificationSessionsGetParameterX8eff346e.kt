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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/get/parameters/8/schema
 */
@Serializable(with = InlineV1IdentityVerificationSessionsGetParameterX8eff346e.Serializer::class)
public sealed class InlineV1IdentityVerificationSessionsGetParameterX8eff346e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1IdentityVerificationSessionsGetParameterX8eff346e() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1IdentityVerificationSessionsGetParameterX8eff346e() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `requires_input`.
   */
  public data object RequiresInput : InlineV1IdentityVerificationSessionsGetParameterX8eff346e() {
    public override val `value`: String = "requires_input"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineV1IdentityVerificationSessionsGetParameterX8eff346e() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IdentityVerificationSessionsGetParameterX8eff346e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IdentityVerificationSessionsGetParameterX8eff346e = when (value) {
      Canceled.value -> Canceled
      Processing.value -> Processing
      RequiresInput.value -> RequiresInput
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsGetParameterX8eff346e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsGetParameterX8eff346e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsGetParameterX8eff346e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsGetParameterX8eff346e) {
      encoder.encodeString(value.value)
    }
  }
}
