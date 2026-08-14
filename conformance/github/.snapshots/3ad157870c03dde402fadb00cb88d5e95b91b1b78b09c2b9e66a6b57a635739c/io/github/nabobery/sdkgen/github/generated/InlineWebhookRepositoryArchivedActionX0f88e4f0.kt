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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-archived/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-archived/properties/action
 */
@Serializable(with = InlineWebhookRepositoryArchivedActionX0f88e4f0.Serializer::class)
public sealed class InlineWebhookRepositoryArchivedActionX0f88e4f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `archived`.
   */
  public data object Archived : InlineWebhookRepositoryArchivedActionX0f88e4f0() {
    public override val `value`: String = "archived"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryArchivedActionX0f88e4f0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryArchivedActionX0f88e4f0 = when (value) {
      Archived.value -> Archived
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryArchivedActionX0f88e4f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRepositoryArchivedActionX0f88e4f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryArchivedActionX0f88e4f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryArchivedActionX0f88e4f0) {
      encoder.encodeString(value.value)
    }
  }
}
