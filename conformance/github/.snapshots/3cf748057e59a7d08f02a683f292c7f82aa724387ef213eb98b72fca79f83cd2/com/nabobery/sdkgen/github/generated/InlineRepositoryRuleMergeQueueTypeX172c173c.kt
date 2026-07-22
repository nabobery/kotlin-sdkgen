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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/type
 */
@Serializable(with = InlineRepositoryRuleMergeQueueTypeX172c173c.Serializer::class)
public sealed class InlineRepositoryRuleMergeQueueTypeX172c173c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge_queue`.
   */
  public data object MergeQueue : InlineRepositoryRuleMergeQueueTypeX172c173c() {
    public override val `value`: String = "merge_queue"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleMergeQueueTypeX172c173c()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleMergeQueueTypeX172c173c = when (value) {
      MergeQueue.value -> MergeQueue
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleMergeQueueTypeX172c173c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleMergeQueueTypeX172c173c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMergeQueueTypeX172c173c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMergeQueueTypeX172c173c) {
      encoder.encodeString(value.value)
    }
  }
}
