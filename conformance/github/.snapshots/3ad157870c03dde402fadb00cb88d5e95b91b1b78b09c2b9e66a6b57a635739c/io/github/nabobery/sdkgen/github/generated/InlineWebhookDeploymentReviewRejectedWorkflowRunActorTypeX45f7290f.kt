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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunActorTypeX45f7290f) {
      encoder.encodeString(value.value)
    }
  }
}
