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
 * The level of permission to grant the access token for checks on code.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/checks
 */
@Serializable(with = InlineAppPermissionsChecksX55bad9f3.Serializer::class)
public sealed class InlineAppPermissionsChecksX55bad9f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsChecksX55bad9f3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsChecksX55bad9f3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsChecksX55bad9f3()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsChecksX55bad9f3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsChecksX55bad9f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsChecksX55bad9f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsChecksX55bad9f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsChecksX55bad9f3) {
      encoder.encodeString(value.value)
    }
  }
}
