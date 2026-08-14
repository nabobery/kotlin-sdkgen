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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled/properties/action
 */
@Serializable(with = InlineWebhookIssuesLabeledActionX42e574f4.Serializer::class)
public sealed class InlineWebhookIssuesLabeledActionX42e574f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineWebhookIssuesLabeledActionX42e574f4() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssuesLabeledActionX42e574f4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssuesLabeledActionX42e574f4 = when (value) {
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesLabeledActionX42e574f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssuesLabeledActionX42e574f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesLabeledActionX42e574f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesLabeledActionX42e574f4) {
      encoder.encodeString(value.value)
    }
  }
}
