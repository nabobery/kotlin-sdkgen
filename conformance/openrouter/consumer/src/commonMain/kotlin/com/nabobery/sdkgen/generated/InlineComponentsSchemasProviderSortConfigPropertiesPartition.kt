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
 */
@Serializable(with = InlineComponentsSchemasProviderSortConfigPropertiesPartition.Serializer::class)
public sealed class InlineComponentsSchemasProviderSortConfigPropertiesPartition {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `model`.
   */
  public data object Model : InlineComponentsSchemasProviderSortConfigPropertiesPartition() {
    public override val `value`: String = "model"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineComponentsSchemasProviderSortConfigPropertiesPartition() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasProviderSortConfigPropertiesPartition()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasProviderSortConfigPropertiesPartition = when (value) {
      Model.value -> Model
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasProviderSortConfigPropertiesPartition> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasProviderSortConfigPropertiesPartition", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasProviderSortConfigPropertiesPartition =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasProviderSortConfigPropertiesPartition) {
      encoder.encodeString(value.value)
    }
  }
}
