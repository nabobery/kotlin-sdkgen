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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ItemReferenceItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ItemReferenceItem/properties/type
 */
@Serializable(with = InlineItemReferenceItemTypeX85500400.Serializer::class)
public sealed class InlineItemReferenceItemTypeX85500400 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `item_reference`.
   */
  public data object ItemReference : InlineItemReferenceItemTypeX85500400() {
    public override val `value`: String = "item_reference"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineItemReferenceItemTypeX85500400()

  public companion object {
    public fun fromValue(`value`: String): InlineItemReferenceItemTypeX85500400 = when (value) {
      ItemReference.value -> ItemReference
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineItemReferenceItemTypeX85500400> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineItemReferenceItemTypeX85500400", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineItemReferenceItemTypeX85500400 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineItemReferenceItemTypeX85500400) {
      encoder.encodeString(value.value)
    }
  }
}
