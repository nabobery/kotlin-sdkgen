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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-unsuspend/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-unsuspend/properties/action
 */
@Serializable(with = InlineWebhookInstallationUnsuspendActionX7be5f70f.Serializer::class)
public sealed class InlineWebhookInstallationUnsuspendActionX7be5f70f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unsuspend`.
   */
  public data object Unsuspend : InlineWebhookInstallationUnsuspendActionX7be5f70f() {
    public override val `value`: String = "unsuspend"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationUnsuspendActionX7be5f70f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationUnsuspendActionX7be5f70f = when (value) {
      Unsuspend.value -> Unsuspend
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationUnsuspendActionX7be5f70f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookInstallationUnsuspendActionX7be5f70f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationUnsuspendActionX7be5f70f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationUnsuspendActionX7be5f70f) {
      encoder.encodeString(value.value)
    }
  }
}
