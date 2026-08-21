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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/get/responses/200/content/application~1json/schema/p
 * roperties/object
 */
@Serializable(with = InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4.Serializer::class)
public sealed class InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ReportingReportRunsGetResponse200JsonObjectValueX146547c4) {
      encoder.encodeString(value.value)
    }
  }
}
