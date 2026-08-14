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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/workflow_run/properties
 * /actor/properties/type
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedWorkflowRunActorTypeX75643039) {
      encoder.encodeString(value.value)
    }
  }
}
