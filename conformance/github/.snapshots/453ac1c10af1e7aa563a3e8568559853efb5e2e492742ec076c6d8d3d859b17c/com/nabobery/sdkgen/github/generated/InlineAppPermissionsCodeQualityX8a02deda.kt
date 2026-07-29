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
 * The level of permission to grant the access token to view and manage code quality data.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/code_quality
 */
@Serializable(with = InlineAppPermissionsCodeQualityX8a02deda.Serializer::class)
public sealed class InlineAppPermissionsCodeQualityX8a02deda {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsCodeQualityX8a02deda() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsCodeQualityX8a02deda() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsCodeQualityX8a02deda()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsCodeQualityX8a02deda = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsCodeQualityX8a02deda> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsCodeQualityX8a02deda", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsCodeQualityX8a02deda = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsCodeQualityX8a02deda) {
      encoder.encodeString(value.value)
    }
  }
}
