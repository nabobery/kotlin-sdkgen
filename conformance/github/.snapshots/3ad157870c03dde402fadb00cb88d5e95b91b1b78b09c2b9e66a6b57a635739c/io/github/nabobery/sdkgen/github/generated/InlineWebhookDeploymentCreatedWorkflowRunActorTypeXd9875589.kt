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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/actor/
 * properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/actor/
 * properties/type
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589.Serializer::class)
public sealed class InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunActorTypeXd9875589) {
      encoder.encodeString(value.value)
    }
  }
}
