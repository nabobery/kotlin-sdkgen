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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/1/schema
 */
@Serializable(with = InlineAdvisoriesGetParameterXc0ca6916.Serializer::class)
public sealed class InlineAdvisoriesGetParameterXc0ca6916 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reviewed`.
   */
  public data object Reviewed : InlineAdvisoriesGetParameterXc0ca6916() {
    public override val `value`: String = "reviewed"
  }

  /**
   * Documented value. Wire value: `malware`.
   */
  public data object Malware : InlineAdvisoriesGetParameterXc0ca6916() {
    public override val `value`: String = "malware"
  }

  /**
   * Documented value. Wire value: `unreviewed`.
   */
  public data object Unreviewed : InlineAdvisoriesGetParameterXc0ca6916() {
    public override val `value`: String = "unreviewed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdvisoriesGetParameterXc0ca6916()

  public companion object {
    public fun fromValue(`value`: String): InlineAdvisoriesGetParameterXc0ca6916 = when (value) {
      Reviewed.value -> Reviewed
      Malware.value -> Malware
      Unreviewed.value -> Unreviewed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAdvisoriesGetParameterXc0ca6916> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterXc0ca6916", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdvisoriesGetParameterXc0ca6916 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdvisoriesGetParameterXc0ca6916) {
      encoder.encodeString(value.value)
    }
  }
}
