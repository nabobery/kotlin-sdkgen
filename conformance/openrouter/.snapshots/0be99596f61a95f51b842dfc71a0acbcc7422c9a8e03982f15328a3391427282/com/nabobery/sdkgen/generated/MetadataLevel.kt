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
 * Opt-in level for surfacing routing metadata on the response under `openrouter_metadata`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MetadataLevel
 */
@Serializable(with = MetadataLevel.Serializer::class)
public sealed class MetadataLevel {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : MetadataLevel() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : MetadataLevel() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : MetadataLevel()

  public companion object {
    public fun fromValue(`value`: String): MetadataLevel = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<MetadataLevel> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.MetadataLevel", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): MetadataLevel = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: MetadataLevel) {
      encoder.encodeString(value.value)
    }
  }
}
