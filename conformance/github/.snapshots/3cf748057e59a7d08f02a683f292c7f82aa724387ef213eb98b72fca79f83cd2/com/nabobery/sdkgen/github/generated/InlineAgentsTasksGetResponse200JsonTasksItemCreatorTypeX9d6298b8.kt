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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks/get/responses/200/content/application~1json/schema/properties/tas
 * ks/items/properties/creator_type
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8.Serializer::class)
public sealed class InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8() {
    public override val `value`: String = "user"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8 = when (value) {
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonTasksItemCreatorTypeX9d6298b8) {
      encoder.encodeString(value.value)
    }
  }
}
