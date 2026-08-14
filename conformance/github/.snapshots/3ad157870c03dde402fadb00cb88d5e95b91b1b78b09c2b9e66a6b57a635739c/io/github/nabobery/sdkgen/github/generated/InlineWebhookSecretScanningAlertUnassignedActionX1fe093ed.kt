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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-unassigned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-unassigned/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unassigned`.
   */
  public data object Unassigned : InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed() {
    public override val `value`: String = "unassigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed = when (value) {
      Unassigned.value -> Unassigned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertUnassignedActionX1fe093ed) {
      encoder.encodeString(value.value)
    }
  }
}
