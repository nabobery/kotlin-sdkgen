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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/get/parameters/4/schema
 */
@Serializable(with = InlineOrgsInvitationsGetParameterX70ea36f2.Serializer::class)
public sealed class InlineOrgsInvitationsGetParameterX70ea36f2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsInvitationsGetParameterX70ea36f2() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsInvitationsGetParameterX70ea36f2() {
    public override val `value`: String = "member"
  }

  /**
   * Documented value. Wire value: `scim`.
   */
  public data object Scim : InlineOrgsInvitationsGetParameterX70ea36f2() {
    public override val `value`: String = "scim"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsInvitationsGetParameterX70ea36f2()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsInvitationsGetParameterX70ea36f2 = when (value) {
      All.value -> All
      Member.value -> Member
      Scim.value -> Scim
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsInvitationsGetParameterX70ea36f2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsInvitationsGetParameterX70ea36f2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsInvitationsGetParameterX70ea36f2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInvitationsGetParameterX70ea36f2) {
      encoder.encodeString(value.value)
    }
  }
}
