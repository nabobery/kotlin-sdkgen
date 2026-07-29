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
 * Source: sdkgen://source/openapi.json#/components/schemas/identity.verification_report/properties/object
 */
@Serializable(with = InlineIdentityVerificationReportObjectValueXbd208f05.Serializer::class)
public sealed class InlineIdentityVerificationReportObjectValueXbd208f05 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `identity.verification_report`.
   */
  public data object IdentityVerificationReport : InlineIdentityVerificationReportObjectValueXbd208f05() {
    public override val `value`: String = "identity.verification_report"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIdentityVerificationReportObjectValueXbd208f05()

  public companion object {
    public fun fromValue(`value`: String): InlineIdentityVerificationReportObjectValueXbd208f05 = when (value) {
      IdentityVerificationReport.value -> IdentityVerificationReport
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIdentityVerificationReportObjectValueXbd208f05> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIdentityVerificationReportObjectValueXbd208f05", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationReportObjectValueXbd208f05 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationReportObjectValueXbd208f05) {
      encoder.encodeString(value.value)
    }
  }
}
