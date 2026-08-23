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
 * The permission associated with the invitation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-invitation/properties/permissions
 */
@Serializable(with = InlineRepositoryInvitationPermissionsXe2c9647d.Serializer::class)
public sealed class InlineRepositoryInvitationPermissionsXe2c9647d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineRepositoryInvitationPermissionsXe2c9647d() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineRepositoryInvitationPermissionsXe2c9647d() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineRepositoryInvitationPermissionsXe2c9647d() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineRepositoryInvitationPermissionsXe2c9647d() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `maintain`.
   */
  public data object Maintain : InlineRepositoryInvitationPermissionsXe2c9647d() {
    public override val `value`: String = "maintain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryInvitationPermissionsXe2c9647d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryInvitationPermissionsXe2c9647d = when (value) {
      Read.value -> Read
      Write.value -> Write
      Admin.value -> Admin
      Triage.value -> Triage
      Maintain.value -> Maintain
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryInvitationPermissionsXe2c9647d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryInvitationPermissionsXe2c9647d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryInvitationPermissionsXe2c9647d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryInvitationPermissionsXe2c9647d) {
      encoder.encodeString(value.value)
    }
  }
}
