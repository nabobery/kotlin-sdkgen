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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/assignees/items/pr
 * operties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/assignees/items/pr
 * operties/type
 */
@Serializable(with = InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssueAssigneesItemTypeXfc0b1a33) {
      encoder.encodeString(value.value)
    }
  }
}
