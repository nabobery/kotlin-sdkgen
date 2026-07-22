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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/c
 * reator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created/properties/deployment/properties/c
 * reator/properties/type
 */
@Serializable(with = InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422.Serializer::class)
public sealed class InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentStatusCreatedDeploymentCreatorTypeXfd80f422) {
      encoder.encodeString(value.value)
    }
  }
}
