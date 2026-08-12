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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release/properties/assets/ite
 * ms/properties/uploader/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release/properties/assets/ite
 * ms/properties/uploader/properties/type
 */
@Serializable(with = InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa.Serializer::class)
public sealed class InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePrereleasedReleaseAssetsItemUploaderTypeX610edeaa) {
      encoder.encodeString(value.value)
    }
  }
}
