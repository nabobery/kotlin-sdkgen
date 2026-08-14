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
 * The options are:
 * **For a non-nested team:**
 * * `secret` - only visible to organization owners and members of this team.
 * * `closed` - visible to all members of this organization.
 * **For a parent or child team:**
 * * `closed` - visible to all members of this organization.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1teams~1{team_id}/patch/requestBody/content/application~1json/schema/properties/
 * privacy
 */
@Serializable(with = InlineTeamsPatchRequestJsonPrivacyXaad85019.Serializer::class)
public sealed class InlineTeamsPatchRequestJsonPrivacyXaad85019 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineTeamsPatchRequestJsonPrivacyXaad85019() {
    public override val `value`: String = "secret"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineTeamsPatchRequestJsonPrivacyXaad85019() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamsPatchRequestJsonPrivacyXaad85019()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamsPatchRequestJsonPrivacyXaad85019 = when (value) {
      Secret.value -> Secret
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamsPatchRequestJsonPrivacyXaad85019> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineTeamsPatchRequestJsonPrivacyXaad85019", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamsPatchRequestJsonPrivacyXaad85019 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamsPatchRequestJsonPrivacyXaad85019) {
      encoder.encodeString(value.value)
    }
  }
}
