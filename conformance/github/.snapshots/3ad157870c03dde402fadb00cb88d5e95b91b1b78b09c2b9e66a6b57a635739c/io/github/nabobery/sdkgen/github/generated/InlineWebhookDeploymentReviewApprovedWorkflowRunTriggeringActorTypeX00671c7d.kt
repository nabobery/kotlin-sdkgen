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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/triggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved/properties/workflow_run/propertie
 * s/triggering_actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d.Serializer::class)
public sealed class InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewApprovedWorkflowRunTriggeringActorTypeX00671c7d) {
      encoder.encodeString(value.value)
    }
  }
}
