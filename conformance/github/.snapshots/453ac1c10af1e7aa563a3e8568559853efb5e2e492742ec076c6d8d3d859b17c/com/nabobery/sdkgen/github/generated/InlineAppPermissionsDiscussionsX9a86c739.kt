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
 * The level of permission to grant the access token for discussions and related comments and labels.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/discussions
 */
@Serializable(with = InlineAppPermissionsDiscussionsX9a86c739.Serializer::class)
public sealed class InlineAppPermissionsDiscussionsX9a86c739 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsDiscussionsX9a86c739() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsDiscussionsX9a86c739() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsDiscussionsX9a86c739()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsDiscussionsX9a86c739 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsDiscussionsX9a86c739> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsDiscussionsX9a86c739", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsDiscussionsX9a86c739 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsDiscussionsX9a86c739) {
      encoder.encodeString(value.value)
    }
  }
}
