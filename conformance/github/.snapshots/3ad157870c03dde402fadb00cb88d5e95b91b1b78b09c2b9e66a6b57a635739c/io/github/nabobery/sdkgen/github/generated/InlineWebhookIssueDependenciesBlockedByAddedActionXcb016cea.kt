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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocked-by-added/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocked-by-added/properties/action
 */
@Serializable(with = InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea.Serializer::class)
public sealed class InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blocked_by_added`.
   */
  public data object BlockedByAdded : InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea() {
    public override val `value`: String = "blocked_by_added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea = when (value) {
      BlockedByAdded.value -> BlockedByAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueDependenciesBlockedByAddedActionXcb016cea) {
      encoder.encodeString(value.value)
    }
  }
}
