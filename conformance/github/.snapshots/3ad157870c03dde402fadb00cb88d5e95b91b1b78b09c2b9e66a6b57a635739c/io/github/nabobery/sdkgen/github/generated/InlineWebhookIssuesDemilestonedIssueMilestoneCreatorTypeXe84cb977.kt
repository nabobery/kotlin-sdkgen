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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/milestone/pr
 * operties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-demilestoned/properties/issue/properties/milestone/pr
 * operties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977.Serializer::class)
public sealed class InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesDemilestonedIssueMilestoneCreatorTypeXe84cb977) {
      encoder.encodeString(value.value)
    }
  }
}
