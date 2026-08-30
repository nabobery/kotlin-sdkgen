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
 * The level of permission to grant the access token for deployments and deployment statuses.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/deployments
 */
@Serializable(with = InlineAppPermissionsDeploymentsXa5b10b63.Serializer::class)
public sealed class InlineAppPermissionsDeploymentsXa5b10b63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsDeploymentsXa5b10b63() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsDeploymentsXa5b10b63() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsDeploymentsXa5b10b63()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsDeploymentsXa5b10b63 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsDeploymentsXa5b10b63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsDeploymentsXa5b10b63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsDeploymentsXa5b10b63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsDeploymentsXa5b10b63) {
      encoder.encodeString(value.value)
    }
  }
}
