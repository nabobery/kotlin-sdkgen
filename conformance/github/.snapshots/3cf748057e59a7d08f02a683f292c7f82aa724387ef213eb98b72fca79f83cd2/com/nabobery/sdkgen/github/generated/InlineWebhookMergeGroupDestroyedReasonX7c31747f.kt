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
 * Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued),
 * or invalidated by an earlier queue entry being dequeued (invalidated).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-merge-group-destroyed/properties/reason
 */
@Serializable(with = InlineWebhookMergeGroupDestroyedReasonX7c31747f.Serializer::class)
public sealed class InlineWebhookMergeGroupDestroyedReasonX7c31747f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merged`.
   */
  public data object Merged : InlineWebhookMergeGroupDestroyedReasonX7c31747f() {
    public override val `value`: String = "merged"
  }

  /**
   * Documented value. Wire value: `invalidated`.
   */
  public data object Invalidated : InlineWebhookMergeGroupDestroyedReasonX7c31747f() {
    public override val `value`: String = "invalidated"
  }

  /**
   * Documented value. Wire value: `dequeued`.
   */
  public data object Dequeued : InlineWebhookMergeGroupDestroyedReasonX7c31747f() {
    public override val `value`: String = "dequeued"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMergeGroupDestroyedReasonX7c31747f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMergeGroupDestroyedReasonX7c31747f = when (value) {
      Merged.value -> Merged
      Invalidated.value -> Invalidated
      Dequeued.value -> Dequeued
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMergeGroupDestroyedReasonX7c31747f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMergeGroupDestroyedReasonX7c31747f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMergeGroupDestroyedReasonX7c31747f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMergeGroupDestroyedReasonX7c31747f) {
      encoder.encodeString(value.value)
    }
  }
}
