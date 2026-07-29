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
 * Status of this `selfie` check.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_selfie_report/properties/status
 */
@Serializable(with = InlineGelatoSelfieReportStatusX07703f81.Serializer::class)
public sealed class InlineGelatoSelfieReportStatusX07703f81 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unverified`.
   */
  public data object Unverified : InlineGelatoSelfieReportStatusX07703f81() {
    public override val `value`: String = "unverified"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineGelatoSelfieReportStatusX07703f81() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSelfieReportStatusX07703f81()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSelfieReportStatusX07703f81 = when (value) {
      Unverified.value -> Unverified
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoSelfieReportStatusX07703f81> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoSelfieReportStatusX07703f81", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSelfieReportStatusX07703f81 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSelfieReportStatusX07703f81) {
      encoder.encodeString(value.value)
    }
  }
}
