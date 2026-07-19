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
 * Budget reset interval. Use "lifetime" for a one-time budget that never resets.
 */
@Serializable(with = WorkspaceBudgetInterval.Serializer::class)
public sealed class WorkspaceBudgetInterval {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : WorkspaceBudgetInterval() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : WorkspaceBudgetInterval() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : WorkspaceBudgetInterval() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `lifetime`.
   */
  public data object Lifetime : WorkspaceBudgetInterval() {
    public override val `value`: String = "lifetime"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WorkspaceBudgetInterval()

  public companion object {
    public fun fromValue(`value`: String): WorkspaceBudgetInterval = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      Lifetime.value -> Lifetime
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<WorkspaceBudgetInterval> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.WorkspaceBudgetInterval", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WorkspaceBudgetInterval = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WorkspaceBudgetInterval) {
      encoder.encodeString(value.value)
    }
  }
}
