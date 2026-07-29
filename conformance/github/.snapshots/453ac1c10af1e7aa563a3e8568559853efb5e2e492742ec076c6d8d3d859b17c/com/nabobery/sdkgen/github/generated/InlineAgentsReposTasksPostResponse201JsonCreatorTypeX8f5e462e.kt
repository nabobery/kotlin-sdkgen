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
 * Type of the task creator
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/201/content/application~1j
 * son/schema/properties/creator_type
 */
@Serializable(with = InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e.Serializer::class)
public sealed class InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e = when (value) {
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse201JsonCreatorTypeX8f5e462e) {
      encoder.encodeString(value.value)
    }
  }
}
