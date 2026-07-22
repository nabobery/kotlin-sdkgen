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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-closed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-closed/properties/action
 */
@Serializable(with = InlineWebhookDiscussionClosedActionX0792079f.Serializer::class)
public sealed class InlineWebhookDiscussionClosedActionX0792079f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookDiscussionClosedActionX0792079f() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionClosedActionX0792079f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionClosedActionX0792079f = when (value) {
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionClosedActionX0792079f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionClosedActionX0792079f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionClosedActionX0792079f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionClosedActionX0792079f) {
      encoder.encodeString(value.value)
    }
  }
}
