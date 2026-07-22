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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release_1/properties/author/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_release_1/properties/author/properties/type
 */
@Serializable(with = InlineWebhooksRelease1AuthorTypeX421f5825.Serializer::class)
public sealed class InlineWebhooksRelease1AuthorTypeX421f5825 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksRelease1AuthorTypeX421f5825() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksRelease1AuthorTypeX421f5825() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksRelease1AuthorTypeX421f5825() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksRelease1AuthorTypeX421f5825()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksRelease1AuthorTypeX421f5825 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksRelease1AuthorTypeX421f5825> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksRelease1AuthorTypeX421f5825", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksRelease1AuthorTypeX421f5825 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksRelease1AuthorTypeX421f5825) {
      encoder.encodeString(value.value)
    }
  }
}
