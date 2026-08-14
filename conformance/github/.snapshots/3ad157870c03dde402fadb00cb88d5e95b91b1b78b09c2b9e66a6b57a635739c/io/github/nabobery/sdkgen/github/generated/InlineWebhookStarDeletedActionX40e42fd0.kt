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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-star-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-star-deleted/properties/action
 */
@Serializable(with = InlineWebhookStarDeletedActionX40e42fd0.Serializer::class)
public sealed class InlineWebhookStarDeletedActionX40e42fd0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookStarDeletedActionX40e42fd0() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookStarDeletedActionX40e42fd0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookStarDeletedActionX40e42fd0 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookStarDeletedActionX40e42fd0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookStarDeletedActionX40e42fd0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookStarDeletedActionX40e42fd0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStarDeletedActionX40e42fd0) {
      encoder.encodeString(value.value)
    }
  }
}
