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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-deleted/properties/action
 */
@Serializable(with = InlineWebhookInstallationDeletedActionX25d885be.Serializer::class)
public sealed class InlineWebhookInstallationDeletedActionX25d885be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookInstallationDeletedActionX25d885be() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookInstallationDeletedActionX25d885be()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookInstallationDeletedActionX25d885be = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationDeletedActionX25d885be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookInstallationDeletedActionX25d885be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationDeletedActionX25d885be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationDeletedActionX25d885be) {
      encoder.encodeString(value.value)
    }
  }
}
