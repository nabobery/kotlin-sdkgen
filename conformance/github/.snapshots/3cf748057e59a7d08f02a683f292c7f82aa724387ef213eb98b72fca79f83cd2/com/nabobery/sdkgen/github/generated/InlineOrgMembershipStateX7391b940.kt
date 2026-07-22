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
 * The state of the member in the organization. The `pending` state indicates the user has not yet accepted an
 * invitation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-membership/properties/state
 */
@Serializable(with = InlineOrgMembershipStateX7391b940.Serializer::class)
public sealed class InlineOrgMembershipStateX7391b940 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineOrgMembershipStateX7391b940() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineOrgMembershipStateX7391b940() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgMembershipStateX7391b940()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgMembershipStateX7391b940 = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgMembershipStateX7391b940> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgMembershipStateX7391b940", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgMembershipStateX7391b940 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgMembershipStateX7391b940) {
      encoder.encodeString(value.value)
    }
  }
}
