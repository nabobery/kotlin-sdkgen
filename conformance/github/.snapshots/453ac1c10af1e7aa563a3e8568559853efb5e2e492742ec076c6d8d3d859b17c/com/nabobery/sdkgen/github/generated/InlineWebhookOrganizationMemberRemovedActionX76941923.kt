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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-removed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-removed/properties/action
 */
@Serializable(with = InlineWebhookOrganizationMemberRemovedActionX76941923.Serializer::class)
public sealed class InlineWebhookOrganizationMemberRemovedActionX76941923 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member_removed`.
   */
  public data object MemberRemoved : InlineWebhookOrganizationMemberRemovedActionX76941923() {
    public override val `value`: String = "member_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationMemberRemovedActionX76941923()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationMemberRemovedActionX76941923 = when (value) {
      MemberRemoved.value -> MemberRemoved
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookOrganizationMemberRemovedActionX76941923> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrganizationMemberRemovedActionX76941923", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationMemberRemovedActionX76941923 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationMemberRemovedActionX76941923) {
      encoder.encodeString(value.value)
    }
  }
}
