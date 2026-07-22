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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/triggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/triggering_actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedWorkflowRunTriggeringActorTypeX4a257da1) {
      encoder.encodeString(value.value)
    }
  }
}
