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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams/post/requestBody/content/application~1json/schema/properties
 * /permission
 */
@Serializable(with = InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d.Serializer::class)
public sealed class InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d() {
    public override val `value`: String = "push"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d = when (value) {
      Pull.value -> Pull
      Push.value -> Push
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPostRequestJsonPermissionX9a1a193d) {
      encoder.encodeString(value.value)
    }
  }
}
