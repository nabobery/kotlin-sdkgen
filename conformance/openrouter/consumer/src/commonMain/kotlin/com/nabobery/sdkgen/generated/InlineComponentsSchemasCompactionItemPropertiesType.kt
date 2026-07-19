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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompactionItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCompactionItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCompactionItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineComponentsSchemasCompactionItemPropertiesType() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCompactionItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCompactionItemPropertiesType = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCompactionItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCompactionItemPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCompactionItemPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCompactionItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
