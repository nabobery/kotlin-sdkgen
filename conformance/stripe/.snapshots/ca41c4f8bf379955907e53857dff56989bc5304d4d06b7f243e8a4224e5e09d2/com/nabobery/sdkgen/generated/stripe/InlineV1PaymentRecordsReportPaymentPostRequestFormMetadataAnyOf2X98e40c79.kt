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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79.Serializer::class)
public sealed class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79) {
      encoder.encodeString(value.value)
    }
  }
}
