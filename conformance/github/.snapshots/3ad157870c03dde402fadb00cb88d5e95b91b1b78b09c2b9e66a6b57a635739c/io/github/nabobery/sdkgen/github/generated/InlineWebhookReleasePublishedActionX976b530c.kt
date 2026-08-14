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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-published/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-published/properties/action
 */
@Serializable(with = InlineWebhookReleasePublishedActionX976b530c.Serializer::class)
public sealed class InlineWebhookReleasePublishedActionX976b530c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineWebhookReleasePublishedActionX976b530c() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleasePublishedActionX976b530c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleasePublishedActionX976b530c = when (value) {
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleasePublishedActionX976b530c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookReleasePublishedActionX976b530c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePublishedActionX976b530c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePublishedActionX976b530c) {
      encoder.encodeString(value.value)
    }
  }
}
