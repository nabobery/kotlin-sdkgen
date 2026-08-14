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
 * The level of permission to grant the access token for repository creation, deletion, settings, teams, and
 * collaborators creation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/administration
 */
@Serializable(with = InlineAppPermissionsAdministrationXdde01ac1.Serializer::class)
public sealed class InlineAppPermissionsAdministrationXdde01ac1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsAdministrationXdde01ac1() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsAdministrationXdde01ac1() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsAdministrationXdde01ac1()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsAdministrationXdde01ac1 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsAdministrationXdde01ac1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsAdministrationXdde01ac1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsAdministrationXdde01ac1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsAdministrationXdde01ac1) {
      encoder.encodeString(value.value)
    }
  }
}
