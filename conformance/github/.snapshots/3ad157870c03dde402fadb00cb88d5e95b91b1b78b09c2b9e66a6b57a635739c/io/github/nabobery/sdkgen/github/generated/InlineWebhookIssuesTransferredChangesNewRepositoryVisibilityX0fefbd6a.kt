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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_reposit
 * ory/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-transferred/properties/changes/properties/new_reposit
 * ory/properties/visibility
 */
@Serializable(with = InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a.Serializer::class)
public sealed class InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesTransferredChangesNewRepositoryVisibilityX0fefbd6a) {
      encoder.encodeString(value.value)
    }
  }
}
