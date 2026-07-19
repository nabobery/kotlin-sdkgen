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
 * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis but
 * take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
 */
@Serializable(with = InlineComponentsSchemasMessagesOutputConfigPropertiesEffort.Serializer::class)
public sealed class InlineComponentsSchemasMessagesOutputConfigPropertiesEffort {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort() {
    public override val `value`: String = "max"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesOutputConfigPropertiesEffort()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesOutputConfigPropertiesEffort = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Xhigh.value -> Xhigh
      Max.value -> Max
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesOutputConfigPropertiesEffort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesOutputConfigPropertiesEffort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesOutputConfigPropertiesEffort =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesOutputConfigPropertiesEffort) {
      encoder.encodeString(value.value)
    }
  }
}
