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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1members/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}~1members/get/parameters/1/schema
 */
@Serializable(with = InlineTeamsMembersGetParameterXfe84a019.Serializer::class)
public sealed class InlineTeamsMembersGetParameterXfe84a019 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineTeamsMembersGetParameterXfe84a019() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `maintainer`.
   */
  public data object Maintainer : InlineTeamsMembersGetParameterXfe84a019() {
    public override val `value`: String = "maintainer"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineTeamsMembersGetParameterXfe84a019() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsMembersGetParameterXfe84a019()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsMembersGetParameterXfe84a019 = when (value) {
      Member.value -> Member
      Maintainer.value -> Maintainer
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamsMembersGetParameterXfe84a019> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamsMembersGetParameterXfe84a019", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsMembersGetParameterXfe84a019 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsMembersGetParameterXfe84a019) {
      encoder.encodeString(value.value)
    }
  }
}
