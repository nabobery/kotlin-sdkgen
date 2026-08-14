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
 * Current state of the task, derived from its most recent session
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/state
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `idle`.
   */
  public data object Idle : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "idle"
  }

  /**
   * Documented value. Wire value: `waiting_for_user`.
   */
  public data object WaitingForUser : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "waiting_for_user"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3 = when (value) {
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

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1StateXecf94aa3) {
      encoder.encodeString(value.value)
    }
  }
}
