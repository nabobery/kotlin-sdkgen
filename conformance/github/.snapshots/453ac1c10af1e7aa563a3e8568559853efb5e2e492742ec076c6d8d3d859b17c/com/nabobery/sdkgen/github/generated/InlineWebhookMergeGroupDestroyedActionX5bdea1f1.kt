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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-destroyed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-destroyed/properties/action
 */
@Serializable(with = InlineWebhookMergeGroupDestroyedActionX5bdea1f1.Serializer::class)
public sealed class InlineWebhookMergeGroupDestroyedActionX5bdea1f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `destroyed`.
   */
  public data object Destroyed : InlineWebhookMergeGroupDestroyedActionX5bdea1f1() {
    public override val `value`: String = "destroyed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMergeGroupDestroyedActionX5bdea1f1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMergeGroupDestroyedActionX5bdea1f1 = when (value) {
      Destroyed.value -> Destroyed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMergeGroupDestroyedActionX5bdea1f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMergeGroupDestroyedActionX5bdea1f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMergeGroupDestroyedActionX5bdea1f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMergeGroupDestroyedActionX5bdea1f1) {
      encoder.encodeString(value.value)
    }
  }
}
