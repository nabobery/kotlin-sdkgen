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
 * The result of the completed check run. This value will be `null` until the check run has completed.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/check_run/properties/co
 * nclusion
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `neutral`.
   */
  public data object Neutral : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "neutral"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "timed_out"
  }

  /**
   * Documented value. Wire value: `action_required`.
   */
  public data object ActionRequired : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "action_required"
  }

  /**
   * Documented value. Wire value: `stale`.
   */
  public data object Stale : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "stale"
  }

  /**
   * Documented value. Wire value: `skipped`.
   */
  public data object Skipped : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9() {
    public override val `value`: String = "skipped"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9 = when (value) {
      Success.value -> Success
      Failure.value -> Failure
      Neutral.value -> Neutral
      Cancelled.value -> Cancelled
      TimedOut.value -> TimedOut
      ActionRequired.value -> ActionRequired
      Stale.value -> Stale
      Skipped.value -> Skipped
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedCheckRunConclusionX96a230b9) {
      encoder.encodeString(value.value)
    }
  }
}
