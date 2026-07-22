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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-resolved/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-resolved/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertResolvedActionX442fe0cc.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertResolvedActionX442fe0cc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookSecretScanningAlertResolvedActionX442fe0cc() {
    public override val `value`: String = "resolved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertResolvedActionX442fe0cc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertResolvedActionX442fe0cc = when (value) {
      Resolved.value -> Resolved
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookSecretScanningAlertResolvedActionX442fe0cc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertResolvedActionX442fe0cc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertResolvedActionX442fe0cc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertResolvedActionX442fe0cc) {
      encoder.encodeString(value.value)
    }
  }
}
