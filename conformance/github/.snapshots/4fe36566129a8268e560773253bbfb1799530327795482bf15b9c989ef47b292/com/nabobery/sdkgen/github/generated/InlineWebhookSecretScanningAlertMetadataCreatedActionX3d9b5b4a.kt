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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-created/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-created/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `metadata_created`.
   */
  public data object MetadataCreated : InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a() {
    public override val `value`: String = "metadata_created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a = when (value) {
      MetadataCreated.value -> MetadataCreated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertMetadataCreatedActionX3d9b5b4a) {
      encoder.encodeString(value.value)
    }
  }
}
