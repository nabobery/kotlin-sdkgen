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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/status
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a.Serializer::class)
public sealed class InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Requested.value -> Requested
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonStatusXe2e4c49a) {
      encoder.encodeString(value.value)
    }
  }
}
