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
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items/prope
 * rties/group_members/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items/prope
 * rties/group_members/items/properties/status
 */
@Serializable(with = InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5.Serializer::class)
public sealed class InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5()

  public companion object {
    public fun fromValue(`value`: String): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5 = when (value) {
      InProgress.value -> InProgress
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5) {
      encoder.encodeString(value.value)
    }
  }
}
