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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/action
 */
@Serializable(with = InlineWebhookIssuesUnlockedActionXa6b5725e.Serializer::class)
public sealed class InlineWebhookIssuesUnlockedActionXa6b5725e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unlocked`.
   */
  public data object Unlocked : InlineWebhookIssuesUnlockedActionXa6b5725e() {
    public override val `value`: String = "unlocked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesUnlockedActionXa6b5725e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesUnlockedActionXa6b5725e = when (value) {
      Unlocked.value -> Unlocked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesUnlockedActionXa6b5725e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesUnlockedActionXa6b5725e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedActionXa6b5725e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedActionXa6b5725e) {
      encoder.encodeString(value.value)
    }
  }
}
