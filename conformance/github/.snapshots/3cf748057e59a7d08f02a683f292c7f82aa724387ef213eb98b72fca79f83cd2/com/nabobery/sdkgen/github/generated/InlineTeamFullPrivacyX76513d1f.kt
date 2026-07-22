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
 * The level of privacy this team should have
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-full/properties/privacy
 */
@Serializable(with = InlineTeamFullPrivacyX76513d1f.Serializer::class)
public sealed class InlineTeamFullPrivacyX76513d1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineTeamFullPrivacyX76513d1f() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineTeamFullPrivacyX76513d1f() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamFullPrivacyX76513d1f()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamFullPrivacyX76513d1f = when (value) {
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTeamFullPrivacyX76513d1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamFullPrivacyX76513d1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamFullPrivacyX76513d1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamFullPrivacyX76513d1f) {
      encoder.encodeString(value.value)
    }
  }
}
