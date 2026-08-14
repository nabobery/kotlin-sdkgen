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
 * The current status of the check run. Can be `queued`, `in_progress`, or `completed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/check_run/properties/st
 * atus
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedCheckRunStatusXa7a97362) {
      encoder.encodeString(value.value)
    }
  }
}
