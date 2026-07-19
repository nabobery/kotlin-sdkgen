package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Interval at which the limit resets (daily, weekly, monthly)
 */
@Serializable(with = GuardrailInterval.Serializer::class)
public sealed class GuardrailInterval {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : GuardrailInterval() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : GuardrailInterval() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : GuardrailInterval() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : GuardrailInterval()

  public companion object {
    public fun fromValue(`value`: String): GuardrailInterval = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<GuardrailInterval> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.GuardrailInterval", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): GuardrailInterval = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: GuardrailInterval) {
      encoder.encodeString(value.value)
    }
  }
}
