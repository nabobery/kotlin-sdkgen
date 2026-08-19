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
 * Interval at which spend resets. Null means a lifetime (one-time) budget.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WorkspaceBudget/properties/reset_interval
 */
@Serializable(with = InlineWorkspaceBudgetResetIntervalX1be02b8d.Serializer::class)
public sealed class InlineWorkspaceBudgetResetIntervalX1be02b8d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineWorkspaceBudgetResetIntervalX1be02b8d() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineWorkspaceBudgetResetIntervalX1be02b8d() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineWorkspaceBudgetResetIntervalX1be02b8d() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWorkspaceBudgetResetIntervalX1be02b8d()

  public companion object {
    public fun fromValue(`value`: String): InlineWorkspaceBudgetResetIntervalX1be02b8d = when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWorkspaceBudgetResetIntervalX1be02b8d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineWorkspaceBudgetResetIntervalX1be02b8d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWorkspaceBudgetResetIntervalX1be02b8d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWorkspaceBudgetResetIntervalX1be02b8d) {
      encoder.encodeString(value.value)
    }
  }
}
