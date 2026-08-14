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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlabeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlabeled/properties/action
 */
@Serializable(with = InlineWebhookIssuesUnlabeledActionX7607c1aa.Serializer::class)
public sealed class InlineWebhookIssuesUnlabeledActionX7607c1aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unlabeled`.
   */
  public data object Unlabeled : InlineWebhookIssuesUnlabeledActionX7607c1aa() {
    public override val `value`: String = "unlabeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlabeledActionX7607c1aa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlabeledActionX7607c1aa = when (value) {
      Unlabeled.value -> Unlabeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlabeledActionX7607c1aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlabeledActionX7607c1aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlabeledActionX7607c1aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlabeledActionX7607c1aa) {
      encoder.encodeString(value.value)
    }
  }
}
