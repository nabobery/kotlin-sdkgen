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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-suspend/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-suspend/properties/action
 */
@Serializable(with = InlineWebhookInstallationSuspendActionX4f88994a.Serializer::class)
public sealed class InlineWebhookInstallationSuspendActionX4f88994a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `suspend`.
   */
  public data object Suspend : InlineWebhookInstallationSuspendActionX4f88994a() {
    public override val `value`: String = "suspend"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationSuspendActionX4f88994a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationSuspendActionX4f88994a = when (value) {
      Suspend.value -> Suspend
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationSuspendActionX4f88994a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookInstallationSuspendActionX4f88994a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationSuspendActionX4f88994a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationSuspendActionX4f88994a) {
      encoder.encodeString(value.value)
    }
  }
}
