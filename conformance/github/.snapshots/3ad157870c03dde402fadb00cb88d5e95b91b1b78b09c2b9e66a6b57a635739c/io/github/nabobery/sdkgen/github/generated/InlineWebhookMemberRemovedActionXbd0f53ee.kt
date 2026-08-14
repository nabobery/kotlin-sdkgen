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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-member-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-removed/properties/action
 */
@Serializable(with = InlineWebhookMemberRemovedActionXbd0f53ee.Serializer::class)
public sealed class InlineWebhookMemberRemovedActionXbd0f53ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineWebhookMemberRemovedActionXbd0f53ee() {
    public override val `value`: String = "removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMemberRemovedActionXbd0f53ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMemberRemovedActionXbd0f53ee = when (value) {
      Removed.value -> Removed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMemberRemovedActionXbd0f53ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookMemberRemovedActionXbd0f53ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMemberRemovedActionXbd0f53ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMemberRemovedActionXbd0f53ee) {
      encoder.encodeString(value.value)
    }
  }
}
