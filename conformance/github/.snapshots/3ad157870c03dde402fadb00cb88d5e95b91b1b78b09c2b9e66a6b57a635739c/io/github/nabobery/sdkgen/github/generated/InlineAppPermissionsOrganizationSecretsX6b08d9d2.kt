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
 * The level of permission to grant the access token to manage organization secrets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/organization_secrets
 */
@Serializable(with = InlineAppPermissionsOrganizationSecretsX6b08d9d2.Serializer::class)
public sealed class InlineAppPermissionsOrganizationSecretsX6b08d9d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsOrganizationSecretsX6b08d9d2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsOrganizationSecretsX6b08d9d2() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsOrganizationSecretsX6b08d9d2()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsOrganizationSecretsX6b08d9d2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsOrganizationSecretsX6b08d9d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsOrganizationSecretsX6b08d9d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsOrganizationSecretsX6b08d9d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsOrganizationSecretsX6b08d9d2) {
      encoder.encodeString(value.value)
    }
  }
}
