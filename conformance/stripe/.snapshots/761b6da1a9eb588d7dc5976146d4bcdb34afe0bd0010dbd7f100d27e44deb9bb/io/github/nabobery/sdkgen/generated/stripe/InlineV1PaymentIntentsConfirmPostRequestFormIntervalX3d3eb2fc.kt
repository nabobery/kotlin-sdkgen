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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options/prope
 * rties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/mandate_options/prope
 * rties/interval
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc() {
    public override val `value`: String = "sporadic"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc = when (value) {
      Day.value -> Day
      Month.value -> Month
      Sporadic.value -> Sporadic
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormIntervalX3d3eb2fc) {
      encoder.encodeString(value.value)
    }
  }
}
