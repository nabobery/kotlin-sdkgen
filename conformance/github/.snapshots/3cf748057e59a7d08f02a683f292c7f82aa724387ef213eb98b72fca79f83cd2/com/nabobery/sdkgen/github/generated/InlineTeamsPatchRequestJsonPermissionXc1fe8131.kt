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
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}/patch/requestBody/content/application~1json/schema/properties/
 * permission
 */
@Serializable(with = InlineTeamsPatchRequestJsonPermissionXc1fe8131.Serializer::class)
public sealed class InlineTeamsPatchRequestJsonPermissionXc1fe8131 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineTeamsPatchRequestJsonPermissionXc1fe8131() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineTeamsPatchRequestJsonPermissionXc1fe8131() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineTeamsPatchRequestJsonPermissionXc1fe8131() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsPatchRequestJsonPermissionXc1fe8131()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsPatchRequestJsonPermissionXc1fe8131 = when (value) {
      Pull.value -> Pull
      Push.value -> Push
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamsPatchRequestJsonPermissionXc1fe8131> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamsPatchRequestJsonPermissionXc1fe8131", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsPatchRequestJsonPermissionXc1fe8131 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsPatchRequestJsonPermissionXc1fe8131) {
      encoder.encodeString(value.value)
    }
  }
}
