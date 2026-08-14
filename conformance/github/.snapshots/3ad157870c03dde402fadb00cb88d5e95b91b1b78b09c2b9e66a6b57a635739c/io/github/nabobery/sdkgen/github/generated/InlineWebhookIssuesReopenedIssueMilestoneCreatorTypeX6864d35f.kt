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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/milestone/proper
 * ties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/milestone/proper
 * ties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f.Serializer::class)
public sealed class InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssueMilestoneCreatorTypeX6864d35f) {
      encoder.encodeString(value.value)
    }
  }
}
