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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-removed/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-removed/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `metadata_removed`.
   */
  public data object MetadataRemoved : InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546() {
    public override val `value`: String = "metadata_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546 = when (value) {
      MetadataRemoved.value -> MetadataRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546) {
      encoder.encodeString(value.value)
    }
  }
}
