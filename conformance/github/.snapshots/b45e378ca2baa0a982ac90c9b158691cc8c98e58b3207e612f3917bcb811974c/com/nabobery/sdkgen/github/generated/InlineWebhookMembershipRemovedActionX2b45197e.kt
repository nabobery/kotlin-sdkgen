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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed/properties/action
 */
@Serializable(with = InlineWebhookMembershipRemovedActionX2b45197e.Serializer::class)
public sealed class InlineWebhookMembershipRemovedActionX2b45197e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineWebhookMembershipRemovedActionX2b45197e() {
    public override val `value`: String = "removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMembershipRemovedActionX2b45197e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMembershipRemovedActionX2b45197e = when (value) {
      Removed.value -> Removed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMembershipRemovedActionX2b45197e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMembershipRemovedActionX2b45197e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMembershipRemovedActionX2b45197e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMembershipRemovedActionX2b45197e) {
      encoder.encodeString(value.value)
    }
  }
}
