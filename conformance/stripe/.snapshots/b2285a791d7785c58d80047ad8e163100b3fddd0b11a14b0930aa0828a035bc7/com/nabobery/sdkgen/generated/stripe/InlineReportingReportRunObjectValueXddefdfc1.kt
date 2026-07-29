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
 * Source: sdkgen://source/openapi.json#/components/schemas/reporting.report_run/properties/object
 */
@Serializable(with = InlineReportingReportRunObjectValueXddefdfc1.Serializer::class)
public sealed class InlineReportingReportRunObjectValueXddefdfc1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reporting.report_run`.
   */
  public data object ReportingReportRun : InlineReportingReportRunObjectValueXddefdfc1() {
    public override val `value`: String = "reporting.report_run"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReportingReportRunObjectValueXddefdfc1()

  public companion object {
    public fun fromValue(`value`: String): InlineReportingReportRunObjectValueXddefdfc1 = when (value) {
      ReportingReportRun.value -> ReportingReportRun
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReportingReportRunObjectValueXddefdfc1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineReportingReportRunObjectValueXddefdfc1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReportingReportRunObjectValueXddefdfc1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReportingReportRunObjectValueXddefdfc1) {
      encoder.encodeString(value.value)
    }
  }
}
