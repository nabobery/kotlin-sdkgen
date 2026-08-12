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
 * Indicates whether the customer was present in your checkout flow during this payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/customer_presence
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357.Serializer::class)
public sealed class InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357 = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormCustomerPresenceX57e5c357) {
      encoder.encodeString(value.value)
    }
  }
}
