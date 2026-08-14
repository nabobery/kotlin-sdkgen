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
 * Indicates whether the customer was present in your checkout flow during this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/customer_presence
 */
@Serializable(with = InlinePaymentRecordCustomerPresenceX0eda3266.Serializer::class)
public sealed class InlinePaymentRecordCustomerPresenceX0eda3266 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlinePaymentRecordCustomerPresenceX0eda3266() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlinePaymentRecordCustomerPresenceX0eda3266() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentRecordCustomerPresenceX0eda3266()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentRecordCustomerPresenceX0eda3266 = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentRecordCustomerPresenceX0eda3266> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentRecordCustomerPresenceX0eda3266", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentRecordCustomerPresenceX0eda3266 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentRecordCustomerPresenceX0eda3266) {
      encoder.encodeString(value.value)
    }
  }
}
