package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/workflow-run-status/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/workflow-run-status/schema
 */
@Serializable(with = InlineWorkflowRunStatusParameterXe1382dfc.Serializer::class)
public sealed class InlineWorkflowRunStatusParameterXe1382dfc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWorkflowRunStatusParameterXe1382dfc() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWorkflowRunStatusParameterXe1382dfc()

  public companion object {
    public fun fromValue(`value`: String): InlineWorkflowRunStatusParameterXe1382dfc = when (value) {
      Completed.value -> Completed
      ActionRequired.value -> ActionRequired
      Cancelled.value -> Cancelled
      Failure.value -> Failure
      Neutral.value -> Neutral
      Skipped.value -> Skipped
      Stale.value -> Stale
      Success.value -> Success
      TimedOut.value -> TimedOut
      InProgress.value -> InProgress
      Queued.value -> Queued
      Requested.value -> Requested
      Waiting.value -> Waiting
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWorkflowRunStatusParameterXe1382dfc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWorkflowRunStatusParameterXe1382dfc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWorkflowRunStatusParameterXe1382dfc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowRunStatusParameterXe1382dfc) {
      encoder.encodeString(value.value)
    }
  }
}
