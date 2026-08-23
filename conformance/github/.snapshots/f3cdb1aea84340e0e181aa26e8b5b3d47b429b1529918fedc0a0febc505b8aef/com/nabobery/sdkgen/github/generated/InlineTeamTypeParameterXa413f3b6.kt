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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/team-type/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/team-type/schema
 */
@Serializable(with = InlineTeamTypeParameterXa413f3b6.Serializer::class)
public sealed class InlineTeamTypeParameterXa413f3b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineTeamTypeParameterXa413f3b6() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamTypeParameterXa413f3b6() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamTypeParameterXa413f3b6() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamTypeParameterXa413f3b6()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamTypeParameterXa413f3b6 = when (value) {
      All.value -> All
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamTypeParameterXa413f3b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineTeamTypeParameterXa413f3b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamTypeParameterXa413f3b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamTypeParameterXa413f3b6) {
      encoder.encodeString(value.value)
    }
  }
}
