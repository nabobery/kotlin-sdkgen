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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/user/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/user/properties/type
 */
@Serializable(with = InlineDiscussionUserTypeX228c4213.Serializer::class)
public sealed class InlineDiscussionUserTypeX228c4213 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineDiscussionUserTypeX228c4213() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineDiscussionUserTypeX228c4213() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineDiscussionUserTypeX228c4213() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscussionUserTypeX228c4213()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscussionUserTypeX228c4213 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDiscussionUserTypeX228c4213> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDiscussionUserTypeX228c4213", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscussionUserTypeX228c4213 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscussionUserTypeX228c4213) {
      encoder.encodeString(value.value)
    }
  }
}
