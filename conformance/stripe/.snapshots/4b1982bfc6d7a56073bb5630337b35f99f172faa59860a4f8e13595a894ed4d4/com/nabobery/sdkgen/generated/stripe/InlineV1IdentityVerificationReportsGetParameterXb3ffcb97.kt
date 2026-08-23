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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_reports/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_reports/get/parameters/6/schema
 */
@Serializable(with = InlineV1IdentityVerificationReportsGetParameterXb3ffcb97.Serializer::class)
public sealed class InlineV1IdentityVerificationReportsGetParameterXb3ffcb97 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document`.
   */
  public data object Document : InlineV1IdentityVerificationReportsGetParameterXb3ffcb97() {
    public override val `value`: String = "document"
  }

  /**
   * Documented value. Wire value: `id_number`.
   */
  public data object IdNumber : InlineV1IdentityVerificationReportsGetParameterXb3ffcb97() {
    public override val `value`: String = "id_number"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IdentityVerificationReportsGetParameterXb3ffcb97()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IdentityVerificationReportsGetParameterXb3ffcb97 = when (value) {
      Document.value -> Document
      IdNumber.value -> IdNumber
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationReportsGetParameterXb3ffcb97> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationReportsGetParameterXb3ffcb97", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationReportsGetParameterXb3ffcb97 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationReportsGetParameterXb3ffcb97) {
      encoder.encodeString(value.value)
    }
  }
}
