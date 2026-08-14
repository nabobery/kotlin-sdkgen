package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The level of permission to grant the access token for managing repository environments.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/environments
 */
@Serializable(with = InlineAppPermissionsEnvironmentsXc27123e6.Serializer::class)
public sealed class InlineAppPermissionsEnvironmentsXc27123e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsEnvironmentsXc27123e6() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsEnvironmentsXc27123e6() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsEnvironmentsXc27123e6()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsEnvironmentsXc27123e6 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsEnvironmentsXc27123e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsEnvironmentsXc27123e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsEnvironmentsXc27123e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsEnvironmentsXc27123e6) {
      encoder.encodeString(value.value)
    }
  }
}
