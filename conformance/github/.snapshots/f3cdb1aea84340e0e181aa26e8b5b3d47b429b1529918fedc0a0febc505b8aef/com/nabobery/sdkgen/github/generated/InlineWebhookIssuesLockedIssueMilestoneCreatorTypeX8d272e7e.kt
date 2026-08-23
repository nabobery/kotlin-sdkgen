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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/milestone/properti
 * es/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-locked/properties/issue/properties/milestone/properti
 * es/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e.Serializer::class)
public sealed class InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLockedIssueMilestoneCreatorTypeX8d272e7e) {
      encoder.encodeString(value.value)
    }
  }
}
