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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0/properties/
 * type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0/properties/
 * type
 */
@Serializable(with = InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089.Serializer::class)
public sealed class InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089 = when (value) {
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089) {
      encoder.encodeString(value.value)
    }
  }
}
