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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/merged_by/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/merged_by/properties/type
 */
@Serializable(with = InlineWebhooksPullRequest5MergedByTypeXbea520b2.Serializer::class)
public sealed class InlineWebhooksPullRequest5MergedByTypeXbea520b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksPullRequest5MergedByTypeXbea520b2() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksPullRequest5MergedByTypeXbea520b2() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksPullRequest5MergedByTypeXbea520b2() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksPullRequest5MergedByTypeXbea520b2() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5MergedByTypeXbea520b2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5MergedByTypeXbea520b2 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5MergedByTypeXbea520b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5MergedByTypeXbea520b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5MergedByTypeXbea520b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5MergedByTypeXbea520b2) {
      encoder.encodeString(value.value)
    }
  }
}
