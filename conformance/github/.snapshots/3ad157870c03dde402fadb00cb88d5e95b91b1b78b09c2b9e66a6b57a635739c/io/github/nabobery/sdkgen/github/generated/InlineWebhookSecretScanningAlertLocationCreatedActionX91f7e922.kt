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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922) {
      encoder.encodeString(value.value)
    }
  }
}
