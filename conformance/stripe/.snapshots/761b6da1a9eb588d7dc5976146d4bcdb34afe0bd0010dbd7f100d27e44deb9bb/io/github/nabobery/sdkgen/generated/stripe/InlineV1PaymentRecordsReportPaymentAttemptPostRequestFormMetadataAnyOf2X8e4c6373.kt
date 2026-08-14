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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373.Serializer::class)
public sealed class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373) {
      encoder.encodeString(value.value)
    }
  }
}
