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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/assi
 * gnees/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/assi
 * gnees/items/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestAssigneesItemTypeX497aeea6) {
      encoder.encodeString(value.value)
    }
  }
}
