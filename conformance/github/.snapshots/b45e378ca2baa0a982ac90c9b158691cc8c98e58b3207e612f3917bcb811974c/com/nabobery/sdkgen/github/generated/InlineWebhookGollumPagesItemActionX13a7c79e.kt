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
 * The action that was performed on the page. Can be `created` or `edited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-gollum/properties/pages/items/properties/action
 */
@Serializable(with = InlineWebhookGollumPagesItemActionX13a7c79e.Serializer::class)
public sealed class InlineWebhookGollumPagesItemActionX13a7c79e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookGollumPagesItemActionX13a7c79e() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookGollumPagesItemActionX13a7c79e() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookGollumPagesItemActionX13a7c79e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookGollumPagesItemActionX13a7c79e = when (value) {
      Created.value -> Created
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookGollumPagesItemActionX13a7c79e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookGollumPagesItemActionX13a7c79e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookGollumPagesItemActionX13a7c79e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookGollumPagesItemActionX13a7c79e) {
      encoder.encodeString(value.value)
    }
  }
}
