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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContextCompactionItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContextCompactionItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContextCompactionItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `context_compaction`.
   */
  public data object ContextCompaction : InlineComponentsSchemasContextCompactionItemPropertiesType() {
    public override val `value`: String = "context_compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContextCompactionItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContextCompactionItemPropertiesType = when (value) {
      ContextCompaction.value -> ContextCompaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContextCompactionItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContextCompactionItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContextCompactionItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContextCompactionItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
