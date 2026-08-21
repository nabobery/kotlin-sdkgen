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
 * sdkgen://source/openapi.yaml#/components/schemas/simple-check-suite/properties/conclusion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-check-suite/properties/conclusion
 */
@Serializable(with = InlineSimpleCheckSuiteConclusionX83f76907.Serializer::class)
public sealed class InlineSimpleCheckSuiteConclusionX83f76907 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineSimpleCheckSuiteConclusionX83f76907() {
    public override val `value`: String = "startup_failure"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSimpleCheckSuiteConclusionX83f76907()

  public companion object {
    public fun fromValue(`value`: String): InlineSimpleCheckSuiteConclusionX83f76907 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      Skipped.value -> Skipped
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      StartupFailure.value -> StartupFailure
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSimpleCheckSuiteConclusionX83f76907> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSimpleCheckSuiteConclusionX83f76907", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSimpleCheckSuiteConclusionX83f76907 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSimpleCheckSuiteConclusionX83f76907) {
      encoder.encodeString(value.value)
    }
  }
}
