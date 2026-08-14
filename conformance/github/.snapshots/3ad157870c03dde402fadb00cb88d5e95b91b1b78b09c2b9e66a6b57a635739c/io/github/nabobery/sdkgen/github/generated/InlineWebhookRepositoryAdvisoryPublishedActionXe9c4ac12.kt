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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-published/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-advisory-published/properties/action
 */
@Serializable(with = InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12.Serializer::class)
public sealed class InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12 = when (value) {
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryAdvisoryPublishedActionXe9c4ac12) {
      encoder.encodeString(value.value)
    }
  }
}
