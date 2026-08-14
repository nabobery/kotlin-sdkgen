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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/pull_request_reviews_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_rule/properties/pull_request_reviews_enforcement_level
 */
@Serializable(with = InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2.Serializer::class)
public sealed class InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off`.
   */
  public data object Off : InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2() {
    public override val `value`: String = "off"
  }

  /**
   * Documented value. Wire value: `non_admins`.
   */
  public data object NonAdmins : InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2() {
    public override val `value`: String = "non_admins"
  }

  /**
   * Documented value. Wire value: `everyone`.
   */
  public data object Everyone : InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2() {
    public override val `value`: String = "everyone"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2 = when (value) {
      Off.value -> Off
      NonAdmins.value -> NonAdmins
      Everyone.value -> Everyone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRulePullRequestReviewsEnforcementLevelXc5c26ba2) {
      encoder.encodeString(value.value)
    }
  }
}
