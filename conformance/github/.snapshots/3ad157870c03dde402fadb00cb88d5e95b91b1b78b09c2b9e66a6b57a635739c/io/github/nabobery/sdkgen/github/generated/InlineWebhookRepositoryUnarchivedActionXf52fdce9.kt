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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-unarchived/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-unarchived/properties/action
 */
@Serializable(with = InlineWebhookRepositoryUnarchivedActionXf52fdce9.Serializer::class)
public sealed class InlineWebhookRepositoryUnarchivedActionXf52fdce9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unarchived`.
   */
  public data object Unarchived : InlineWebhookRepositoryUnarchivedActionXf52fdce9() {
    public override val `value`: String = "unarchived"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryUnarchivedActionXf52fdce9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryUnarchivedActionXf52fdce9 = when (value) {
      Unarchived.value -> Unarchived
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryUnarchivedActionXf52fdce9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRepositoryUnarchivedActionXf52fdce9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryUnarchivedActionXf52fdce9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryUnarchivedActionXf52fdce9) {
      encoder.encodeString(value.value)
    }
  }
}
