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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/ac
 * tor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed/properties/workflow_run/properties/ac
 * tor/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1.Serializer::class)
public sealed class InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunCompletedWorkflowRunActorTypeX9adb0ec1) {
      encoder.encodeString(value.value)
    }
  }
}
