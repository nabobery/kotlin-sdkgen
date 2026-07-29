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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1memberships~1orgs/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1memberships~1orgs/get/parameters/0/schema
 */
@Serializable(with = InlineUserMembershipsOrgsGetParameterXdb87fa4f.Serializer::class)
public sealed class InlineUserMembershipsOrgsGetParameterXdb87fa4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineUserMembershipsOrgsGetParameterXdb87fa4f() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineUserMembershipsOrgsGetParameterXdb87fa4f() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserMembershipsOrgsGetParameterXdb87fa4f()

  public companion object {
    public fun fromValue(`value`: String): InlineUserMembershipsOrgsGetParameterXdb87fa4f = when (value) {
      Active.value -> Active
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserMembershipsOrgsGetParameterXdb87fa4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserMembershipsOrgsGetParameterXdb87fa4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserMembershipsOrgsGetParameterXdb87fa4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserMembershipsOrgsGetParameterXdb87fa4f) {
      encoder.encodeString(value.value)
    }
  }
}
