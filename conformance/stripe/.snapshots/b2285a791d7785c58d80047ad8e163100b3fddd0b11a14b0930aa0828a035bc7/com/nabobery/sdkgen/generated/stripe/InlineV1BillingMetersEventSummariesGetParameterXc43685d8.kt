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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters~1{id}~1event_summaries/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters~1{id}~1event_summaries/get/parameters/8/schema
 */
@Serializable(with = InlineV1BillingMetersEventSummariesGetParameterXc43685d8.Serializer::class)
public sealed class InlineV1BillingMetersEventSummariesGetParameterXc43685d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1BillingMetersEventSummariesGetParameterXc43685d8() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `hour`.
   */
  public data object Hour : InlineV1BillingMetersEventSummariesGetParameterXc43685d8() {
    public override val `value`: String = "hour"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingMetersEventSummariesGetParameterXc43685d8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingMetersEventSummariesGetParameterXc43685d8 = when (value) {
      Day.value -> Day
      Hour.value -> Hour
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingMetersEventSummariesGetParameterXc43685d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersEventSummariesGetParameterXc43685d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersEventSummariesGetParameterXc43685d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersEventSummariesGetParameterXc43685d8) {
      encoder.encodeString(value.value)
    }
  }
}
