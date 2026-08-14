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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/type
 */
@Serializable(with = InlineOutputFusionServerToolItemTypeX66d6265a.Serializer::class)
public sealed class InlineOutputFusionServerToolItemTypeX66d6265a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:fusion`.
   */
  public data object OpenrouterFusion : InlineOutputFusionServerToolItemTypeX66d6265a() {
    public override val `value`: String = "openrouter:fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputFusionServerToolItemTypeX66d6265a()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputFusionServerToolItemTypeX66d6265a = when (value) {
      OpenrouterFusion.value -> OpenrouterFusion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputFusionServerToolItemTypeX66d6265a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputFusionServerToolItemTypeX66d6265a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputFusionServerToolItemTypeX66d6265a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputFusionServerToolItemTypeX66d6265a) {
      encoder.encodeString(value.value)
    }
  }
}
