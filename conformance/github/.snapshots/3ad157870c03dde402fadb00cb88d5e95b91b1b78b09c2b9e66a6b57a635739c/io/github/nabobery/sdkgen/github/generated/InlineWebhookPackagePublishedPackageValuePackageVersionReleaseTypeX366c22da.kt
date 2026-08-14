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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/release/properties/author/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/release/properties/author/properties/type
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da.Serializer::class)
public sealed class InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionReleaseTypeX366c22da) {
      encoder.encodeString(value.value)
    }
  }
}
