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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-created/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-created/properties/action
 */
@Serializable(with = InlineWebhookRepositoryCreatedActionXc1297e77.Serializer::class)
public sealed class InlineWebhookRepositoryCreatedActionXc1297e77 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineWebhookRepositoryCreatedActionXc1297e77() {
    public override val `value`: String = "created"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryCreatedActionXc1297e77()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryCreatedActionXc1297e77 = when (value) {
      Created.value -> Created
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryCreatedActionXc1297e77> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryCreatedActionXc1297e77", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryCreatedActionXc1297e77 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryCreatedActionXc1297e77) {
      encoder.encodeString(value.value)
    }
  }
}
