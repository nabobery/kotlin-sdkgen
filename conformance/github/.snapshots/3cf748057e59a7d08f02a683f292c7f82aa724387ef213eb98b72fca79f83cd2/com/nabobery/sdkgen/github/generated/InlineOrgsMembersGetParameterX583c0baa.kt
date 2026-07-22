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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1members/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1members/get/parameters/2/schema
 */
@Serializable(with = InlineOrgsMembersGetParameterX583c0baa.Serializer::class)
public sealed class InlineOrgsMembersGetParameterX583c0baa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsMembersGetParameterX583c0baa() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineOrgsMembersGetParameterX583c0baa() {
    public override val `value`: String = "admin"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineOrgsMembersGetParameterX583c0baa() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMembersGetParameterX583c0baa()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMembersGetParameterX583c0baa = when (value) {
      All.value -> All
      Admin.value -> Admin
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsMembersGetParameterX583c0baa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsMembersGetParameterX583c0baa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMembersGetParameterX583c0baa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMembersGetParameterX583c0baa) {
      encoder.encodeString(value.value)
    }
  }
}
