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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocking-removed/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocking-removed/properties/action
 */
@Serializable(with = InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a.Serializer::class)
public sealed class InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blocking_removed`.
   */
  public data object BlockingRemoved : InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a() {
    public override val `value`: String = "blocking_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a = when (value) {
      BlockingRemoved.value -> BlockingRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueDependenciesBlockingRemovedActionXc8be621a) {
      encoder.encodeString(value.value)
    }
  }
}
