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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/tr
 * iggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/tr
 * iggering_actor/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunTriggeringActorTypeX67f32384) {
      encoder.encodeString(value.value)
    }
  }
}
