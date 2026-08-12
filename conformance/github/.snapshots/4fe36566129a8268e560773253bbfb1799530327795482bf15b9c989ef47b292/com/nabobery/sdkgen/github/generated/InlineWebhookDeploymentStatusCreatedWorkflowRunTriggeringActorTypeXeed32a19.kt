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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /triggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /triggering_actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunTriggeringActorTypeXeed32a19) {
      encoder.encodeString(value.value)
    }
  }
}
