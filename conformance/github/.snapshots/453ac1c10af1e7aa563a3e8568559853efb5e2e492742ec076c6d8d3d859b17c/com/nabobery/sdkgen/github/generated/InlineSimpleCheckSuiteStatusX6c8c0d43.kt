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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/simple-check-suite/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-check-suite/properties/status
 */
@Serializable(with = InlineSimpleCheckSuiteStatusX6c8c0d43.Serializer::class)
public sealed class InlineSimpleCheckSuiteStatusX6c8c0d43 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineSimpleCheckSuiteStatusX6c8c0d43() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineSimpleCheckSuiteStatusX6c8c0d43() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineSimpleCheckSuiteStatusX6c8c0d43() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineSimpleCheckSuiteStatusX6c8c0d43() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineSimpleCheckSuiteStatusX6c8c0d43() {
    public override val `value`: String = "waiting"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSimpleCheckSuiteStatusX6c8c0d43()

  public companion object {
    public fun fromValue(`value`: String): InlineSimpleCheckSuiteStatusX6c8c0d43 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Pending.value -> Pending
      Waiting.value -> Waiting
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSimpleCheckSuiteStatusX6c8c0d43> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSimpleCheckSuiteStatusX6c8c0d43", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSimpleCheckSuiteStatusX6c8c0d43 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSimpleCheckSuiteStatusX6c8c0d43) {
      encoder.encodeString(value.value)
    }
  }
}
