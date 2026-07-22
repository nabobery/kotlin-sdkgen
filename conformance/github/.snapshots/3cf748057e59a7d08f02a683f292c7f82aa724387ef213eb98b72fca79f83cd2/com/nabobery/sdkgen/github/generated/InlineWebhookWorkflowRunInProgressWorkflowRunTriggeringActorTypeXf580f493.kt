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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * triggering_actor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * triggering_actor/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493.Serializer::class)
public sealed class InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunTriggeringActorTypeXf580f493) {
      encoder.encodeString(value.value)
    }
  }
}
