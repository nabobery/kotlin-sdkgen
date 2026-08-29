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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/ac
 * tor/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-requested/properties/workflow_run/properties/ac
 * tor/properties/type
 */
@Serializable(with = InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978.Serializer::class)
public sealed class InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunRequestedWorkflowRunActorTypeX8f545978) {
      encoder.encodeString(value.value)
    }
  }
}
