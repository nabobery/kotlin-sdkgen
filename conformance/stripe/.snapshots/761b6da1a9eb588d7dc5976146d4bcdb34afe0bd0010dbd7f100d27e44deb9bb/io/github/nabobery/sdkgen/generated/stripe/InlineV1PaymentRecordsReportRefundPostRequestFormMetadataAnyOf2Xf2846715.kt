package io.github.nabobery.sdkgen.generated.stripe

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
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_refund/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715.Serializer::class)
public sealed class InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715) {
      encoder.encodeString(value.value)
    }
  }
}
