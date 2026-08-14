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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/action
 */
@Serializable(with = InlineWebhookPullRequestLockedActionX868d1fdc.Serializer::class)
public sealed class InlineWebhookPullRequestLockedActionX868d1fdc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `locked`.
   */
  public data object Locked : InlineWebhookPullRequestLockedActionX868d1fdc() {
    public override val `value`: String = "locked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedActionX868d1fdc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedActionX868d1fdc = when (value) {
      Locked.value -> Locked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedActionX868d1fdc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedActionX868d1fdc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedActionX868d1fdc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedActionX868d1fdc) {
      encoder.encodeString(value.value)
    }
  }
}
