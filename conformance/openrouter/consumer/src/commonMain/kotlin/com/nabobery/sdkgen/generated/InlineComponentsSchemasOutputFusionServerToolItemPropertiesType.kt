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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputFusionServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputFusionServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:fusion`.
   */
  public data object OpenrouterFusion : InlineComponentsSchemasOutputFusionServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputFusionServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputFusionServerToolItemPropertiesType =
      when (value) {
      OpenrouterFusion.value -> OpenrouterFusion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputFusionServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputFusionServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputFusionServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputFusionServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
