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
 * sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/answer_chosen_by/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/answer_chosen_by/properties/type
 */
@Serializable(with = InlineDiscussionAnswerChosenByTypeXf3706e59.Serializer::class)
public sealed class InlineDiscussionAnswerChosenByTypeXf3706e59 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineDiscussionAnswerChosenByTypeXf3706e59() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineDiscussionAnswerChosenByTypeXf3706e59() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineDiscussionAnswerChosenByTypeXf3706e59() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscussionAnswerChosenByTypeXf3706e59()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscussionAnswerChosenByTypeXf3706e59 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDiscussionAnswerChosenByTypeXf3706e59> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDiscussionAnswerChosenByTypeXf3706e59", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscussionAnswerChosenByTypeXf3706e59 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscussionAnswerChosenByTypeXf3706e59) {
      encoder.encodeString(value.value)
    }
  }
}
