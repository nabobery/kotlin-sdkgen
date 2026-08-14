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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/milestone/prop
 * erties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/milestone/prop
 * erties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee.Serializer::class)
public sealed class InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee) {
      encoder.encodeString(value.value)
    }
  }
}
