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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/assignees/items/pr
 * operties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/issue/properties/assignees/items/pr
 * operties/type
 */
@Serializable(with = InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a.Serializer::class)
public sealed class InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedIssueAssigneesItemTypeX9817305a) {
      encoder.encodeString(value.value)
    }
  }
}
