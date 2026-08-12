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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/repository/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-team-deleted/properties/repository/properties/visibility
 */
@Serializable(with = InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2.Serializer::class)
public sealed class InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamDeletedRepositoryVisibilityX6cdff3e2) {
      encoder.encodeString(value.value)
    }
  }
}
