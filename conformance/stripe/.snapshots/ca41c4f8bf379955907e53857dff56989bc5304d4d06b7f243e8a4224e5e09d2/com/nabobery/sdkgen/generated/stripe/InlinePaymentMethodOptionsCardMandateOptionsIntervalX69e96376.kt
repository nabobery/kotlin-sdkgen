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
 * Specifies payment frequency. One of `day`, `week`, `month`, `year`, or `sporadic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_mandate_options/properties/interval
 */
@Serializable(with = InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376.Serializer::class)
public sealed class InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376() {
    public override val `value`: String = "sporadic"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Sporadic.value -> Sporadic
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsCardMandateOptionsIntervalX69e96376) {
      encoder.encodeString(value.value)
    }
  }
}
