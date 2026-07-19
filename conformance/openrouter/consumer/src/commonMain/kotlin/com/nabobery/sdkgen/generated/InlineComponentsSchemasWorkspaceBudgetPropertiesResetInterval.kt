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
 */
@Serializable(with = InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval.Serializer::class)
public sealed class InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval() {
    public override val `value`: String = "weekly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval() {
    public override val `value`: String = "monthly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval =
      when (value) {
      Daily.value -> Daily
      Weekly.value -> Weekly
      Monthly.value -> Monthly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWorkspaceBudgetPropertiesResetInterval) {
      encoder.encodeString(value.value)
    }
  }
}
