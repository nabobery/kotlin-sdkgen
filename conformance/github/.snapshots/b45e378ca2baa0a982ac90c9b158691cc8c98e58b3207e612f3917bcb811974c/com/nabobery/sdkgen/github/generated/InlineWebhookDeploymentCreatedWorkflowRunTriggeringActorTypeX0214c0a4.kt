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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/trigge
 * ring_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/trigge
 * ring_actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunTriggeringActorTypeX0214c0a4) {
      encoder.encodeString(value.value)
    }
  }
}
