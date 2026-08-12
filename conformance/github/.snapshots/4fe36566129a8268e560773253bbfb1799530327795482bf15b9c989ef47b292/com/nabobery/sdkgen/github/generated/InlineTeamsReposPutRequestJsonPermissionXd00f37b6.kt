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
 * The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute
 * will be used to determine what permission to grant the team on this repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1repos~1{owner}~1{repo}/put/requestBody/content/application~1j
 * son/schema/properties/permission
 */
@Serializable(with = InlineTeamsReposPutRequestJsonPermissionXd00f37b6.Serializer::class)
public sealed class InlineTeamsReposPutRequestJsonPermissionXd00f37b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineTeamsReposPutRequestJsonPermissionXd00f37b6() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineTeamsReposPutRequestJsonPermissionXd00f37b6() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineTeamsReposPutRequestJsonPermissionXd00f37b6() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsReposPutRequestJsonPermissionXd00f37b6()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsReposPutRequestJsonPermissionXd00f37b6 = when (value) {
      Pull.value -> Pull
      Push.value -> Push
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamsReposPutRequestJsonPermissionXd00f37b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamsReposPutRequestJsonPermissionXd00f37b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsReposPutRequestJsonPermissionXd00f37b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsReposPutRequestJsonPermissionXd00f37b6) {
      encoder.encodeString(value.value)
    }
  }
}
