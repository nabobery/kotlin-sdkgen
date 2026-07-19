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
 * Dataset version. Field names and grain are stable for the life of `v1`.
 */
@Serializable(with = InlineComponentsSchemasRankingsDailyMetaPropertiesVersion.Serializer::class)
public sealed class InlineComponentsSchemasRankingsDailyMetaPropertiesVersion {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `v1`.
   */
  public data object V1 : InlineComponentsSchemasRankingsDailyMetaPropertiesVersion() {
    public override val `value`: String = "v1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasRankingsDailyMetaPropertiesVersion()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasRankingsDailyMetaPropertiesVersion = when (value) {
      V1.value -> V1
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasRankingsDailyMetaPropertiesVersion> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasRankingsDailyMetaPropertiesVersion", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasRankingsDailyMetaPropertiesVersion =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasRankingsDailyMetaPropertiesVersion) {
      encoder.encodeString(value.value)
    }
  }
}
