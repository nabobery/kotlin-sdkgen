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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1members/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1members/get/parameters/1/schema
 */
@Serializable(with = InlineOrgsMembersGetParameterX0ec9e8dc.Serializer::class)
public sealed class InlineOrgsMembersGetParameterX0ec9e8dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `2fa_disabled`.
   */
  public data object _2faDisabled : InlineOrgsMembersGetParameterX0ec9e8dc() {
    public override val `value`: String = "2fa_disabled"
  }

  /**
   * Documented value. Wire value: `2fa_insecure`.
   */
  public data object _2faInsecure : InlineOrgsMembersGetParameterX0ec9e8dc() {
    public override val `value`: String = "2fa_insecure"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsMembersGetParameterX0ec9e8dc() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsMembersGetParameterX0ec9e8dc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsMembersGetParameterX0ec9e8dc = when (value) {
      _2faDisabled.value -> _2faDisabled
      _2faInsecure.value -> _2faInsecure
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsMembersGetParameterX0ec9e8dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsMembersGetParameterX0ec9e8dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsMembersGetParameterX0ec9e8dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsMembersGetParameterX0ec9e8dc) {
      encoder.encodeString(value.value)
    }
  }
}
