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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/processor_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/processor_details/properties/type
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839.Serializer::class)
public sealed class InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839 = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportRefundPostRequestFormProcessorDetailsTypeXb7422839) {
      encoder.encodeString(value.value)
    }
  }
}
