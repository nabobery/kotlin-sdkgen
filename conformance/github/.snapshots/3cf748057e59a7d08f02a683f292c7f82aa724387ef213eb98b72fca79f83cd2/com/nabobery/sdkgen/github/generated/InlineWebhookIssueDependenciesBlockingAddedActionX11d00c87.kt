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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocking-added/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocking-added/properties/action
 */
@Serializable(with = InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87.Serializer::class)
public sealed class InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blocking_added`.
   */
  public data object BlockingAdded : InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87() {
    public override val `value`: String = "blocking_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87 = when (value) {
      BlockingAdded.value -> BlockingAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueDependenciesBlockingAddedActionX11d00c87) {
      encoder.encodeString(value.value)
    }
  }
}
