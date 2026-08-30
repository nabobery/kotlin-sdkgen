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
 * Status of this `phone` check.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_phone_report/properties/status
 */
@Serializable(with = InlineGelatoPhoneReportStatusX57a0ae0c.Serializer::class)
public sealed class InlineGelatoPhoneReportStatusX57a0ae0c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unverified`.
   */
  public data object Unverified : InlineGelatoPhoneReportStatusX57a0ae0c() {
    public override val `value`: String = "unverified"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineGelatoPhoneReportStatusX57a0ae0c() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoPhoneReportStatusX57a0ae0c()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoPhoneReportStatusX57a0ae0c = when (value) {
      Unverified.value -> Unverified
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoPhoneReportStatusX57a0ae0c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoPhoneReportStatusX57a0ae0c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoPhoneReportStatusX57a0ae0c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoPhoneReportStatusX57a0ae0c) {
      encoder.encodeString(value.value)
    }
  }
}
