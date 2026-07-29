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
 * The type of [verification check](https://docs.stripe.com/identity/verification-checks) to be performed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/type
 */
@Serializable(with = InlineIdentityVerificationSessionTypeXa9d242aa.Serializer::class)
public sealed class InlineIdentityVerificationSessionTypeXa9d242aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document`.
   */
  public data object Document : InlineIdentityVerificationSessionTypeXa9d242aa() {
    public override val `value`: String = "document"
  }

  /**
   * Documented value. Wire value: `id_number`.
   */
  public data object IdNumber : InlineIdentityVerificationSessionTypeXa9d242aa() {
    public override val `value`: String = "id_number"
  }

  /**
   * Documented value. Wire value: `verification_flow`.
   */
  public data object VerificationFlow : InlineIdentityVerificationSessionTypeXa9d242aa() {
    public override val `value`: String = "verification_flow"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIdentityVerificationSessionTypeXa9d242aa()

  public companion object {
    public fun fromValue(`value`: String): InlineIdentityVerificationSessionTypeXa9d242aa = when (value) {
      Document.value -> Document
      IdNumber.value -> IdNumber
      VerificationFlow.value -> VerificationFlow
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIdentityVerificationSessionTypeXa9d242aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIdentityVerificationSessionTypeXa9d242aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionTypeXa9d242aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionTypeXa9d242aa) {
      encoder.encodeString(value.value)
    }
  }
}
