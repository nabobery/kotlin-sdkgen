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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue/properties/user/properties/type
 */
@Serializable(with = InlineWebhooksIssueUserTypeX056191ef.Serializer::class)
public sealed class InlineWebhooksIssueUserTypeX056191ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksIssueUserTypeX056191ef() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksIssueUserTypeX056191ef() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksIssueUserTypeX056191ef() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhooksIssueUserTypeX056191ef() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksIssueUserTypeX056191ef()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksIssueUserTypeX056191ef = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksIssueUserTypeX056191ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksIssueUserTypeX056191ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksIssueUserTypeX056191ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksIssueUserTypeX056191ef) {
      encoder.encodeString(value.value)
    }
  }
}
