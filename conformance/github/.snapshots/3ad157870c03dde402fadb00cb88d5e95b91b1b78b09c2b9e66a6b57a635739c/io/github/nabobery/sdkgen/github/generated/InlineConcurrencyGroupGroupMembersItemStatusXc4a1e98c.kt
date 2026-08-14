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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group/properties/group_members/items/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group/properties/group_members/items/properties/status
 */
@Serializable(with = InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c.Serializer::class)
public sealed class InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c()

  public companion object {
    public fun fromValue(`value`: String): InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c = when (value) {
      InProgress.value -> InProgress
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConcurrencyGroupGroupMembersItemStatusXc4a1e98c) {
      encoder.encodeString(value.value)
    }
  }
}
