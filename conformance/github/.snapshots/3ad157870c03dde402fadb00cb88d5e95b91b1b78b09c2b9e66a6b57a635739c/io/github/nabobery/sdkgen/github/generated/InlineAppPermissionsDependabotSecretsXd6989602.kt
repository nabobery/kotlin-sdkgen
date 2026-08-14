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
 * The level of permission to grant the access token to manage Dependabot secrets.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/dependabot_secrets
 */
@Serializable(with = InlineAppPermissionsDependabotSecretsXd6989602.Serializer::class)
public sealed class InlineAppPermissionsDependabotSecretsXd6989602 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsDependabotSecretsXd6989602() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsDependabotSecretsXd6989602() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsDependabotSecretsXd6989602()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsDependabotSecretsXd6989602 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsDependabotSecretsXd6989602> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsDependabotSecretsXd6989602", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsDependabotSecretsXd6989602 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsDependabotSecretsXd6989602) {
      encoder.encodeString(value.value)
    }
  }
}
