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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/action
 */
@Serializable(with = InlineWebhookPullRequestUnassignedActionX78556592.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedActionX78556592 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unassigned`.
   */
  public data object Unassigned : InlineWebhookPullRequestUnassignedActionX78556592() {
    public override val `value`: String = "unassigned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedActionX78556592()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedActionX78556592 = when (value) {
      Unassigned.value -> Unassigned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedActionX78556592> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedActionX78556592", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedActionX78556592 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedActionX78556592) {
      encoder.encodeString(value.value)
    }
  }
}
