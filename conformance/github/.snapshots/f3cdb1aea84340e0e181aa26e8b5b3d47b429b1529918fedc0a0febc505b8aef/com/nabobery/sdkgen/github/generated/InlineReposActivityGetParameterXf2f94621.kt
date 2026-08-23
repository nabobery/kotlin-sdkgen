package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1activity/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1activity/get/parameters/8/schema
 */
@Serializable(with = InlineReposActivityGetParameterXf2f94621.Serializer::class)
public sealed class InlineReposActivityGetParameterXf2f94621 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineReposActivityGetParameterXf2f94621() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineReposActivityGetParameterXf2f94621() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineReposActivityGetParameterXf2f94621() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `quarter`.
   */
  public data object Quarter : InlineReposActivityGetParameterXf2f94621() {
    public override val `value`: String = "quarter"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineReposActivityGetParameterXf2f94621() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposActivityGetParameterXf2f94621()

  public companion object {
    public fun fromValue(`value`: String): InlineReposActivityGetParameterXf2f94621 = when (value) {
      Day.value -> Day
      Week.value -> Week
      Month.value -> Month
      Quarter.value -> Quarter
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposActivityGetParameterXf2f94621> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposActivityGetParameterXf2f94621", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposActivityGetParameterXf2f94621 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposActivityGetParameterXf2f94621) {
      encoder.encodeString(value.value)
    }
  }
}
