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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/action
 */
@Serializable(with = InlineWebhookPullRequestAssignedActionX19bd510d.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedActionX19bd510d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assigned`.
   */
  public data object Assigned : InlineWebhookPullRequestAssignedActionX19bd510d() {
    public override val `value`: String = "assigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedActionX19bd510d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedActionX19bd510d = when (value) {
      Assigned.value -> Assigned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedActionX19bd510d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedActionX19bd510d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedActionX19bd510d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedActionX19bd510d) {
      encoder.encodeString(value.value)
    }
  }
}
