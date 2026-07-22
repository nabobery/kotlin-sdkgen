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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/check-suite/properties/conclusion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-suite/properties/conclusion
 */
@Serializable(with = InlineCheckSuiteConclusionX6b51f45d.Serializer::class)
public sealed class InlineCheckSuiteConclusionX6b51f45d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `startup_failure`.
   */
  public data object StartupFailure : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "startup_failure"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineCheckSuiteConclusionX6b51f45d() {
    public override val `value`: String = "stale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckSuiteConclusionX6b51f45d()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckSuiteConclusionX6b51f45d = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      Skipped.value -> Skipped
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      StartupFailure.value -> StartupFailure
      Stale.value -> Stale
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckSuiteConclusionX6b51f45d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCheckSuiteConclusionX6b51f45d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckSuiteConclusionX6b51f45d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckSuiteConclusionX6b51f45d) {
      encoder.encodeString(value.value)
    }
  }
}
