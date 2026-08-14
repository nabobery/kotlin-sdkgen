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
 * Additional information about why 3D Secure succeeded or failed, based on the `result`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails_resource_three_d_secure/properties/result_reason
 */
@Serializable(with = InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38.Serializer::class)
public sealed class InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `bypassed`.
   */
  public data object Bypassed : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "bypassed"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `card_not_enrolled`.
   */
  public data object CardNotEnrolled : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "card_not_enrolled"
  }

  /**
   * Documented value. Wire value: `network_not_supported`.
   */
  public data object NetworkNotSupported : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "network_not_supported"
  }

  /**
   * Documented value. Wire value: `protocol_error`.
   */
  public data object ProtocolError : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "protocol_error"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38 = when (value) {
      Abandoned.value -> Abandoned
      Bypassed.value -> Bypassed
      Canceled.value -> Canceled
      CardNotEnrolled.value -> CardNotEnrolled
      NetworkNotSupported.value -> NetworkNotSupported
      ProtocolError.value -> ProtocolError
      Rejected.value -> Rejected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPabc9bResultReasonXf8760e38) {
      encoder.encodeString(value.value)
    }
  }
}
