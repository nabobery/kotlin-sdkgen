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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/release/properties/author/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/release/properties/author/properties/type
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e.Serializer::class)
public sealed class InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValuePackageVersionReleaseAuthorTypeXa090f32e) {
      encoder.encodeString(value.value)
    }
  }
}
