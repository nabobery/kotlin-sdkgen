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
 * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.
 * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a
 * check run conclusion to `stale`, only GitHub can set this.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/conclusion
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonConclusionXf81283be.Serializer::class)
public sealed class InlineReposCheckRunsPostRequestJsonConclusionXf81283be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "skipped"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineReposCheckRunsPostRequestJsonConclusionXf81283be() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCheckRunsPostRequestJsonConclusionXf81283be()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCheckRunsPostRequestJsonConclusionXf81283be = when (value) {
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

  internal object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonConclusionXf81283be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonConclusionXf81283be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonConclusionXf81283be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonConclusionXf81283be) {
      encoder.encodeString(value.value)
    }
  }
}
