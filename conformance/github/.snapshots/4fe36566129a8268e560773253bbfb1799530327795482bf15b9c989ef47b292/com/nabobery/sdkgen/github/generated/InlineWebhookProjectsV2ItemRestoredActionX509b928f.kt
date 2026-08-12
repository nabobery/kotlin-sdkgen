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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-restored/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-restored/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ItemRestoredActionX509b928f.Serializer::class)
public sealed class InlineWebhookProjectsV2ItemRestoredActionX509b928f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `restored`.
   */
  public data object Restored : InlineWebhookProjectsV2ItemRestoredActionX509b928f() {
    public override val `value`: String = "restored"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ItemRestoredActionX509b928f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ItemRestoredActionX509b928f = when (value) {
      Restored.value -> Restored
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemRestoredActionX509b928f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ItemRestoredActionX509b928f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemRestoredActionX509b928f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemRestoredActionX509b928f) {
      encoder.encodeString(value.value)
    }
  }
}
