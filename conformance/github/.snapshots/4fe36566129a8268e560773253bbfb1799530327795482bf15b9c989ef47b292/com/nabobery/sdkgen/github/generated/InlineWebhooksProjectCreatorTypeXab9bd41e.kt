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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_project/properties/creator/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project/properties/creator/properties/type
 */
@Serializable(with = InlineWebhooksProjectCreatorTypeXab9bd41e.Serializer::class)
public sealed class InlineWebhooksProjectCreatorTypeXab9bd41e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksProjectCreatorTypeXab9bd41e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksProjectCreatorTypeXab9bd41e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksProjectCreatorTypeXab9bd41e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksProjectCreatorTypeXab9bd41e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksProjectCreatorTypeXab9bd41e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksProjectCreatorTypeXab9bd41e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksProjectCreatorTypeXab9bd41e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksProjectCreatorTypeXab9bd41e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksProjectCreatorTypeXab9bd41e) {
      encoder.encodeString(value.value)
    }
  }
}
