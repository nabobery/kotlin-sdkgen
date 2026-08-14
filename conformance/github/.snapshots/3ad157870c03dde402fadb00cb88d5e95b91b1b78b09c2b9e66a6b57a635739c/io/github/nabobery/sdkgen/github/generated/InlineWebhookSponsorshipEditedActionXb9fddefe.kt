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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-sponsorship-edited/properties/action
 */
@Serializable(with = InlineWebhookSponsorshipEditedActionXb9fddefe.Serializer::class)
public sealed class InlineWebhookSponsorshipEditedActionXb9fddefe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookSponsorshipEditedActionXb9fddefe() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookSponsorshipEditedActionXb9fddefe()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookSponsorshipEditedActionXb9fddefe = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookSponsorshipEditedActionXb9fddefe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookSponsorshipEditedActionXb9fddefe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookSponsorshipEditedActionXb9fddefe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSponsorshipEditedActionXb9fddefe) {
      encoder.encodeString(value.value)
    }
  }
}
