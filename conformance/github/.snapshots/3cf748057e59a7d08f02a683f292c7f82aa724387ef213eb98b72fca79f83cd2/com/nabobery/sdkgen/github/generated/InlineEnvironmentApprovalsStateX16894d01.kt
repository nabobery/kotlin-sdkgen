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
 * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/environment-approvals/properties/state
 */
@Serializable(with = InlineEnvironmentApprovalsStateX16894d01.Serializer::class)
public sealed class InlineEnvironmentApprovalsStateX16894d01 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineEnvironmentApprovalsStateX16894d01() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineEnvironmentApprovalsStateX16894d01() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineEnvironmentApprovalsStateX16894d01() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnvironmentApprovalsStateX16894d01()

  public companion object {
    public fun fromValue(`value`: String): InlineEnvironmentApprovalsStateX16894d01 = when (value) {
      Approved.value -> Approved
      Rejected.value -> Rejected
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnvironmentApprovalsStateX16894d01> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnvironmentApprovalsStateX16894d01", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnvironmentApprovalsStateX16894d01 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnvironmentApprovalsStateX16894d01) {
      encoder.encodeString(value.value)
    }
  }
}
