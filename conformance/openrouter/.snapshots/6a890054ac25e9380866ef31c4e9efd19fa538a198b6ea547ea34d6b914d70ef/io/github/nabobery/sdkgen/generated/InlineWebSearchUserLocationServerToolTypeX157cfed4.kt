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
 * sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocationServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocationServerTool/properties/type
 */
@Serializable(with = InlineWebSearchUserLocationServerToolTypeX157cfed4.Serializer::class)
public sealed class InlineWebSearchUserLocationServerToolTypeX157cfed4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineWebSearchUserLocationServerToolTypeX157cfed4() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchUserLocationServerToolTypeX157cfed4()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchUserLocationServerToolTypeX157cfed4 = when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchUserLocationServerToolTypeX157cfed4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchUserLocationServerToolTypeX157cfed4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchUserLocationServerToolTypeX157cfed4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchUserLocationServerToolTypeX157cfed4) {
      encoder.encodeString(value.value)
    }
  }
}
