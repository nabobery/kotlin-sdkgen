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
 * The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact.
 * When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
 * **For a non-nested team:**
 * * `secret` - only visible to organization owners and members of this team.
 * * `closed` - visible to all members of this organization.
 * **For a parent or child team:**
 * * `closed` - visible to all members of this organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams~1{team_slug}/patch/requestBody/content/application~1json/sch
 * ema/properties/privacy
 */
@Serializable(with = InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee.Serializer::class)
public sealed class InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee() {
    public override val `value`: String = "secret"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee = when (value) {
      Secret.value -> Secret
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPatchRequestJsonPrivacyXe89a87ee) {
      encoder.encodeString(value.value)
    }
  }
}
