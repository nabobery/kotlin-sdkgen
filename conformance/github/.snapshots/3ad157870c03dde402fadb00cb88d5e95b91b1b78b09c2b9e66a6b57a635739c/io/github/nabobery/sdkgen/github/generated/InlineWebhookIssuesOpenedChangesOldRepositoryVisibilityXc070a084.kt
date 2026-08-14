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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_repository/p
 * roperties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_repository/p
 * roperties/visibility
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084.Serializer::class)
public sealed class InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldRepositoryVisibilityXc070a084) {
      encoder.encodeString(value.value)
    }
  }
}
