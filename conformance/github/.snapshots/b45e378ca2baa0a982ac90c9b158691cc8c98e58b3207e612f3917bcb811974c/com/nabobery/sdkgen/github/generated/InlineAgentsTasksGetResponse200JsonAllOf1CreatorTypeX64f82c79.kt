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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/0/properties/creator_type
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79 = when (value) {
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf1CreatorTypeX64f82c79) {
      encoder.encodeString(value.value)
    }
  }
}
