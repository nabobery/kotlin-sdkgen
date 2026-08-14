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
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card/properties/customer_p
 * resence.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1payment_evaluations/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_details/properties/money_movement_details/properties/card/properties/customer_p
 * resence
 */
@Serializable(with = InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8.Serializer::class)
public sealed class InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8 = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarPaymentEvaluacd5dPostRequestFormCustomerPresenceX2bcc20f8) {
      encoder.encodeString(value.value)
    }
  }
}
