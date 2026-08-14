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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestBaseUserTypeXea1719a2) {
      encoder.encodeString(value.value)
    }
  }
}
