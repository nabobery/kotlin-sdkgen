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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-reopened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-reopened/properties/action
 */
@Serializable(with = InlineWebhookSecretScanningAlertReopenedActionX7fcfb796.Serializer::class)
public sealed class InlineWebhookSecretScanningAlertReopenedActionX7fcfb796 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineWebhookSecretScanningAlertReopenedActionX7fcfb796() {
    public override val `value`: String = "reopened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSecretScanningAlertReopenedActionX7fcfb796()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSecretScanningAlertReopenedActionX7fcfb796 = when (value) {
      Reopened.value -> Reopened
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSecretScanningAlertReopenedActionX7fcfb796> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookSecretScanningAlertReopenedActionX7fcfb796", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSecretScanningAlertReopenedActionX7fcfb796 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecretScanningAlertReopenedActionX7fcfb796) {
      encoder.encodeString(value.value)
    }
  }
}
