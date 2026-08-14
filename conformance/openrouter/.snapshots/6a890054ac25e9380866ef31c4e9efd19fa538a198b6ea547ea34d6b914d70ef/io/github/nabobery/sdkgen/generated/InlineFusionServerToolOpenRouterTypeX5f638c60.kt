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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineFusionServerToolOpenRouterTypeX5f638c60.Serializer::class)
public sealed class InlineFusionServerToolOpenRouterTypeX5f638c60 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:fusion`.
   */
  public data object OpenrouterFusion : InlineFusionServerToolOpenRouterTypeX5f638c60() {
    public override val `value`: String = "openrouter:fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionServerToolOpenRouterTypeX5f638c60()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionServerToolOpenRouterTypeX5f638c60 = when (value) {
      OpenrouterFusion.value -> OpenrouterFusion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionServerToolOpenRouterTypeX5f638c60> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionServerToolOpenRouterTypeX5f638c60", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionServerToolOpenRouterTypeX5f638c60 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionServerToolOpenRouterTypeX5f638c60) {
      encoder.encodeString(value.value)
    }
  }
}
