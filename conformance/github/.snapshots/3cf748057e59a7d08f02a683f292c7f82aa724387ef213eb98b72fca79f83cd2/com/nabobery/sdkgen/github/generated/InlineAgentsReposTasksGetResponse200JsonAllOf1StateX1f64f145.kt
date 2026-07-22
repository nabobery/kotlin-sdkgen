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
 * Current state of the task, derived from its most recent session
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/state
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `idle`.
   */
  public data object Idle : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "idle"
  }

  /**
   * Documented value. Wire value: `waiting_for_user`.
   */
  public data object WaitingForUser : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "waiting_for_user"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Failed.value -> Failed
      Idle.value -> Idle
      WaitingForUser.value -> WaitingForUser
      TimedOut.value -> TimedOut
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1StateX1f64f145) {
      encoder.encodeString(value.value)
    }
  }
}
