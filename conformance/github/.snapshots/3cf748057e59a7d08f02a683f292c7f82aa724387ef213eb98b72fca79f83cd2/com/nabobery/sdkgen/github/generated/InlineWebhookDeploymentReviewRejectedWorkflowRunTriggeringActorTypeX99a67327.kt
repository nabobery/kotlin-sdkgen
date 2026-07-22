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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/triggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected/properties/workflow_run/propertie
 * s/triggering_actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327.Serializer::class)
public sealed class InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRejectedWorkflowRunTriggeringActorTypeX99a67327) {
      encoder.encodeString(value.value)
    }
  }
}
