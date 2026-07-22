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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unanswered/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unanswered/properties/action
 */
@Serializable(with = InlineWebhookDiscussionUnansweredActionXc66d0edd.Serializer::class)
public sealed class InlineWebhookDiscussionUnansweredActionXc66d0edd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unanswered`.
   */
  public data object Unanswered : InlineWebhookDiscussionUnansweredActionXc66d0edd() {
    public override val `value`: String = "unanswered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionUnansweredActionXc66d0edd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionUnansweredActionXc66d0edd = when (value) {
      Unanswered.value -> Unanswered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionUnansweredActionXc66d0edd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionUnansweredActionXc66d0edd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionUnansweredActionXc66d0edd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionUnansweredActionXc66d0edd) {
      encoder.encodeString(value.value)
    }
  }
}
