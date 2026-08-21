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
 * The type of Git ref object created in the repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-create/properties/ref_type
 */
@Serializable(with = InlineWebhookCreateRefTypeX9b7316c3.Serializer::class)
public sealed class InlineWebhookCreateRefTypeX9b7316c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tag`.
   */
  public data object Tag : InlineWebhookCreateRefTypeX9b7316c3() {
    public override val `value`: String = "tag"
  }

  /**
   * Documented value. Wire value: `branch`.
   */
  public data object Branch : InlineWebhookCreateRefTypeX9b7316c3() {
    public override val `value`: String = "branch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCreateRefTypeX9b7316c3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCreateRefTypeX9b7316c3 = when (value) {
      Tag.value -> Tag
      Branch.value -> Branch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCreateRefTypeX9b7316c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookCreateRefTypeX9b7316c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCreateRefTypeX9b7316c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCreateRefTypeX9b7316c3) {
      encoder.encodeString(value.value)
    }
  }
}
