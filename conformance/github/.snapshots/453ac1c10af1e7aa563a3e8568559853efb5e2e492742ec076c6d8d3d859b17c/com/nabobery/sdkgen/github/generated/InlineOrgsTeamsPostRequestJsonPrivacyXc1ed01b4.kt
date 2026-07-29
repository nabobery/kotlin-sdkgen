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
 * The level of privacy this team should have. The options are:
 * **For a non-nested team:**
 * * `secret` - only visible to organization owners and members of this team.
 * * `closed` - visible to all members of this organization.
 * Default: `secret`
 * **For a parent or child team:**
 * * `closed` - visible to all members of this organization.
 * Default for child team: `closed`
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1teams/post/requestBody/content/application~1json/schema/properties
 * /privacy
 */
@Serializable(with = InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4.Serializer::class)
public sealed class InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4() {
    public override val `value`: String = "secret"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4 = when (value) {
      Secret.value -> Secret
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsTeamsPostRequestJsonPrivacyXc1ed01b4) {
      encoder.encodeString(value.value)
    }
  }
}
