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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/author/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/author/properties/type
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235.Serializer::class)
public sealed class InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionAuthorTypeXfb41a235) {
      encoder.encodeString(value.value)
    }
  }
}
