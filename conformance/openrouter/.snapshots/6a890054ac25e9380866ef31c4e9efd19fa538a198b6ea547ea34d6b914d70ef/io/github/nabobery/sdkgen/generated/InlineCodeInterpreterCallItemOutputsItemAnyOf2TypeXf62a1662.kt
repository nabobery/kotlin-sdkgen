package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1/properties/
 * type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1/properties/
 * type
 */
@Serializable(with = InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662.Serializer::class)
public sealed class InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `logs`.
   */
  public data object Logs : InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662() {
    public override val `value`: String = "logs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662 = when (value) {
      Logs.value -> Logs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemOutputsItemAnyOf2TypeXf62a1662) {
      encoder.encodeString(value.value)
    }
  }
}
