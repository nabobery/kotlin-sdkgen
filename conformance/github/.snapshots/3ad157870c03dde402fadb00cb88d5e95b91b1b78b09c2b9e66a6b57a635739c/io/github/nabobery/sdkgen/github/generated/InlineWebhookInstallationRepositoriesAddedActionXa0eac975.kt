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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-added/properties/action
 */
@Serializable(with = InlineWebhookInstallationRepositoriesAddedActionXa0eac975.Serializer::class)
public sealed class InlineWebhookInstallationRepositoriesAddedActionXa0eac975 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added`.
   */
  public data object Added : InlineWebhookInstallationRepositoriesAddedActionXa0eac975() {
    public override val `value`: String = "added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationRepositoriesAddedActionXa0eac975()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationRepositoriesAddedActionXa0eac975 = when (value) {
      Added.value -> Added
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationRepositoriesAddedActionXa0eac975> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookInstallationRepositoriesAddedActionXa0eac975", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationRepositoriesAddedActionXa0eac975 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationRepositoriesAddedActionXa0eac975) {
      encoder.encodeString(value.value)
    }
  }
}
