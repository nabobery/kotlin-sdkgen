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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-deleted/properties/action
 */
@Serializable(with = InlineWebhookRepositoryRulesetDeletedActionX2ca18977.Serializer::class)
public sealed class InlineWebhookRepositoryRulesetDeletedActionX2ca18977 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookRepositoryRulesetDeletedActionX2ca18977() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryRulesetDeletedActionX2ca18977()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryRulesetDeletedActionX2ca18977 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryRulesetDeletedActionX2ca18977> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRepositoryRulesetDeletedActionX2ca18977", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRulesetDeletedActionX2ca18977 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRulesetDeletedActionX2ca18977) {
      encoder.encodeString(value.value)
    }
  }
}
