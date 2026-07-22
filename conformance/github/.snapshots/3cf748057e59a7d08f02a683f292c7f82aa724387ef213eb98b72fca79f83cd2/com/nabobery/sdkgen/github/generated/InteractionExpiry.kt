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
 * The duration of the interaction restriction. Default: `one_day`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/interaction-expiry
 */
@Serializable(with = InteractionExpiry.Serializer::class)
public sealed class InteractionExpiry {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_day`.
   */
  public data object OneDay : InteractionExpiry() {
    public override val `value`: String = "one_day"
  }

  /**
   * Documented value. Wire value: `three_days`.
   */
  public data object ThreeDays : InteractionExpiry() {
    public override val `value`: String = "three_days"
  }

  /**
   * Documented value. Wire value: `one_week`.
   */
  public data object OneWeek : InteractionExpiry() {
    public override val `value`: String = "one_week"
  }

  /**
   * Documented value. Wire value: `one_month`.
   */
  public data object OneMonth : InteractionExpiry() {
    public override val `value`: String = "one_month"
  }

  /**
   * Documented value. Wire value: `six_months`.
   */
  public data object SixMonths : InteractionExpiry() {
    public override val `value`: String = "six_months"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InteractionExpiry()

  public companion object {
    public fun fromValue(`value`: String): InteractionExpiry = when (value) {
      OneDay.value -> OneDay
      ThreeDays.value -> ThreeDays
      OneWeek.value -> OneWeek
      OneMonth.value -> OneMonth
      SixMonths.value -> SixMonths
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InteractionExpiry> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InteractionExpiry", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InteractionExpiry = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InteractionExpiry) {
      encoder.encodeString(value.value)
    }
  }
}
