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
 * The ownership type of the team
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-simple/properties/type
 */
@Serializable(with = InlineTeamSimpleTypeX9834c6db.Serializer::class)
public sealed class InlineTeamSimpleTypeX9834c6db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineTeamSimpleTypeX9834c6db() {
    public override val `value`: String = "enterprise"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineTeamSimpleTypeX9834c6db() {
    public override val `value`: String = "organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTeamSimpleTypeX9834c6db()

  public companion object {
    public fun fromValue(`value`: String): InlineTeamSimpleTypeX9834c6db = when (value) {
      Enterprise.value -> Enterprise
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTeamSimpleTypeX9834c6db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineTeamSimpleTypeX9834c6db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTeamSimpleTypeX9834c6db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTeamSimpleTypeX9834c6db) {
      encoder.encodeString(value.value)
    }
  }
}
