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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deploy-key-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deploy-key-created/properties/action
 */
@Serializable(with = InlineWebhookDeployKeyCreatedActionX3d1ba37b.Serializer::class)
public sealed class InlineWebhookDeployKeyCreatedActionX3d1ba37b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookDeployKeyCreatedActionX3d1ba37b() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeployKeyCreatedActionX3d1ba37b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeployKeyCreatedActionX3d1ba37b = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDeployKeyCreatedActionX3d1ba37b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDeployKeyCreatedActionX3d1ba37b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeployKeyCreatedActionX3d1ba37b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeployKeyCreatedActionX3d1ba37b) {
      encoder.encodeString(value.value)
    }
  }
}
