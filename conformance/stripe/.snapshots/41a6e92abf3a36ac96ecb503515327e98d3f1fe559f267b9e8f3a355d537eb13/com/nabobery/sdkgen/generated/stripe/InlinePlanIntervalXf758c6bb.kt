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
 * The frequency at which a subscription is billed. One of `day`, `week`, `month` or `year`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/interval
 */
@Serializable(with = InlinePlanIntervalXf758c6bb.Serializer::class)
public sealed class InlinePlanIntervalXf758c6bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlinePlanIntervalXf758c6bb() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlinePlanIntervalXf758c6bb() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlinePlanIntervalXf758c6bb() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlinePlanIntervalXf758c6bb() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePlanIntervalXf758c6bb()

  public companion object {
    public fun fromValue(`value`: String): InlinePlanIntervalXf758c6bb = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePlanIntervalXf758c6bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePlanIntervalXf758c6bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePlanIntervalXf758c6bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePlanIntervalXf758c6bb) {
      encoder.encodeString(value.value)
    }
  }
}
