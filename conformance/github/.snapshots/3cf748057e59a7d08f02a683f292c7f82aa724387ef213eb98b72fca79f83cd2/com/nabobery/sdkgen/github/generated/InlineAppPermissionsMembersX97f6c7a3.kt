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
 * The level of permission to grant the access token for organization teams and members.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/members
 */
@Serializable(with = InlineAppPermissionsMembersX97f6c7a3.Serializer::class)
public sealed class InlineAppPermissionsMembersX97f6c7a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsMembersX97f6c7a3() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsMembersX97f6c7a3() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsMembersX97f6c7a3()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsMembersX97f6c7a3 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsMembersX97f6c7a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsMembersX97f6c7a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsMembersX97f6c7a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsMembersX97f6c7a3) {
      encoder.encodeString(value.value)
    }
  }
}
