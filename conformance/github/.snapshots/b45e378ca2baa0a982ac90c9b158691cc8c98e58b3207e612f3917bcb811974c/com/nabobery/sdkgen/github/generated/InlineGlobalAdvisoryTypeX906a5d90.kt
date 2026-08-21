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
 * The type of advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/type
 */
@Serializable(with = InlineGlobalAdvisoryTypeX906a5d90.Serializer::class)
public sealed class InlineGlobalAdvisoryTypeX906a5d90 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reviewed`.
   */
  public data object Reviewed : InlineGlobalAdvisoryTypeX906a5d90() {
    public override val `value`: String = "reviewed"
  }

  /**
   * Documented value. Wire value: `unreviewed`.
   */
  public data object Unreviewed : InlineGlobalAdvisoryTypeX906a5d90() {
    public override val `value`: String = "unreviewed"
  }

  /**
   * Documented value. Wire value: `malware`.
   */
  public data object Malware : InlineGlobalAdvisoryTypeX906a5d90() {
    public override val `value`: String = "malware"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGlobalAdvisoryTypeX906a5d90()

  public companion object {
    public fun fromValue(`value`: String): InlineGlobalAdvisoryTypeX906a5d90 = when (value) {
      Reviewed.value -> Reviewed
      Unreviewed.value -> Unreviewed
      Malware.value -> Malware
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGlobalAdvisoryTypeX906a5d90> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGlobalAdvisoryTypeX906a5d90", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisoryTypeX906a5d90 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisoryTypeX906a5d90) {
      encoder.encodeString(value.value)
    }
  }
}
