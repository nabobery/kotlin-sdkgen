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
 * The ownership type of the team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-team-simple/properties/type
 */
@Serializable(with = InlineNullableTeamSimpleTypeX5d0e9585.Serializer::class)
public sealed class InlineNullableTeamSimpleTypeX5d0e9585 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineNullableTeamSimpleTypeX5d0e9585() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineNullableTeamSimpleTypeX5d0e9585() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableTeamSimpleTypeX5d0e9585()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableTeamSimpleTypeX5d0e9585 = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableTeamSimpleTypeX5d0e9585> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableTeamSimpleTypeX5d0e9585", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableTeamSimpleTypeX5d0e9585 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableTeamSimpleTypeX5d0e9585) {
      encoder.encodeString(value.value)
    }
  }
}
