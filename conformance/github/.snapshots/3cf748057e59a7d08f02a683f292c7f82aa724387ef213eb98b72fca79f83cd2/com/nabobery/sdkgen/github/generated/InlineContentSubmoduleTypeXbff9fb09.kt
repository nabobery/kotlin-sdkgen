package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/content-submodule/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-submodule/properties/type
 */
@Serializable(with = InlineContentSubmoduleTypeXbff9fb09.Serializer::class)
public sealed class InlineContentSubmoduleTypeXbff9fb09 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `submodule`.
   */
  public data object Submodule : InlineContentSubmoduleTypeXbff9fb09() {
    public override val `value`: String = "submodule"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentSubmoduleTypeXbff9fb09()

  public companion object {
    public fun fromValue(`value`: String): InlineContentSubmoduleTypeXbff9fb09 = when (value) {
      Submodule.value -> Submodule
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineContentSubmoduleTypeXbff9fb09> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineContentSubmoduleTypeXbff9fb09", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentSubmoduleTypeXbff9fb09 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentSubmoduleTypeXbff9fb09) {
      encoder.encodeString(value.value)
    }
  }
}
