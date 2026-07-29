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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/object
 */
@Serializable(with = InlineIdentityVerificationSessionObjectValueX913fcef9.Serializer::class)
public sealed class InlineIdentityVerificationSessionObjectValueX913fcef9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `identity.verification_session`.
   */
  public data object IdentityVerificationSession : InlineIdentityVerificationSessionObjectValueX913fcef9() {
    public override val `value`: String = "identity.verification_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIdentityVerificationSessionObjectValueX913fcef9()

  public companion object {
    public fun fromValue(`value`: String): InlineIdentityVerificationSessionObjectValueX913fcef9 = when (value) {
      IdentityVerificationSession.value -> IdentityVerificationSession
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIdentityVerificationSessionObjectValueX913fcef9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIdentityVerificationSessionObjectValueX913fcef9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionObjectValueX913fcef9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionObjectValueX913fcef9) {
      encoder.encodeString(value.value)
    }
  }
}
