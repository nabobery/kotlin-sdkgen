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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesResponseStatus.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesResponseStatus
 */
@Serializable(with = OpenAiResponsesResponseStatus.Serializer::class)
public sealed class OpenAiResponsesResponseStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "incomplete"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : OpenAiResponsesResponseStatus() {
    public override val `value`: String = "queued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : OpenAiResponsesResponseStatus()

  public companion object {
    public fun fromValue(`value`: String): OpenAiResponsesResponseStatus = when (value) {
      Completed.value -> Completed
      Incomplete.value -> Incomplete
      InProgress.value -> InProgress
      Failed.value -> Failed
      Cancelled.value -> Cancelled
      Queued.value -> Queued
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<OpenAiResponsesResponseStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.OpenAiResponsesResponseStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): OpenAiResponsesResponseStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesResponseStatus) {
      encoder.encodeString(value.value)
    }
  }
}
