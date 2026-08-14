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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/0/properties/creator_type
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24 = when (value) {
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf1CreatorTypeXec3acd24) {
      encoder.encodeString(value.value)
    }
  }
}
