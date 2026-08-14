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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1members/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}~1members/get/parameters/2/schema
 */
@Serializable(with = InlineOrgsTeamsMembersGetParameterXeb377714.Serializer::class)
public sealed class InlineOrgsTeamsMembersGetParameterXeb377714 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsTeamsMembersGetParameterXeb377714() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineOrgsTeamsMembersGetParameterXeb377714() {
    public override val `value`: String = "maintainer"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsTeamsMembersGetParameterXeb377714() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsMembersGetParameterXeb377714()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsMembersGetParameterXeb377714 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsMembersGetParameterXeb377714> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsMembersGetParameterXeb377714", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsMembersGetParameterXeb377714 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsMembersGetParameterXeb377714) {
      encoder.encodeString(value.value)
    }
  }
}
