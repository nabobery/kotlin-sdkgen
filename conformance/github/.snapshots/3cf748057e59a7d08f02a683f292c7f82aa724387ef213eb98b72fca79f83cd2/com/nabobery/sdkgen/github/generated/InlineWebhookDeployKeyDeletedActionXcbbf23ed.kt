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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deploy-key-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deploy-key-deleted/properties/action
 */
@Serializable(with = InlineWebhookDeployKeyDeletedActionXcbbf23ed.Serializer::class)
public sealed class InlineWebhookDeployKeyDeletedActionXcbbf23ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookDeployKeyDeletedActionXcbbf23ed() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDeployKeyDeletedActionXcbbf23ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDeployKeyDeletedActionXcbbf23ed = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDeployKeyDeletedActionXcbbf23ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDeployKeyDeletedActionXcbbf23ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDeployKeyDeletedActionXcbbf23ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeployKeyDeletedActionXcbbf23ed) {
      encoder.encodeString(value.value)
    }
  }
}
