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
 * Status of this `id_number` check.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report/properties/status
 */
@Serializable(with = InlineGelatoIdNumberReportStatusX863e1cd8.Serializer::class)
public sealed class InlineGelatoIdNumberReportStatusX863e1cd8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unverified`.
   */
  public data object Unverified : InlineGelatoIdNumberReportStatusX863e1cd8() {
    public override val `value`: String = "unverified"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlineGelatoIdNumberReportStatusX863e1cd8() {
    public override val `value`: String = "verified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoIdNumberReportStatusX863e1cd8()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoIdNumberReportStatusX863e1cd8 = when (value) {
      Unverified.value -> Unverified
      Verified.value -> Verified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoIdNumberReportStatusX863e1cd8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoIdNumberReportStatusX863e1cd8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoIdNumberReportStatusX863e1cd8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoIdNumberReportStatusX863e1cd8) {
      encoder.encodeString(value.value)
    }
  }
}
