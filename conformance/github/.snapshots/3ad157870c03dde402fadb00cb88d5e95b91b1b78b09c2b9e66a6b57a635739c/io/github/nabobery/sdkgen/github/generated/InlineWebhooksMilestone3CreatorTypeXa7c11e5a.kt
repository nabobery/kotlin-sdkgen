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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone_3/properties/creator/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_milestone_3/properties/creator/properties/type
 */
@Serializable(with = InlineWebhooksMilestone3CreatorTypeXa7c11e5a.Serializer::class)
public sealed class InlineWebhooksMilestone3CreatorTypeXa7c11e5a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksMilestone3CreatorTypeXa7c11e5a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksMilestone3CreatorTypeXa7c11e5a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksMilestone3CreatorTypeXa7c11e5a() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksMilestone3CreatorTypeXa7c11e5a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksMilestone3CreatorTypeXa7c11e5a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksMilestone3CreatorTypeXa7c11e5a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksMilestone3CreatorTypeXa7c11e5a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksMilestone3CreatorTypeXa7c11e5a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMilestone3CreatorTypeXa7c11e5a) {
      encoder.encodeString(value.value)
    }
  }
}
