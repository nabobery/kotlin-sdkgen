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
 * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.
 * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a
 * check run conclusion to `stale`, only GitHub can set this.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/conclusion
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonConclusionX1681850f.Serializer::class)
public sealed class InlineReposCheckRunsPatchRequestJsonConclusionX1681850f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPatchRequestJsonConclusionX1681850f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPatchRequestJsonConclusionX1681850f = when (value) {
      ActionRequired.value -> ActionRequired
      Cancelled.value -> Cancelled
      Failure.value -> Failure
      Neutral.value -> Neutral
      Success.value -> Success
      Skipped.value -> Skipped
      Stale.value -> Stale
      TimedOut.value -> TimedOut
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonConclusionX1681850f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonConclusionX1681850f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonConclusionX1681850f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonConclusionX1681850f) {
      encoder.encodeString(value.value)
    }
  }
}
