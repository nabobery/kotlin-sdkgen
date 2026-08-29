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
 * The level of permission to grant the access token to view and manage interaction limits on a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/interaction_limits
 */
@Serializable(with = InlineAppPermissionsInteractionLimitsX3b3c372d.Serializer::class)
public sealed class InlineAppPermissionsInteractionLimitsX3b3c372d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsInteractionLimitsX3b3c372d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsInteractionLimitsX3b3c372d() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsInteractionLimitsX3b3c372d()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsInteractionLimitsX3b3c372d = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsInteractionLimitsX3b3c372d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsInteractionLimitsX3b3c372d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsInteractionLimitsX3b3c372d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsInteractionLimitsX3b3c372d) {
      encoder.encodeString(value.value)
    }
  }
}
