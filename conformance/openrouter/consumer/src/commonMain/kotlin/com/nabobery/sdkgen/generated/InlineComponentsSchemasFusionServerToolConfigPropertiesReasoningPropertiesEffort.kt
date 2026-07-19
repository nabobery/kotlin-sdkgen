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
 * Reasoning effort level for panelist and judge inner calls.
 */
@Serializable(with = InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort.Serializer::class)
public sealed class InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort = when (value) {
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

  public object Serializer : KSerializer<InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionServerToolConfigPropertiesReasoningPropertiesEffort) {
      encoder.encodeString(value.value)
    }
  }
}
