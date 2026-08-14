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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/milestone/propert
 * ies/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/issue/properties/milestone/propert
 * ies/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9.Serializer::class)
public sealed class InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledIssueMilestoneCreatorTypeX0ebfc8a9) {
      encoder.encodeString(value.value)
    }
  }
}
