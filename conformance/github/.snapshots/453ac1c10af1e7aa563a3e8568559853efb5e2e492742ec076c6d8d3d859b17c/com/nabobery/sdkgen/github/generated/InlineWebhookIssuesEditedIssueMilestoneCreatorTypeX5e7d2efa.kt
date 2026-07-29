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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/milestone/properti
 * es/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/milestone/properti
 * es/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssueMilestoneCreatorTypeX5e7d2efa) {
      encoder.encodeString(value.value)
    }
  }
}
