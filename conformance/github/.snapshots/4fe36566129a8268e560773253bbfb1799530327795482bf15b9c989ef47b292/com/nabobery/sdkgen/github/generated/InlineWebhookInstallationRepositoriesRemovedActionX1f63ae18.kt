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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-repositories-removed/properties/action
 */
@Serializable(with = InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18.Serializer::class)
public sealed class InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18() {
    public override val `value`: String = "removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18 = when (value) {
      Removed.value -> Removed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationRepositoriesRemovedActionX1f63ae18) {
      encoder.encodeString(value.value)
    }
  }
}
