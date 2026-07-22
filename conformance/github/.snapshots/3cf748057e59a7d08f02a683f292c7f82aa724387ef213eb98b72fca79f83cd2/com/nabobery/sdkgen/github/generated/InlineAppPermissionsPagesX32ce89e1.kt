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
 * The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds, as well as
 * create new builds.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/pages
 */
@Serializable(with = InlineAppPermissionsPagesX32ce89e1.Serializer::class)
public sealed class InlineAppPermissionsPagesX32ce89e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsPagesX32ce89e1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsPagesX32ce89e1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsPagesX32ce89e1()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsPagesX32ce89e1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsPagesX32ce89e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsPagesX32ce89e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsPagesX32ce89e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsPagesX32ce89e1) {
      encoder.encodeString(value.value)
    }
  }
}
