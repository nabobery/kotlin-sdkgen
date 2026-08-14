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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/action
 */
@Serializable(with = InlineWebhookInstallationTargetRenamedActionXe233e9dd.Serializer::class)
public sealed class InlineWebhookInstallationTargetRenamedActionXe233e9dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `renamed`.
   */
  public data object Renamed : InlineWebhookInstallationTargetRenamedActionXe233e9dd() {
    public override val `value`: String = "renamed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationTargetRenamedActionXe233e9dd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationTargetRenamedActionXe233e9dd = when (value) {
      Renamed.value -> Renamed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationTargetRenamedActionXe233e9dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookInstallationTargetRenamedActionXe233e9dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationTargetRenamedActionXe233e9dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationTargetRenamedActionXe233e9dd) {
      encoder.encodeString(value.value)
    }
  }
}
