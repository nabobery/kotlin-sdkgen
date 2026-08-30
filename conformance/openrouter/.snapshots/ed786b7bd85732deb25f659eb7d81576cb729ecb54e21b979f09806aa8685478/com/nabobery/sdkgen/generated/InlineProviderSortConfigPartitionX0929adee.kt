package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Partitioning strategy for sorting: "model" (default) groups endpoints by model before sorting (fallback models remain
 * fallbacks), "none" sorts all endpoints together regardless of model.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ProviderSortConfig/properties/partition
 */
@Serializable(with = InlineProviderSortConfigPartitionX0929adee.Serializer::class)
public sealed class InlineProviderSortConfigPartitionX0929adee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `model`.
   */
  public data object Model : InlineProviderSortConfigPartitionX0929adee() {
    public override val `value`: String = "model"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineProviderSortConfigPartitionX0929adee() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProviderSortConfigPartitionX0929adee()

  public companion object {
    public fun fromValue(`value`: String): InlineProviderSortConfigPartitionX0929adee = when (value) {
      Model.value -> Model
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProviderSortConfigPartitionX0929adee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineProviderSortConfigPartitionX0929adee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProviderSortConfigPartitionX0929adee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProviderSortConfigPartitionX0929adee) {
      encoder.encodeString(value.value)
    }
  }
}
