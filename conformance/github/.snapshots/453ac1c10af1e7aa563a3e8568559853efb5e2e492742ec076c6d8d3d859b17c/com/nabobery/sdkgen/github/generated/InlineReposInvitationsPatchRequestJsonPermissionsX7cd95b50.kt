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
 * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`,
 * `triage`, and `admin`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1invitations~1{invitation_id}/patch/requestBody/content/
 * application~1json/schema/properties/permissions
 */
@Serializable(with = InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50.Serializer::class)
public sealed class InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `maintain`.
   */
  public data object Maintain : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50() {
    public override val `value`: String = "maintain"
  }

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50()

  public companion object {
    public fun fromValue(`value`: String): InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50 = when (value) {
      Read.value -> Read
      Write.value -> Write
      Maintain.value -> Maintain
      Triage.value -> Triage
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposInvitationsPatchRequestJsonPermissionsX7cd95b50) {
      encoder.encodeString(value.value)
    }
  }
}
