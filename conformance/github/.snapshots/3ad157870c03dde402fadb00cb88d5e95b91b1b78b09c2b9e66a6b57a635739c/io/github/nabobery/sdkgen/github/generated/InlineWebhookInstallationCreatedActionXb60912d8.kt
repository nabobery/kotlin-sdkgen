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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-created/properties/action
 */
@Serializable(with = InlineWebhookInstallationCreatedActionXb60912d8.Serializer::class)
public sealed class InlineWebhookInstallationCreatedActionXb60912d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookInstallationCreatedActionXb60912d8() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationCreatedActionXb60912d8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationCreatedActionXb60912d8 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationCreatedActionXb60912d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookInstallationCreatedActionXb60912d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationCreatedActionXb60912d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationCreatedActionXb60912d8) {
      encoder.encodeString(value.value)
    }
  }
}
