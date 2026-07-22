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
 * es/actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/workflow_run/properti
 * es/actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedWorkflowRunActorTypeX143b81f3) {
      encoder.encodeString(value.value)
    }
  }
}
