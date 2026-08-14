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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1/properties/ty
 * pe.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container/anyOf/1/properties/ty
 * pe
 */
@Serializable(with = InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04.Serializer::class)
public sealed class InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04() {
    public override val `value`: String = "auto"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04 = when (value) {
      Auto.value -> Auto
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterServerToolContainerAnyOf2TypeXd3baed04) {
      encoder.encodeString(value.value)
    }
  }
}
