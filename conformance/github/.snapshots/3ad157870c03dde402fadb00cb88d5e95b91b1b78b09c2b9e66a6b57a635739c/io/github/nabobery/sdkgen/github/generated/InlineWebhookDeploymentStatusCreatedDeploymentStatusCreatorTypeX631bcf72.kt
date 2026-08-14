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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status/prope
 * rties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment_status/prope
 * rties/creator/properties/type
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedDeploymentStatusCreatorTypeX631bcf72) {
      encoder.encodeString(value.value)
    }
  }
}
