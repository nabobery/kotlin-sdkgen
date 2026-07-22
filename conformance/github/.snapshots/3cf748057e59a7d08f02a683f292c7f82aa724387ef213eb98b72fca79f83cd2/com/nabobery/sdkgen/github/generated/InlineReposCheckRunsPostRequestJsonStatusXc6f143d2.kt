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
 * The current status of the check run. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/status
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonStatusXc6f143d2.Serializer::class)
public sealed class InlineReposCheckRunsPostRequestJsonStatusXc6f143d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPostRequestJsonStatusXc6f143d2()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPostRequestJsonStatusXc6f143d2 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Requested.value -> Requested
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonStatusXc6f143d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonStatusXc6f143d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonStatusXc6f143d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonStatusXc6f143d2) {
      encoder.encodeString(value.value)
    }
  }
}
