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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocked-by-removed/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-dependencies-blocked-by-removed/properties/action
 */
@Serializable(with = InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10.Serializer::class)
public sealed class InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `blocked_by_removed`.
   */
  public data object BlockedByRemoved : InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10() {
    public override val `value`: String = "blocked_by_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10 = when (value) {
      BlockedByRemoved.value -> BlockedByRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueDependenciesBlockedByRemovedActionXb19dbd10) {
      encoder.encodeString(value.value)
    }
  }
}
