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
 * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously with
 * reasoning.effort if they differ.
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesReasoningEffort.Serializer::class)
public sealed class InlineComponentsSchemasChatRequestPropertiesReasoningEffort {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasChatRequestPropertiesReasoningEffort() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatRequestPropertiesReasoningEffort()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatRequestPropertiesReasoningEffort = when (value) {
      Max.value -> Max
      Xhigh.value -> Xhigh
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      Minimal.value -> Minimal
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesReasoningEffort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatRequestPropertiesReasoningEffort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesReasoningEffort =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesReasoningEffort) {
      encoder.encodeString(value.value)
    }
  }
}
