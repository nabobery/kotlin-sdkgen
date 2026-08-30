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
 * The token status as of the latest validity check.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-webhook/properties/validity
 */
@Serializable(with = InlineSecretScanningAlertWebhookValidityXe3c9475d.Serializer::class)
public sealed class InlineSecretScanningAlertWebhookValidityXe3c9475d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineSecretScanningAlertWebhookValidityXe3c9475d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineSecretScanningAlertWebhookValidityXe3c9475d() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineSecretScanningAlertWebhookValidityXe3c9475d() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningAlertWebhookValidityXe3c9475d()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningAlertWebhookValidityXe3c9475d = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningAlertWebhookValidityXe3c9475d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningAlertWebhookValidityXe3c9475d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertWebhookValidityXe3c9475d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertWebhookValidityXe3c9475d) {
      encoder.encodeString(value.value)
    }
  }
}
