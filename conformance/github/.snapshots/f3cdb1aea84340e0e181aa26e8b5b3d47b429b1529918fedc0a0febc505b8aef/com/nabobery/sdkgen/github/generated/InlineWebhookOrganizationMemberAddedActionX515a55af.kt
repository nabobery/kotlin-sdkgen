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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-added/properties/action
 */
@Serializable(with = InlineWebhookOrganizationMemberAddedActionX515a55af.Serializer::class)
public sealed class InlineWebhookOrganizationMemberAddedActionX515a55af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member_added`.
   */
  public data object MemberAdded : InlineWebhookOrganizationMemberAddedActionX515a55af() {
    public override val `value`: String = "member_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationMemberAddedActionX515a55af()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationMemberAddedActionX515a55af = when (value) {
      MemberAdded.value -> MemberAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationMemberAddedActionX515a55af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrganizationMemberAddedActionX515a55af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationMemberAddedActionX515a55af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationMemberAddedActionX515a55af) {
      encoder.encodeString(value.value)
    }
  }
}
