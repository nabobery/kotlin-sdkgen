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
 * Type of the task creator
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/200/content/application~1js
 * on/schema/properties/tasks/items/properties/creator_type
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac = when (value) {
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonTasksItemCreatorTypeX380c91ac) {
      encoder.encodeString(value.value)
    }
  }
}
