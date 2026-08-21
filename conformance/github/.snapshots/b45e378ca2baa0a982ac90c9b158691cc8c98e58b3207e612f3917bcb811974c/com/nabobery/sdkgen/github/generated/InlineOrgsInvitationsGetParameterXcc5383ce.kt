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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/get/parameters/3/schema
 */
@Serializable(with = InlineOrgsInvitationsGetParameterXcc5383ce.Serializer::class)
public sealed class InlineOrgsInvitationsGetParameterXcc5383ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsInvitationsGetParameterXcc5383ce() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsInvitationsGetParameterXcc5383ce() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `direct_member`.
   */
  public data object DirectMember : InlineOrgsInvitationsGetParameterXcc5383ce() {
    public override val `value`: String = "direct_member"
  }

  /**
   * Documented value. Wire value: `billing_manager`.
   */
  public data object BillingManager : InlineOrgsInvitationsGetParameterXcc5383ce() {
    public override val `value`: String = "billing_manager"
  }

  /**
   * Documented value. Wire value: `hiring_manager`.
   */
  public data object HiringManager : InlineOrgsInvitationsGetParameterXcc5383ce() {
    public override val `value`: String = "hiring_manager"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsInvitationsGetParameterXcc5383ce()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsInvitationsGetParameterXcc5383ce = when (value) {
      All.value -> All
      Admin.value -> Admin
      DirectMember.value -> DirectMember
      BillingManager.value -> BillingManager
      HiringManager.value -> HiringManager
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsInvitationsGetParameterXcc5383ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsInvitationsGetParameterXcc5383ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsInvitationsGetParameterXcc5383ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInvitationsGetParameterXcc5383ce) {
      encoder.encodeString(value.value)
    }
  }
}
