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
 * How the team's access to the repository was granted. This property is only
 * present when the team is returned in a repository context, such as
 * `GET /repos/{owner}/{repo}/teams`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team/properties/access_source
 */
@Serializable(with = InlineTeamAccessSourceX85c3d22f.Serializer::class)
public sealed class InlineTeamAccessSourceX85c3d22f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineTeamAccessSourceX85c3d22f() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamAccessSourceX85c3d22f() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamAccessSourceX85c3d22f() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamAccessSourceX85c3d22f()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamAccessSourceX85c3d22f = when (value) {
      Direct.value -> Direct
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamAccessSourceX85c3d22f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineTeamAccessSourceX85c3d22f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamAccessSourceX85c3d22f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamAccessSourceX85c3d22f) {
      encoder.encodeString(value.value)
    }
  }
}
