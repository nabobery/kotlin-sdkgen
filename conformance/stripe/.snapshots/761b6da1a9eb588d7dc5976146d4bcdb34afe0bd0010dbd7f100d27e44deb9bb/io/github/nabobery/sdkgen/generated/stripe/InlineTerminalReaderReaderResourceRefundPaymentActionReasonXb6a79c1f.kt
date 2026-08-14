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
 * The reason for the refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_action/properties/rea
 * son
 */
@Serializable(with = InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f.Serializer::class)
public sealed class InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `requested_by_customer`.
   */
  public data object RequestedByCustomer : InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f() {
    public override val `value`: String = "requested_by_customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f()

  public companion object {
    public fun fromValue(`value`: String): InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f = when (value) {
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      RequestedByCustomer.value -> RequestedByCustomer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceRefundPaymentActionReasonXb6a79c1f) {
      encoder.encodeString(value.value)
    }
  }
}
