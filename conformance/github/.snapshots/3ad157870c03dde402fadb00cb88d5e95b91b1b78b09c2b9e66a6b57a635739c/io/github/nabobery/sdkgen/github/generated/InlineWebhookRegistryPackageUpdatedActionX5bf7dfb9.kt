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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-updated/properties/action
 */
@Serializable(with = InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9.Serializer::class)
public sealed class InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9 = when (value) {
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackageUpdatedActionX5bf7dfb9) {
      encoder.encodeString(value.value)
    }
  }
}
