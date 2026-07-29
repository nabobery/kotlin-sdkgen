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
 * **Closing down notice**. The permission that new repositories will be added to the team with when none is specified.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}/patch/requestBody/content/application~1json/sch
 * ema/properties/permission
 */
@Serializable(with = InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57.Serializer::class)
public sealed class InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57 = when (value) {
      Pull.value -> Pull
      Push.value -> Push
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPatchRequestJsonPermissionX71bf0d57) {
      encoder.encodeString(value.value)
    }
  }
}
