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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-archived/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-archived/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ItemArchivedActionX20b7d15b.Serializer::class)
public sealed class InlineWebhookProjectsV2ItemArchivedActionX20b7d15b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `archived`.
   */
  public data object Archived : InlineWebhookProjectsV2ItemArchivedActionX20b7d15b() {
    public override val `value`: String = "archived"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ItemArchivedActionX20b7d15b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ItemArchivedActionX20b7d15b = when (value) {
      Archived.value -> Archived
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemArchivedActionX20b7d15b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ItemArchivedActionX20b7d15b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemArchivedActionX20b7d15b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemArchivedActionX20b7d15b) {
      encoder.encodeString(value.value)
    }
  }
}
